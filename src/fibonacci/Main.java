package fibonacci;

public class Main {

	public static void main(String[] args) {
		
		System.out.format("iterative : fibonacci number is %d \n", iterative(50));
		System.out.format("recursive : fibonacci number is %d", recursive(50));
	}

	public static int iterative(int n) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		for (int i = 2; i <= n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}
		return n3;
	}

	public static int recursive(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return recursive(n - 1) + recursive(n - 2);
		}
	}
}
