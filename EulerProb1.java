/* Project Euler problem 1.
   Name: John Cherry
   Email: jcherry022@gmail.com
 */

package eulerprob1;

/**
 *
 * @author Chillz
 */
public class EulerProb1 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result=0;
        int maxNumber = 1000;
        
        // for loop to calculate multiples of 3 and 5  and also Find the sum of all the multiples of 3 or 5 below 1000.
        for( int i = 0; i < maxNumber; i++){
            if( i % 3 == 0 || i % 5 == 0){
                result = result + i;
            }
        }
        System.out.println("total multiples of 3 and 5: " + result);
        
    }
    
}
