package main.sort;

public class SortTest {

    public static Integer[] testArr = new Integer[]{0, 1, 13, 25, 36, 17, 18, 2};



    public static void main(String[] args) {
//        bubbleTest(testArr);
        quickSort(testArr, 0, testArr.length-1);
        for (Integer s : testArr) {
            System.out.println(s);
        }
    }

    private static void quickSort(Integer[] numbers, int start, int end) {
        int base = numbers[start];
        int i =start;
        int j =end;
        if (j>i){
            while (base>numbers[i]&&i<end){
                i++;
            }
            while (base<numbers[j]&&j>start){
                j--;
            }
            if (i<j){
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                i++;
                j--;
            }
            if (i<end){
                quickSort(numbers,i,end);
            }
            if (j>start){
                quickSort(numbers,start,j);
            }
        }
    }


//    public static void bubbleTest(Integer[] numbers){
//        for (int i = 0;i<numbers.length;i++){
//            for (int j=0 ; j<numbers.length-i-1;j++){
//                if (numbers[j]>numbers[j+1]){
//                    int temp=numbers[j];
//                    numbers[j]=numbers[j+1];
//                    numbers[j+1]=temp;
//                }
//            }
//        }
//    }

}
