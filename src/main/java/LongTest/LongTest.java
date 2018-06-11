package LongTest;

import java.math.BigDecimal;

public class LongTest {

    /**金额为分的格式 */
    public static final String CURRENCY_FEN_REGEX = "\\-?[0-9]+";

    public static void main(String[] args) throws Exception {
        Long l1=123132L;
        String yuan=LongTest.changeF2Y(l1);
        System.out.println(yuan);
    }

    public static String changeF2Y(Long amount) throws Exception{
        return BigDecimal.valueOf(amount).divide(new BigDecimal(100)).toString();
    }
}
