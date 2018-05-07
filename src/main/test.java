package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class test {
    public static void test(){
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List arr1=arr.subList(1,2);
        arr1.add(4);
        arr1.remove(0);
        System.out.println(arr);
        System.out.println(arr1);
    }

    public static void main(String[] args) {
//        test();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动");
            }
        });
        t1.start();

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
