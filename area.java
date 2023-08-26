import java.util.Scanner;

class area{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int len = sc.nextInt();
		System.out.println("enter breadth:");
        int breadth = sc.nextInt();

        int area = len * breadth;
        int circumference = 2*(len + breadth);

        System.out.println("area is "+area+" circumferece is "+circumference);
		}
	}

    