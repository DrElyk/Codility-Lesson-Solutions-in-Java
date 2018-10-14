import java.util.*;
import java.lang.*;

public class FrogJump {
    public int frogJump(int X, int Y, int D) {
    	double start = new Double(X);
    	double end = new Double(Y);
    	double dist = new Double(D);
    	return (int)(Math.ceil((end-start)/dist));
    }
}