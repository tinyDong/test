package algorithm.sort;

import java.util.Arrays;

public class SortTest {

    public static Integer[] testArr = new Integer[]{10, 1, 13,36, 25,  18,17,  2};


    public static void main(String[] args) {
//        bubbleTest(testArr);
        quickSort(testArr, 0, testArr.length - 1);
        System.out.println(Arrays.toString(testArr));
    }

    private static void quickSort(Integer[] arr, int low, int high) {
        System.out.println("low"+low+" hith="+high+"   result="+Arrays.toString(arr));
        //1,找到递归算法的出口
        if (low > high) {
            return;
        }
        //2, 存
        int i = low;
        int j = high;
        //3,key
        int key = arr[low];
        System.out.println("key ="+key);
        //4，完成一趟排序
        while (i < j) {
            //4.1 ，从右往左找到第一个小于key的数
            while (i < j && arr[j] > key) {
                j--;
            }
            // 4.2 从左往右找到第一个大于key的数
            while (i < j && arr[i] <= key) {
                i++;
            }
            //4.3 交换
            if (i < j) {
                int p = arr[i];
                arr[i] = arr[j];
                arr[j] = p;
                System.out.println("change_result="+Arrays.toString(arr));
            }
        }
        System.out.println("i==="+i);
//         4.4，调整key的位置
        int p = arr[i];
        arr[i] = arr[low];
        arr[low] = p;
        System.out.println("调整key"+Arrays.toString(arr));
        //5, 对key左边的数快排
        quickSort(arr, low, i - 1);
        //6, 对key右边的数快排
        quickSort(arr, i + 1, high);
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

