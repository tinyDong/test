package others;

public class money {

    public static void borrow(){
//        36500 * 13.8 = 5037


        double totalMoney = 36500;

        double returnMoney = 3164;

        double totalInterest =0D;
        for (int i = 0; i < 11; i++) {
            double interest =(totalMoney-returnMoney * i )* 0.01;
            System.out.println("第"+i+"月" + "利息:" + interest);
            totalInterest = totalInterest +interest;
        }

        System.out.println("总利息 == "+totalInterest);
    }

    public static void borrow1(){
//        36500 * 13.8 = 5037


        double totalMoney = 36500;

        double totalInterest =0D;
        for (int i = 0; i < 11; i++) {
            double interest =totalMoney * 0.01;
            System.out.println("第"+i+"月" + "利息:" + interest);
            totalInterest = totalInterest +interest;
        }

        System.out.println("总利息 == "+totalInterest);
    }

    public static void main(String[] args) {
        money.borrow();
        money.borrow1();

//        Collections.sort();
    }
}
