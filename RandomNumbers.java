
public class RandomNumbers {
public static int flipCoin(){
   /*Simulate flipping a coin. Return 0 if heads, 1 if tails
   Inputs:
   Outputs:
      return: 0 if heads, 1 if tails
   */
   double flip = Math.random();
   if(flip < 0.5){//heads
      return 0;
   }
   else{//tails
      return 1;
   }
}
public static int rollDie(){
   /*Simulate rolling a 6-sided die. Return 1-6, depending on which
   value is rolled.
   Input:
   Output:
      return: 1-6 with equal probability
   */
   double flip = 6 * Math.random();
   if(flip < 1){//heads
      return 1;
   }
   else if(flip < 2){//heads
      return 2;
   }
   else if(flip < 3){//heads
      return 3;
   }
   else if(flip < 4){//heads
      return 4;
      
   }
  else if(flip < 5){//heads
      return 5;
   }
  else{
      return 6;
   }
}
public static int rollMDice(int m){
   /*Simulate one toss of m 6-sided dice. Return the sum of the dice
   For example, the result of rollDice(2) should range from 2-12
   (but will not necessarily be uniformly-distributed). The result of 
   rollDice(4) will range from 4-24, etc.

   Input:
      int m: the number of dice to throw
   Output:
      return: the sum of the dice rolled
   */
   
   
   int total = 0;
   for (int i=0; i<m; i++){
      double flip = 6 * Math.random();
      if(flip < 1){//heads
      total+= 1;
   }
   else if(flip < 2){//heads
      total+= 2;
   }
   else if(flip < 3){//heads
      total+= 3;
   }
   else if(flip < 4){//heads
      total+= 4;
      
   }
  else if(flip < 5){//heads
      total+= 5;
   }
  else{
      total+= 6;
   }
   }
   return total;
}


public static void rollDieNTimes(int n){
   /*Simulate rolling one 6-sided die n times. Keep track of how 		
   often you get each value. At the end print out how many times you 	
   got each possible outcome.
   Hint: set up storage for how often you get each possible outcome
   before entering your loop.

   Input:
      int n: the number of times to roll 1 die
   Output:
      print: a message displaying how many times the die was rolled,
      and how many times each result came up
   
   Ex. (Your results will be different, every time you run, due to 	   
   randomness)
   RandomNumber.rollDieNTimes(100)
   Rolled one die 100 times:
   1: 18
   2: 21
   3: 13
   4: 11
   5: 16
   6: 21
   */
   
   int total1 = 0;
   int total2 = 0;
   int total3 = 0;
   int total4 = 0;
   int total5 = 0;
   int total6 = 0;
   
   for (int i=0; i<n; i++){
      double flip = 6 * Math.random();
      if(flip < 1){//heads
      total1+= 1;
   }
   else if(flip < 2){//heads
      total2+= 1;
   }
   else if(flip < 3){//heads
      total3+= 1;
   }
   else if(flip < 4){//heads
      total4+= 1;
      
   }
  else if(flip < 5){//heads
      total5+= 1;
   }
  else{
      total6+= 1;
   }}
   StdOut.println("1: " + total1 );
   StdOut.println("2: " + total2 );
   StdOut.println("3: " + total3 );
   StdOut.println("4: " + total4 );
   StdOut.println("5: " + total5 );
   StdOut.println("6: " + total6 );
   }
public static void roll2DiceNTimes(int n){
	/*Simulate rolling two 6-sided dice together, n times. Keep track
	of the sum of the two dice from each round. At the end, print 
	out how many times you got each possible outcome

	Hint: set 	up storage for how often you get each possible outcome 	before entering your loop (what possible outcomes are there?).

	Input:
		int n: the number of times you will roll 2 dice
	Output:
		print: how often you got each possible sum of the 2 dice

	Ex. (Your results will be different, every time you run, due to 		randomness)

	roll2DiceNTimes(100)
	
	Rolled two dice 100 times:
	2: 3
	3: 5
	4: 9
	5: 7
	6: 14
	7: 18
	8: 10
	9: 18
	10: 8
	11: 4
	12: 4
	*/
   int total1 = 0;
   int total2 = 0;
   int total3 = 0;
   int total4 = 0;
   int total5 = 0;
   int total6 = 0;
   int total7 = 0;
   int total8 = 0;
   int total9 = 0;
   int total10 = 0;
   int total11 = 0;
   int total12 = 0;
   int miniTotal = 0;
   for (int i=0; i<n; i++){
      double flip = 6 * Math.random();
      double flip2 = 6 * Math.random();
      double flipTotal = flip + flip2;
      
      if (flipTotal <= 2){
         total2++; }
      else if (flipTotal <= 3){
         total3++;}
      else if (flipTotal <= 4){
         total4++;}
      else if (flipTotal <= 5){
         total5++;}
      else if (flipTotal <= 6){
      total6++;}
      else if (flipTotal <= 7){
      total7++;}
      else if (flipTotal <= 8){
      total8++;}
      else if (flipTotal <= 9){
      total9++;}
      else if (flipTotal <= 10){
      total10++;}
      else if (flipTotal <= 11){
      total11++;}
      else {
      total12++;}
      }
      
   
   StdOut.println("2: " + total2 );
   StdOut.println("3: " + total3 );
   StdOut.println("4: " + total4 );
   StdOut.println("5: " + total5 );
   StdOut.println("6: " + total6 );
   StdOut.println("7: " + total7 );
   StdOut.println("8: " + total8 );
   StdOut.println("9: " + total9 );
   StdOut.println("10: " + total10 );
   StdOut.println("11: " + total11 );
   StdOut.println("12: " + total12 );
   
   
   


}
public static double piRandom(int n){
   /*Estimate the value of pi by dropping n random points inside
   a square with side length of 1, and seeing how many points
   fall inside vs. outside a circle inscribed in the square
   Inputs:
      int n: the number of random points to drop in the square
   Outputs:
      return: an estimate for pi based on the random points*/
   int total = 0;
   for (int i = 0; i < n; i++){
      double x = Math.random();
      double y = Math.random();
      double distance = Math.sqrt(Math.pow(0.5-x,2)+Math.pow(0.5-y,2));
      if (distance < 0.5) {
         total++;
      }
      
}
   double piApp = 4.0 * total / n;
   return piApp;
}

}