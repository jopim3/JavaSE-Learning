package com.test.entity;

import java.sql.SQLOutput;
import java.util.Objects;

public  class Person   implements Study{
 public String name = "我是人类";
 int age;
 String gender;



 public Person(String name, int age, String gender) {
  this.name = name;
  this.age = age;
  this.gender = gender;
 }


 @Override
 public String toString() {
  return "Person{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", gender='" + gender + '\'' +
          '}';
 }
}

