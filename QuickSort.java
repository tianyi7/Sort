/**
 * Author: tianyi
 * Time: 2017/9/5
 * Question:快速排序
 * Source:
 */
import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int low=0;
        int high=a.length-1;

         quickSort(a,low,high);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high) {
            int i = low;
            int j = high;
            int x = arr[i];
            while (i < j) {
                while (i < j && arr[j] > x) {
                    j--;
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && arr[i] < x) {
                    i++;
                }
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            arr[i] = x;
            quickSort(arr, low, i - 1);
            quickSort(arr, i + 1, high);
        }
    }
}
