class Progression {
         // instance variable
         protected long current;

         /** Constructs a progression starting at zero. */
         public Progression( ) { this(0); }
             /** Constructs a progression with given start value. */
             public Progression(long start) { current = start; }
             /** Returns the next value of the progression. */
             public long nextValue( ) {  long answer = current;
         advance( ); // this protected call is responsible for advancing the current value
         return answer;
         }
             /** Advances the current value to the next value of the progression. */
             protected void advance( ) {  current++;
         }
             /** Prints the next n values of the progression, separated by spaces. */
             public void printProgression(int n) {  System.out.print(nextValue( )); // print first value without leading space
             for (int j=1; j < n; j++)
               System.out.print(" " + nextValue( )); // print leading space before others
         System.out.println( ); // end the line
         }  }
class FibonacciProgression extends Progression {
         protected long prev;

         /** Constructs traditional Fibonacci, starting 0, 1, 1, 2, 3, ... */
         public FibonacciProgression( ) { this(0, 1); }
             /** Constructs generalized Fibonacci, with give first and second values. */
             public FibonacciProgression(long first, long second) {  super(first);
                            prev = second - first ;
          // fictitious value preceding the first
         }
             /** Replaces (prev,current) with (current, current+prev). */
             protected void advance( ) {  long temp = prev;
         prev = current;
         current += temp;
         }  }

public class R26 {
    public static void main(String[] args) {
        FibonacciProgression fibonacci = new FibonacciProgression(2, 2);

        // نكرر عملية الحصول على القيمة التالية 7 مرات للوصول إلى القيمة الثامنة
        for (int i = 0; i < 7; i++) {
            fibonacci.nextValue();
        }

        // القيمة الحالية الآن هي القيمة الثامنة
        long eighthValue = fibonacci.current;

        System.out.println("eighthValue :" + eighthValue);
    }
}
