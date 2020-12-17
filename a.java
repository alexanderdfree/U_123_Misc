public class ForLoops{
   public double eulerSeries(int n){
   /*Calculates the sum of the first n entries in the infinite
   series defining Euler's number
   1/1 + 1/1 + 1/(1*2) + 1/(1*2*3) + ...
     
   Ex.
   eulerSeries(0) -> 1
   eulerSeries(1) -> 2
   eulerSeries(2) -> 2.5
   eulerSeries(3) -> 2.6666666666666665
   eulerSeries(9) -> 2.7182815255731922
   */
   int sum = 1;
   int counter = 1;
   for (int i = 1; i<=n; i++){
      sum += counter;
      counter *= i;
   }
   return sum;
}
public static double pi_GL(int n){
   /*Approximate pi using the first n terms of the
   Gregory-Leibniz Series
   4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + 4/13...
   
   Ex.
   pi_GL(0)   -> 4.0
   pi_GL(1)   -> 2.666666666666667
   pi_GL(10)  -> 3.232315809405594
   pi_GL(100) -> 3.1514934010709914
   */
   int sum = 1;
   int counter = 1;
   for (int i = 1; i/2<=n; i+=2){
      sum += counter;
      counter *= i;
   }
   return sum;

}