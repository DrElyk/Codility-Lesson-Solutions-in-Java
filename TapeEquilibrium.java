import java.util.*;
import java.lang.*;

public class TapeEquilibrium {
    public int tapeEquilibrium(int[] A) {
    	int length = A.length;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    	int sum = 0;
    	int backSum = 0;

    	for (int i = 0; i < length; i++) {
    		map.put(i , sum);
    		sum = sum + A[i];
    	}

    	int min = Integer.MAX_VALUE;
    	int temp = 0;
    	for (int i = length-1; i > 0; i--) {
    		backSum = backSum + A[i];
    		
    		temp = Math.abs(map.get(i) - backSum);
    		if (temp < min) {
    			min = temp;
    		} 
    	}

    	return min;
    }
}