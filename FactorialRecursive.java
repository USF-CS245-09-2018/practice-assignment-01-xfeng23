//import com.sun.xml.internal.bind.v2.util.FatalAdapter;

public class FactorialRecursive implements Factorial{

	@Override
	public int factorial(int n) {
		
//		if(n <= 0) return -1;
		if(n == 0 || n == 1) return 1;
		
		return factorial(n-1)*n;
	}
}
