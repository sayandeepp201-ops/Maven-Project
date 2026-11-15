package com.maven_firstproject;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
public class App 
{
    static class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        String json=gson.toJson(new Person("Jharves", 20));
        System.out.println(json);
        System.out.println(StringUtils.capitalize("hello world"));
    }
}
