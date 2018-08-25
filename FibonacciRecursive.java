
public class FibonacciRecursive implements Fibonacci{

	@Override
	public int fibonacci(int n) {
		
		if (n <= 1) return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
