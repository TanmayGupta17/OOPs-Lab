import java.util.Scanner;

class helloworld{
	public static void main(String args[]){
		
		System.out.println("enter the no to check for evn and odd:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0){
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
	return 0;
}