package testdemo.one;

import java.util.Arrays;
import java.util.Random;
/**
 * 
 * @author Noedge
 *给定一个正整数数组，随机取出一个数，要求数值越大的数被被取出的概率越大。
 *博客地址：http://blog.csdn.net/noedge/article/details/78282226
 */
public class One {
    public static void main(String[] args) {
        System.out.println(getItem(new int[]{4,2,3,1}));
    }
    public static int getItem(int arr[]) {
        Arrays.sort(arr);
        int sum = 0 ;
        for(int i = 1 ; i <= arr.length ; i++) {
            sum += i;
        }
        int b[] = new int[sum];
        for(int i = 0,index = 0 ; i < b.length ; index++,i += index) {
            for(int j = i ; j < i + index + 1 ; j ++) {
                b[j] = arr[index];
            }
        }
        Random random = new Random();

        return b[random.nextInt(sum)];
    }
}