import java.util.*;

/**
 * This class launched two heavy computations
 * sequentially first, then in parallel. 
 * Assuming there is more than one processor in 
 * the machine, parallel computations finish
 * earlier.
 */
public class ComputationLauncher {   
    /**
     * How many numbers to process? If too low, there is no noticeable
     * difference.
     */
     public static final int COUNT = 40000000;

    /*
     * The computations to be performed. Stored as fields so 
     * both methods (sequential and parallel) act on exactly 
     * the same data
     */
    private Computation c1 = null;
    private Computation c2 = null;
    private Computation q1 = null;
    private Computation q2 = null;
    private Computation q3 = null;
    private Computation q4 = null;

    /**
     * The main method that launches the computations
     *
     * @param args command-line arguments, ignored
     */
    public static void main(String args[]) {
	  ComputationLauncher c = new ComputationLauncher();
	  c.launch();
    }
   
    private double[] createArray(int size) {
	  double[] result = new double[size];
	  for (int i = 0; i < result.length; i++) 
		{
		    result[i] = Math.random();
		}
	  return result;
    }
	
	private double[] copyArray(double[] src, int start, int end) {
		double[] result = new double[end-start];
		int index = 0;
		for(int i = start; i < end; i++) {
			result[index] = src[i];
		}
		return result;
	}
   
    private void launch() {
	  // Uncomment the following line to know how many processors your machine has
	  System.out.println("#CPU: " + Runtime.getRuntime().availableProcessors());
	  long start, stop;
	  
	  int size = COUNT/2;
	  double[] array1 = createArray(size);
	  double[] array2 = createArray(size);
	  c1 = new Computation(array1);
	  c2 = new Computation(array2);	  
	  
	  q1 = new Computation(copyArray(array1, 0, size/2));
	  q2 = new Computation(copyArray(array1, size/2, size));
	  q3 = new Computation(copyArray(array2, 0, size/2));
	  q4 = new Computation(copyArray(array2, size/2, size));
	  
	  start = System.currentTimeMillis();
	  sequentialComputations();
	  stop = System.currentTimeMillis();
	  System.out.println("Time without threads: " + (stop - start) + "ms");
	  start = System.currentTimeMillis();
	  parallelComputations();
	  stop = System.currentTimeMillis();
	  System.out.println("Time with dual threads: " + (stop - start) + "ms");
	  start = System.currentTimeMillis();
	  quadComputations();
	  stop = System.currentTimeMillis();
	  System.out.println("Time with quad threads: " + (stop - start) + "ms");
    }
   
    private void sequentialComputations() {
	  c1.run();
	  c2.run();
	  double result1 = c1.getResult();
	  double result2 = c2.getResult();
	  System.out.println("Result: " + (result1 + result2));
    }
   
    private void parallelComputations() {
	  Thread t1 = new Thread(c1);
	  t1.start();
	  Thread t2 = new Thread(c2);
	  t2.start();
	  double result1 = c1.getResult();
	  double result2 = c2.getResult();
	  System.out.println("Result: " + (result1 + result2));
    }
	
	private void quadComputations() {
	  Thread t1 = new Thread(q1);
	  t1.start();
	  Thread t2 = new Thread(q2);
	  t2.start();
	  Thread t3 = new Thread(q3);
	  t3.start();
	  Thread t4 = new Thread(q4);
	  t4.start();
	  double result1 = q1.getResult();
	  double result2 = q2.getResult();
	  double result3 = q3.getResult();
	  double result4 = q4.getResult();
	  System.out.println("Result: " + (result1 + result2 + result3 + result4));
    }
}










