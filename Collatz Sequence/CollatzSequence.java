/**
 * Collatz Sequence or Collatz conjecture is a conjecture in mathematics that concerns a sequence defined as follows:
 * start with any positive integer n. Then each term is obtained from the previous term as follows:
 * if the previous term is even, the next term is one half the previous term.
 * If the previous term is odd, the next term is 3 times the previous term plus 1.
 * The conjecture is that no matter what value of n, the sequence will always reach 1
 * (see https://en.wikipedia.org/wiki/Collatz_conjecture)
 */
public class CollatzSequence {

    int collatz( int number ) {
        System.out.println( number );
        int temp;
        if ( number % 2 == 0 ) {
            temp = number / 2;
        } else {
            temp = 3 * number + 1;
        }

        if ( temp != 1 )
            return collatz( temp );

        return temp;
    }

    public static void main( String[] args ) {
        CollatzSequence collatzSequence = new CollatzSequence();

        int startNumber = 30;
        System.out.println( collatzSequence.collatz( startNumber ) );
    }
}
