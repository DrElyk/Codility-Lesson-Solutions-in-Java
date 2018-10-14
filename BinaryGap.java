import java.util.*;
import java.lang.*;

public class BinaryGap {
	public int binaryGap(int N) {
		String str = Integer.toString(N);
		String bin = "";
		int temp = N;

		while (temp != 0) {
			if (temp % 2 == 1) 
				bin = "1" + bin;
			else 
				bin = "0" + bin;

			temp = temp / 2;
		}
		int max = 0;
		int count = 0;
		int length = bin.length();
		for (int i = 0; i < length; i++) {
			if (bin.charAt(i) == '1') {
				i++;
				while(i < length && bin.charAt(i) == '0') {
					count++;
					i++;
				}
				if(i < length && bin.charAt(i) == '1' && count > max) {
					max = count;
				}
				i--;
				count = 0;
			}
		}
		return max;
		

	}
}