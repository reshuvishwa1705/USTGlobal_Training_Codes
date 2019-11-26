
public class Fact {
public static void main(String[] args) {
	int n=fact(5);
	System.out.println("Factorial of number is "+n);
}
static int fact(int n) {
	if(n==0) 
		return 1;
		else
			return (n*fact(n-1));
	}
}
