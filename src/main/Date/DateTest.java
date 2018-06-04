package main.Date;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfWeek());

        Date da = new Date();
        //注意：这个地方da.getTime()得到的是一个long型的值
        System.out.println(da.getTime());

        //由日期date转换为timestamp
        System.out.println("123123");
        //第一种方法：使用new Timestamp(long)
        Timestamp t = new Timestamp(new Date().getTime());
        System.out.println(t);
        System.out.println(t);
    }
}
