import java.util.*;
import java.lang.*;

public class OddOccurrencesInArray {
    public int oddOccurrencesInArray(int[] A) {
		int length = A.length;

		if (length == 1) {
			return A[0];
		}

		Arrays.sort(A);

		for (int i = 0; i < length; i+=2) {
			if((i+1) >= length) {
				return A[i];
			}
			else if (A[i] != A[i+1]) {
				return A[i];
			}
		}

		return -1;

	}
}