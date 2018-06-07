package main.java8.OptionalTest;

import main.reflect.User;

import java.util.Optional;

public class OptionalTset {
    public static void main(String[] args) {
        User u=new User();
        u.setAge(11);
        u.setName("lxd");
        Optional.ofNullable(u).ifPresent(user -> System.out.println(u.getAge()));
    }
}
