package main.sort;

public class SortTest {

    public static Integer[] testArr = new Integer[]{0, 1, 13, 25, 36, 17, 18, 2};



    public static void main(String[] args) {
        bubbleTest(testArr);
//        quickSort(testArr, 0, testArr.length-1);
        for (Integer s : testArr) {
            System.out.println(s);
        }
    }


    static void bubbleTest(Integer[] nums) {
        for (int i =0 ; i<nums.length;i++){
            for (int j =0 ;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }

    static void quickSort(Integer[] nums, int start, int end) {
        if (end>start){
            int i = start;
            int j = end;
            Integer base = nums[start];
            while (i<j){
                while (nums[i]<base&&i<end){
                    i++;
                }
                while (nums[j]>base&&j>start){
                    j--;
                }
                if (j>=i){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i++;
                    j--;
                }
                if (i<end){
                    quickSort(nums,i,end);
                }
                if (j>start){
                    quickSort(nums,start,j);
                }
            }
        }
    }
}
