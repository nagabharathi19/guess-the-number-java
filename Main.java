import java.util.*;
import java.util.Random;
public class Main {
	public static void main(String [] args) {
		System.out.println("Welocme to guess the number");
		Random r=new Random();
		int number=r.nextInt(100) + 1;
		//System.out.println(number);
		System.out.println("Enter the number desired number: ");
		Scanner sc=new Scanner(System.in);
		while(true)
		{	int usernumber= sc.nextInt();
			if(number==usernumber) {
				System.out.println("You gussed the number right, the number is:"+number);
				break;
			}
			else if(number>usernumber) {
				System.out.println("TOOOOO LOWWW");
			}
			else if(number<usernumber) {
				System.out.println("TOOO HIGHHH");
			}
			else {
				System.out.println("Wrong input");
			}
		}
		sc.close();
	}
}