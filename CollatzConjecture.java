import java.util.Random;

public class CollatzConjecture {
    public static void main( String[] args ) {
        Random r = new Random();
        int rand = r.nextInt(100) + 1;

        while ( rand > 0 ) {
            System.out.println( rand );

            if ( rand % 2 == 0 ) {
                rand = rand / 2;
            } 
            else {
                rand = rand * 3 + 1;
            }

            try {
                Thread.sleep(1000);
            }
            catch ( InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}
