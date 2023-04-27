package kr.hs.study.beans;

import org.springframework.stereotype.Component;

// @Component 같은 타입 객체 만들어야해서 붙이면 안된다
public class Person {

    String name;
    int age;
    String nickname;

    public Person(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public void go(){
        System.out.println("가다");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }
}
