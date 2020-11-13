package com.tianyongwei.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

@JsonIgnoreProperties(value = "name", allowSetters = false, allowGetters = true)
public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException {
        final String json = "{\"age\":12,\"name\":\"john\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        Person deserialized = objectMapper.readValue(json, Person.class);

        System.out.println(deserialized);

        deserialized.setName("newname");
        String string = objectMapper.writeValueAsString(deserialized);
        System.out.println(string);
    }
}