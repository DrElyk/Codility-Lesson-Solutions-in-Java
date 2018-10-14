import java.util.*;
import java.lang.*;

public class PermMissingElement {
    public int permMissingElement(int[] A) {
		int length = A.length;

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		if (length == 0) {
			return 1;
		}

		for (int i = 0; i < length; i++) {
			map.put(A[i], true);
		}

		for (int i = 1; i <= (length+1); i++) {
			if(!map.containsKey(i)) {
				return i;
			}
		}

		return -1;
	}
}