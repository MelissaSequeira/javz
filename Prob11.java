import java.lang.*;
import java.util.*;

public class Prob11 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N= sc.nextInt();
                int[] arr =new int[N];
                for(int i=0; i<N; i++){
                    arr[i]=sc.nextInt();
                }         
                int[] sqArr=new int[N];
                for(int i=0; i<N; i++){
                    sqArr[i]=arr[i]*arr[i];
                } 
                for(int i=0; i<N; i++){
                    System.out.print(sqArr[i]);
                    System.out.print(" ");
                } 
            }
        }  