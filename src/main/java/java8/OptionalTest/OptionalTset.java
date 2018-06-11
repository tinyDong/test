package java8.OptionalTest;



import java.util.Optional;

public class OptionalTset {
    public static void main(String[] args) {
//        User u=new User();
//        u.setAge(11);
//        u.setName("lxd");
//        Optional.ofNullable(u).ifPresent(user -> System.out.println(u.getAge()));


        Integer i=null;
        System.out.println(Optional.ofNullable(i).orElse(3));
    }
}
