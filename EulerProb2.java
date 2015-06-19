/* Project Euler problem 2.
   Name: John Cherry
   Email: jcherry022@gmail.com
 */


package eulerprob2;

/**
 *
 * @author Chillz
 */
public class EulerProb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxNumber = 32;
        int next = 0;
        int afterNext = 1;
        int evenResult = 0;
        int[] saveEvenResult = new int[maxNumber];
        int sumOfEvenResult = 0;
        
        
       
        // for loop to obtain the Fibbonacci Sequence.
        for( int i = 0; i < maxNumber; i++){ 
            int savePrevious = next;
            next= afterNext;
            afterNext = savePrevious + afterNext;       
            System.out.println("Fib Numbers [" + i + "]: " + afterNext);
            
            // Checking Fibbonacci numbers to see if it is even.
            if (afterNext % 2 == 0){
                 saveEvenResult[i] = afterNext;
                 evenResult = afterNext;
                 //System.out.println("even******: " + evenResult);
            }
        }
        // for loop to add all  even elements inside of an array.
        for(int j : saveEvenResult){ 
               sumOfEvenResult+=j;
        }
      
        System.out.println("Even result in array: " + sumOfEvenResult);
        
       
        
    }
    
}
