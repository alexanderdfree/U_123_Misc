public class ForLoops{
   public static double eulerSeries(int n){
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
   double sum = 0;
   double counter = 1;
   for (int i = 1; i-1<=n; i++){
      sum += 1/counter;
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
   double sum = 0;
   double counter = 1;
   boolean plusMinus = true;
   for (int i = 1; i<=n+1; i++){
      
      if (plusMinus) {
      sum += 4/counter; }
      else{
      sum -= 4/counter;
      }
      counter += 2;
      plusMinus = !plusMinus;
      
   }
   return sum;

}
public static double pi_Wallis(int n){
   /*Approximate the value of pi using the first n terms
   of the Wallis Infinite Product
   pi/2 = (2/1*2/3)*(4/3*4/5)*(6/5*6/7)*(8/7*8/9)...
  
   Ex.
   pi_Wallis(0)   -> 2.6666666666666665
   pi_Wallis(1)   -> 2.844444444444444
   pi_Wallis(2)   -> 2.9257142857142853
   pi_Wallis(10)  -> 3.074055160280442
   pi_Wallis(100) -> 3.1338642934978194
   */
   double sum = 4/3;
   double counter = 1;
   double counter2 = 2;
   for (int i = 0; i<=n; i++){
      
      sum *= ((counter2/counter) * (counter2/(counter+2)));
      counter += 2;
      counter2 += 2;
      
   }
   return sum * 2;
}
public static double pi_NK(int n){
  /*Calculate pi using Nilakantha's Series
  pi = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8)...
  
  Ex.
  pi_NK(0)    -> 3
  pi_NK(1)    -> 3.1666666666666665
  pi_NK(2)    -> 3.1333333333333333
  pi_NK(10)   -> 3.1414067184965018
  pi_NK(100)  -> 3.1415924109719824
  pi_NK(1000) -> 3.141592653340544
  */
  double sum = 3;
  int n1 = 2;
  int n2 = 3;
  int n3 = 4;
  
  boolean plusMinus = true;
  for (int i = 1; i<=n; i++){
      if (plusMinus) {
      sum += 4.0/(n1*n2*n3); }
      else{
      sum -= 4.0/(n1*n2*n3);
      }
      plusMinus = !plusMinus;
      n1 += 2;
      n2 += 2;
      n3 += 2;
   }
   return sum;
  
}
}