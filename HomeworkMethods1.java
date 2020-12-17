public class HomeworkMethods1{
   public static void divideBy2(int divisionNumber){
   /* Divide i by 2 (integer division) until you get to 1. You may
   assume that i is a positive integer
   */


   //as long as the number is greater than or equal to one
   while (divisionNumber >= 1) {
   //say the number
   StdOut.println(divisionNumber);
   //divide the number by 2
   divisionNumber/=2;
   }
}
public static void baselSeries(int n){
   /*Generate the first n entries in the Basel Series
   1, 1/4, 1/9, 1/16, 1/25, 1/36, 1/49...1/(n^2)
   Print the output as decimal numbers, i.e.
   1.0
   0.25
   0.1111111111111111
   0.0625
   0.04
   0.027777777777777776
   0.02040816326530612
   ...
   */
   double x = 1;
   int i = 2;
   
   while (i <= (n+1)){
      StdOut.println(x);
      x = 1/Math.pow(i,2);
      i++;
   }}
public static void pyramidString(String s){
   /*Break a string into pyramid-shaped chunks. If there are chars
   left at the end discard/don't display them.

   Ex.
   pyramidString("acetyl")
   a
   ce
   tyl

   pyramidString("kickboxing")
   k
   ic
   kbo
   xing

   pyramidString("underpublicized")
   u
   nd
   erp
   ubli
   cized

   pyramidString("multifrequency")
   m
   ul
   tif
   requ
   
   */
   int i = 0;
   int counter = 0;
   String a;
   while (i < s.length()){
      if (counter+i > s.length()){
         StdOut.println(s.substring(counter, s.length()));
         break;
      }
      else { 
      StdOut.println(s.substring(counter, counter + i));
      counter+=i;
      i++;
   }}




}}