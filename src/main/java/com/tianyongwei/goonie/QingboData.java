package com.tianyongwei.goonie;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Base64;
import java.util.TreeMap;

public class QingboData {
  private static final String APP_KEY = "97903bdd3a3d160c2e7cebe88cea775e";
  private static final String APP_SECRET = "4ae56fec774324e8d44f96d8175cd5a4";

  public static void main(String[] args) {
//    groupAdd("我的微信分组1");
//    groupList();
//    weixinBiz("十点读书");
    month("117379", "20190811");
//    month("117379", "201907");
//    week("117379","20181006_20180930");
  }

  public static void month(String groupId, String date) {
    String router = "/myrank/weixin/month";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("group_id", groupId);
    param.put("rank_date", date);
    post(router, param);
  }

  public static void week(String groupId, String date) {
    String router = "/myrank/weixin/week";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("group_id", groupId);
    param.put("rank_date", date);
    post(router, param);
  }

  public static void day(String groupId, String date) {
    String router = "/myrank/weixin/day";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("group_id", groupId);
    param.put("rank_date", date);
    post(router, param);
  }

  public static void weixinBiz(String nickname) {
    String router = "/account/weixin/search";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("wx_nickname", nickname);
    post(router, param);
  }

  public static void groupList() {
    String router = "/myrank/weixin/group-list";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    post(router, param);
  }

  public static void groupAdd(String groupName) {
    String router = "/myrank/weixin/group-add";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("group_name", groupName);
    post(router, param);
  }

  public static void groupWeixinAdd(String groupId, String accountId) {
    String router = "/myrank/weixin/acct-add";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("group_id", groupId);
    param.put("account_id", accountId);
    post(router, param);
  }

  public static void groupWeixinDel(String groupId, String accountId) {
    String router = "/myrank/weixin/acct-del";
    TreeMap<String, Object> param = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    param.put("group_id", groupId);
    param.put("account_id", accountId);
    post(router, param);
  }

  public static void post(String router, TreeMap<String, Object> map) {
    StringBuilder paramBuilder = new StringBuilder();
    StringBuilder urlParam = new StringBuilder();
    map.forEach((key, value) -> {
      paramBuilder.append(key + value);
      urlParam.append(key + "=" + value + "&");
    });
    String access_token = getAccessToken(paramBuilder.toString(), router);
    CloseableHttpClient httpclient = HttpClients.createDefault();
    String url_str = "http://databus.gsdata.cn:8888/api/service?" + (urlParam.toString().contains("&") ? urlParam.toString().substring(0, urlParam.toString().lastIndexOf("&")) : "");
    HttpPost httpPost = new HttpPost(url_str);
    httpPost.addHeader(new BasicHeader("access-token", access_token));
    httpPost.addHeader("access-token", access_token);
    CloseableHttpResponse response = null;
    try {
      //执行请求
      response = httpclient.execute(httpPost);
      //请求体内容
      String content = EntityUtils.toString(response.getEntity(), "UTF-8");
      System.err.println("内容：" + content);
    } catch (ClientProtocolException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (response != null) {
        try {
          response.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      //相当于关闭浏览器
      try {
        httpclient.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static String getAccessToken(String paramStr, String router) {
    // 1. sign
    String A = APP_SECRET + "_" + paramStr + "_" + APP_SECRET;
    System.err.println(A);
    String sign = DigestUtils.md5Hex(A);
    System.err.println("sign: " + sign);

    // 2. access-token
    String access_token = new String(Base64.getEncoder().encode((APP_KEY + ":" + sign + ":" + router).getBytes()));
    System.err.println("access_token: " + access_token);
    return access_token;
  }
}
