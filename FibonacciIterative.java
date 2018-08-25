
public class FibonacciIterative implements Fibonacci{

	@Override
	public int fibonacci(int n) {
		
		if(n<=1) return n;
		if(n==2) return 1;
		int f1 = 1;
		int f2 = 1;
		int res = 0;
		for (int i = 3; i <= n; i++) {
			res = f1 + f2;
			f1 = f2;
			f2 = res;
			
		}
		return res;
	}
}

