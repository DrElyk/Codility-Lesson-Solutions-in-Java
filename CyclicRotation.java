import java.util.*;
import java.lang.*;

public class CyclicRotation {
	public int[] cyclicRotation(int[] A, int K) {
	    int length = A.length;

	    if (length == 0 || length == 1) {
	    	return A;
	    }

	    K = K % length;

	    ArrayList<Integer> firstHalf = new ArrayList<Integer>();
	    ArrayList<Integer> secondHalf = new ArrayList<Integer>();

	    for (int i = (length-K); i < length; i++) {
	    	firstHalf.add(A[i]);
	    }
	    for (int i = 0; i < (length-K); i++) {
	    	secondHalf.add(A[i]);
	    }
	    for (int i = 0; i < K; i++) {
	    	A[i] = firstHalf.get(i);
	    }
	    for (int i = K; i < length; i++) {
	    	A[i] = secondHalf.get(i-K);
	    }

	    return A;
	}
}