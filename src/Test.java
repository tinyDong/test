import java.util.*;

public class Test {

    public interface IAdd {
        void add(int number);
        void addAll(int[] numbers);
    }

    public abstract class AbstractAdder implements IAdd {
        @Override
        public void addAll(int[] numbers) {
            for(int num : numbers){
                add(num);
            }
        }
    }

    public class Base extends AbstractAdder {
        private static final int MAX_NUM = 1000;
        private int[] arr = new int[MAX_NUM];
        private int count;

        @Override
        public void add(int number){
            if(count<MAX_NUM){
                arr[count++] = number;
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Test{");
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(11L-12L);

    }

    private void test1(Integer s){

        System.out.println(super.toString());
        System.out.println(toString());
    }

}
