// //sum of n numbers
// import java.lang.*;
// import java.util.*;

// // public class Prob8 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner (System.in);
// //         int N = sc.nextInt();
// //         int sum=0;
// //         for (int i=1; i<=N ;i++){
// //             sum =sum + i;
        
// //         }
// //         System.out.println(sum);
// //     }
// // }
// // import java.lang.*;
// // import java.util.*;

// // public class Prob8 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n1 = sc.nextInt();
// //         int n2 = sc.nextInt();
// //         int gcd=1;
// //         for(int i=1; i<=n1 && i<=n2; i++){
// //             if(n1%i==0 && n2%i==0){
// //                 gcd=i;
// //             }
// //         }
// //         int lcm= (int)(n1*n2)/gcd;
// //         System.out.println(lcm);
// //         }
// //     }

// // public class Prob8 {
// //         public static void main(String[] args) {
// //             Scanner sc = new Scanner(System.in);
// //             System.out.println("Enter the number of elements:");
// //             int N= sc.nextInt();
// //             int[] arr =new int[N];
// //             for(int i=0; i<5; i++){
// //                 arr[i]=sc.nextInt();
// //             }
// //             System.out.println("Element to be found:");
// //             int x=sc.nextInt();
// //             int ans=-1;
// //             for (int i=0;i<N;i++){
// //                 if(arr[i]==x){
// //                     ans=i;
                    
// //                 }
// //             }
// //             System.out.println(ans);

// //         }
// //     }
// // public class Prob8 {
// //             public static void main(String[] args) {
// //                 Scanner sc = new Scanner(System.in);
// //                 int N= sc.nextInt();
// //                 int[] arr =new int[N];
// //                 for(int i=0; i<N; i++){
// //                     arr[i]=sc.nextInt();
// //                 }         
// //                 int[] sqArr=new int[N];
// //                 for(int i=0; i<N; i++){
// //                     sqArr[i]=arr[i]*arr[i];
// //                 } 
// //                 for(int i=0; i<N; i++){
// //                     System.out.print(sqArr[i]);
// //                     System.out.print(" ");
// //                 } 
// //             }
// //         }   
// // public class Prob8 {
// //                 public static void main(String[] args) {
// //                     Scanner sc = new Scanner(System.in);
// //                     System.out.print("Number of ele in arr1: ");
// //                     int N1= sc.nextInt();
// //                     int[] arr1 =new int[N1];
// //                     System.out.print("elements in arr1: ");
// //                 for(int i=0; i<N1; i++){
// //                     arr1[i]=sc.nextInt();
// //                 }     
// //                 System.out.print(" Number of ele in aar2:");
// //                 int N2= sc.nextInt();    
// //                 int[] arr2=new int[N2];
// //                 System.out.print("elements in arr2: ");
// //                 for(int i=0; i<N2; i++){
// //                     arr2[i]=sc.nextInt();
// //                 } 
// //                 int N3=N1+N2;
// //                 int[] arr3= new int[N3];
// //                 int k=0;
// //                 for(int i=0; i<N1 ;i++){
// //                     for(int j=0; j<N2; j++){
// //                         if(arr2[j]==arr1[i]){
// //                             arr3[k]=arr2[j];
// //                             k++;
// //                         }
// //                     }
// //                 }
// //                 System.out.print(" Result :" );
// //                 for(int i=0; i<arr3.length;i++){
// //                     System.out.print(arr3[i]);
// //                     System.out.print(" ");
// //                 }
// //                 }
// //             }
// // public class Prob8 {
// //                     public static void main(String[] args) {
// //                         Scanner sc = new Scanner(System.in);
// //                         System.out.print("Number of ele in arr: ");
// //                         int N= sc.nextInt();
// //                         int[] arr = new int[N];
// //                         for(int i=0; i<N ;i++){
// //                             arr[i] = sc.nextInt();
// //                         }
// //                         int max=arr[0];
// //                         int min=arr[0];
// //                         for(int i=0;i<N;i++){
// //                             if(arr[i]>max){
// //                                 max=arr[i];
// //                             }
// //                             if(arr[i]<min){
// //                                 min=arr[i];
// //                             }
// //                         }
// //                         System.out.println("Maximum:"+max);
// //                         System.out.println("Maximum:"+min);
// //                     }
// // //                 }
// // public class Prob8 {
// //                         public static void main(String[] args) {
// //                             Scanner sc = new Scanner(System.in);
// //                             System.out.print("Number of ele in arr: ");
// //                             int N= sc.nextInt();
// //                             int[] arr = new int[N];
// //                             int[] rarr = new int[N];
// //                             for(int i=0; i<N ;i++){
// //                                 arr[i] = sc.nextInt();
// //                                 }
// //                             int j=0;
// //                             for(int i=N-1; i>=0 ;i--){
// //                                 rarr[j]=arr[i];
// //                                 j++;
// //                                     }
// //                                     for(int i=0; i<rarr.length;i++){
// //                                         System.out.print(rarr[i]);
// //                                         System.out.print(" ");
// //                                     }
// //                         }
// //                     }
// // public class Prob8 {
// //                         public static void main(String[] args) {
// //                             Scanner sc = new Scanner(System.in);
// //                             System.out.print("String: ");
// //                             String str1= sc.next();
// //                             String rstr="";
// //                             int N=str1.length();
// //                             for(int i=N-1;i>=0;i--)
// //                             {
// //                                 rstr=rstr+str1.charAt(i);
                                
