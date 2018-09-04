package ServletTest;

public class ServletTest {
    public static void main(String[] args) {
////        〔贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1〕
//        1000 * 1.01 * 30 + 1000 * 1.1*29
        double totalMoney=0L;
        for (int i = 300; i >0; i--) {

            double monthMoney = 1000 * Math.pow(1.008,i);
            System.out.println(monthMoney);
            totalMoney=totalMoney+monthMoney;
        }
        System.out.println("result  = "+totalMoney);


//        int i=1;
//        Integer x =1;
//        System.out.println(Objects.equals(i,x));

    }
}
