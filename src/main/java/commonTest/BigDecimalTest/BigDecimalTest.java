package commonTest.BigDecimalTest;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("1.25112357");
        System.out.println("执行数值：" + b.toString());
        BigDecimal b1= b.setScale(6, BigDecimal.ROUND_HALF_UP);
        System.out.println("执行数值：" + b1.toString());
    }
}
