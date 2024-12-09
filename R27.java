class Progression2 {
    // instance variable
    protected long current;

    /** Constructs a progression starting at zero. */
    public Progression2( ) { this(0); }
    /** Constructs a progression with given start value. */
    public Progression2(long start) { current = start; }
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

class ArithmeticProgression extends Progression {
    protected long increment;

    /** Constructs progression 0, 1, 2, ... */
    public ArithmeticProgression( ) { this(1, 0); } // start at 0 with increment of 1

    /** Constructs progression 0, stepsize, 2*stepsize, ... */
    public ArithmeticProgression(long stepsize) { this(stepsize, 0); } // start at 0

    /** Constructs arithmetic progression with arbitrary start and increment. */
    public ArithmeticProgression(long stepsize, long start) {  super(start);
        increment = stepsize;
    }
    /** Adds the arithmetic increment to the current value. */
    protected void advance( ) {  current += increment;
    }  }


public class R27 {

        public static void main(String[] args) {
            // حدد قيمة الزيادة
            long increment = 128;

            // احسب الحد الأقصى لعدد المكالمات قبل حدوث overflow
            long maxCalls = (Long.MAX_VALUE + increment - 1) / increment;

            System.out.println("maxCalls : " + maxCalls);
        }
    }


