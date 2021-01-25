/* 20210125 LL*/
import java.util.Scanner;

public class HW0 {
    /* 1. Drawing a Triangle
     * input: an integer of the triangle's rows
     * output: the triangle constructed by "*"

    public static String repeatString(String s, int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < n; i++) {
            str.append(s);
        }
        return str.substring(0, str.length());
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please input an integer of the triangle's rows:");
        int len = in.nextInt();
        int all_len=len;
        while(len-->0){
            System.out.println(repeatString("*",all_len-len+1));
        }
    }
     */
    /*-----------------------------------------------------------------------------
     * 2&3. Returns the maximum value from m.
     * input: the length of the array, an array of n integers
     * output: the maximun one of all

    public static int max(int[] m) {
        Integer max_num= new Integer(m[0]);
        for(int i=0;i<m.length;i++){
            if(max_num<m[i]) {
                max_num = m[i];
            }
        }
        return max_num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the length of the array:");
        int len = in.nextInt();
        int[] numbers = new int[len];
        System.out.print("please input an array of n integers:");
        for(int i=0;i<len;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println(max(numbers));
    }
     */

    /*-----------------------------------------------------------------------------
     * 4.Write a function that replaces each positive a[i] with the sum of a[i] through a[i + n]
     * input: the length of the array, an array of n integers, n
     * output: an array of the added numbers

    public static void windowPosSum(int[] num, int n) {
        for(int i=0;i<num.length;i++){
            if(num[i]<=0){
                continue;
            }
            else{
                for(int j=1;j<=n;j++){
                    if(i+j>num.length-1){
                        break;
                    }
                    num[i]+=num[i+j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please input the length of the array:");
        int len = in.nextInt();
        int[] numbers = new int[len];
        System.out.print("please input an array of n integers:");
        for(int i=0;i<len;i++){
            numbers[i]=in.nextInt();
        }
        System.out.print("please input n represent next n integers to add:");
        int n=in.nextInt();
        windowPosSum(numbers, n);
        System.out.println(java.util.Arrays.toString(numbers));
    }
     */
}


