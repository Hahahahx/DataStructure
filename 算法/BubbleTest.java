package 算法;

import java.util.Arrays;

/**
 * BubbleTest 冒泡排序
 */
public class BubbleTest {

    public static void bubbleSort(int[] arr){
        for(int i = arr.length -1; i>0 ; i--){
            for( int j = 0; j< i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,5,2,3,7,9,6,4,8,0};
        BubbleTest.bubbleSort(a);

        Arrays.stream(a).forEach(item -> {
            System.out.println(item);
        });

        // Arrays.stream(a).forEach(System.out::println);
    }
}