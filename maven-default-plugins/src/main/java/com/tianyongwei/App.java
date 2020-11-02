package com.tianyongwei;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Log log = LogFactory.getLog(App.class);
        log.info("hello,log!");
//        System.out.println( "Hello World!" );
    }

    public int add(int  ...nums) {
        int sum = 0;
        for (int num :
                nums) {
            sum += num;
        }
        return sum;
    }
}
