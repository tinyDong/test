package main.java8.PredicateTest;

import main.reflect.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest predicateTest = new PredicateTest();
        //输出大于5的数字
//        List<Integer> result = predicateTest.conditionFilter(list, integer -> integer > 5|| integer<3);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//        //输出大于等于5的数字
//        result = predicateTest.conditionFilter(list, integer -> integer >= 5);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//        //输出小于8的数字
//        result = predicateTest.conditionFilter(list, integer -> integer < 8);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//        //输出所有数字
//        result = predicateTest.conditionFilter(list, integer -> true);
//        result.forEach(System.out::println);
//        System.out.println("-------");

        List<Integer> result1=list.stream().filter(integer -> integer>3&&integer<9).collect(Collectors.toList());
        System.out.println(Arrays.toString(result1.toArray()));

        User user=new User();
        user.setName("l1d");
        user.setAge(123);
        Optional.of(user).filter(user1 -> user1.getName().equals("lxd")).ifPresent(user1 -> System.out.println(user1.getAge()));
    }
    //高度抽象的方法定义，复用性高
    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
