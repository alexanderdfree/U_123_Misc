public class CumulativeLoops{
public static int sum100(){
   /*Add up all of the numbers from 1 to 100 (inclusive)
   */
   //make a number to represent the total (storage variable)
   int sum = 0;
   //make a number to represent the number that is added (index)
   int i = 1;
   //as long as the thing that gets added is less than or equal to 100
   while(i <= 100){
      //add the new number to the total
      sum += i;
      //add 1 to the number that gets added
      i++;
   }
   //after this is done, give the total
   return sum;
}
public static int sum1toN(int n){
   /*Add up all of the integers from 1 to n (inclusive)
   
   Ex.
   sum1toN(4)  -> 10
   sum1toN(15) -> 120
   sum1toN(1500) -> 1125750
   */
   int sum = 0;
   
   int i = 1;
   
   while(i <= n){
      
      sum += i;
      
      i++;
   }
   
   return sum;

}

public static double sumHarmonic(int n){
   /*Sum the first n entries of the Harmonic Series:
   1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + ... 1/n
   
   Ex.
   sumN(1) -> 1.0
   sumN(2) -> 1.5
   sumN(5) -> 2.283333333333333
   */
   double sum = 0;
   
   int i = 1;
   
   while(i <= n){
      
      sum += 1.0/i;
      
      i++;
   }
   
   return sum;

}
public static double sumAlternatingHarmonic(int n){
   /*Sum the first n entries of the Alternating Harmonic Series:
   1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ... + or - 1/n
   
   Ex.
   sumN(1) -> 1.0
   sumN(2) -> 0.5
   sumN(5) -> 0.7833333333333332
   */
   double sum = 0;
   
   int i = 1;
   
   while(i <= n){
      
      if (i%2 == 1) {
      sum += 1.0/i;
      }
      else{
      sum -= 1.0/i;
      }
      i++;
   }
   return sum;
   
   //return sum;
}
public static int factorial(int n){
   //Calculate the value of n!, i.e.
   int sum = 1;
   
   int i = 1;
   
   while(i <= n){
      
      sum *= i;
      
      i++;
   }
   
   return sum;
}

}