package java8.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public static <E> List<E> filter(List<E> list, Predicate<E> pred) {
        List<E> retList = new ArrayList<>();
        for (E e : list) {
            if (pred.test(e)) {
                retList.add(e);
            }
        }
        return retList;
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> retList = new ArrayList<>(list.size());
        for (T e : list) {
            retList.add(mapper.apply(e));
        }
        return retList;
    }

    public static String getCollegeName(){
        return "Laoma School";
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("zhangsan", 89),
                new Student("lisi", 89),
                new Student("wangwu", 98));

//        List<Student> above90=students.stream().filter(t->t.getScore()>90).collect(Collectors.toList());
//
//        List<String> nameList=students.stream().map(Student::getName).collect(Collectors.toList());
//
//        List<String> nameList1=students.stream().filter(t->t.getScore()>90).map(Student::getName).collect(Collectors.toList());
        students.stream().filter(student -> student.getScore()>90).forEach(student -> System.out.println(student.getName()));
    }
}
