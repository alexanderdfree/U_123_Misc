public class CumulativeHW {
public static int fibonacci(int n){
   /*Calculate the nth Fibonacci number (use 0-based indexing)
   Ex.
   fibonacci(0) -> 0
   fibonacci(1) -> 1
   fibonacci(2) -> 1
   fibonacci(3) -> 2
   fibonacci(4) -> 3
   fibonacci(5) -> 5
   */
   int sum = 1;
   int sum2 = 1;
   int i = 1;
   if (n == 0) return 0;
   if (n == 1) return 1;
   if (n == 2) return 1;
   
   while(i <= n-2){ 
      int sum3 = sum;
      sum += sum2;
      sum2 = sum3;
      i++;
   }
   return sum;
}
public static int sum1toN_Gauss(int n){
   /*Find the sum of 1->n using Gauss's Method
   Ex.
   sum1toN(3) -> 6
   sum1toN(4) -> 10
   sum1toN(5) -> 15
   sum1toN(100) -> 5050
   sum1toN(101) -> 5151
   */  
   int smallSum = n + 1;
   int bigSum = smallSum * n / 2;
   /*if (n%2 == 1){
      bigSum+=(n+1)/2;
   }*/
   return bigSum;
   
}


}