// //                             }
// //                             System.out.println(rstr);
// //                         }
// //                     }
// // public class Prob8 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("String: ");
// //         String str1= sc.next();
// //         String rstr="";
// //         int N=str1.length();
// //         StringBuilder sb= new StringBuilder(str1);
// //         sb.reverse();
// //         String str2 =sb.toString();
// //         System.out.println(rstr);
// //             if(str1==str2){
// // System.out.println("Palindrome");
// //             }
// //             else{
// //                 System.out.println("Not a Palindrome"); 
// //             }
// //     }
// // }

// // public static String change_char(String s) {
// //     // complete the function template
// //     // Scanner sc= new Scanner(System.in);
// //     // String s=sc.next();
// //     StringBuilder sb =new StringBuilder(s);
// //     char c1= sb.charAt(0);
// //     for(int i=1;i<s.length();i++){
// //         if(s.charAt(i)==c1){
// //             sb.setCharAt(i,'$');
// //         }

// //     }
// //     return sb.toString();
// // }


// // public class Solution {
//     public int solve(String A) {
//         StringBuilder sb= new StringBuilder(A);
//         int countp=0;
//         int counta=0;
//         int countm=0;
//         for(int i=0; i<A.length();i++){
//             if(sb.charAt(i)=='p'){
//                 countp++;
//             }
//             if(sb.charAt(i)=='a'){
//                 counta++;
//             }
//             if(sb.charAt(i)=='m'){
//                 countm++;
//             }
//         }
//         // int op;
//         // while(sb.length() > 0){
//         // if(countm>=countp+counta){
//             // switch(op){
//             //     case 1:
//             //     {
//             //         for(int i=0; i<sb.length();i++){
//             //             if(sb.charAt(i)=='p'){
//             //                 sb.delete(i,'p');
//             //             }
//             //             if(sb.charAt(i)=='m'){
//             //                 sb.delete(i,'m');
//             //             }
//             //         }
//             //     }
//             //     break;
//             //     case 2:
//             //     {
//             //         for(int i=0; i<sb.length();i++){
//             //             if(sb.charAt(i)=='a'){
//             //                 sb.delete(i,'a');
//             //             }
//             //             if(sb.charAt(i)=='m'){
//             //                 sb.delete(i,'m');
//             //             }
//             //         }
//             //     }
//             //     break;
//             // }
//             if (countm >= countp + counta) {
//             return 1;  // It's possible to empty the string
//         } else {
//             return 0;  // Not enough 'm's to remove all 'p' and 'a'
//         }
//         // }
//         // }
//     }
// }
