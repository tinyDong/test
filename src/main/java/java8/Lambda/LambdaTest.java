package java8.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class LambdaTest {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            Student s=new Student(""+i,new Random().nextInt());
            students.add(s);
        }
//        List<Integer> names = Arrays.asList(4, 2, 5, 1);
        //[anna, mike, peter, xenia]
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);


    }
}
