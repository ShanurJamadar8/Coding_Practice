package session7;
import java.util.*;
public class Game {
	static int total = 0;
	static int loss = 0;
	static int myTotal = 0;
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		if(rules() == 'n') {
				System.out.println("\nThank you!!!");
				System.exit(0);
		}
		else {
		
			boolean exit = false;
			int[] arr = {47, 50, 65, 9, 15, 50, 23, 117, 203, 104};
		
			while(!exit) {
				System.out.print("Add your Amount (50 - 2000) : ");
				int amnt = sc.nextInt();
				if(amnt > 2000 || amnt < 50)
					System.out.println("Please Enter the amount greater than 50 and less than 2000 !!!");
				else {
					int sum1 = 0;
					System.out.print("Enter 3 numbers from the List :  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] : \n");

					for(int i=0;i<3;i++) {
						boolean pres = false;
						System.out.print("Enter No "+(i+1)+" : ");
						int a = sc.nextInt(); 
						if(a>=1 && a<=10)
								sum1+=arr[a-1];
						else{
							System.out.println("Please Enter the values from list!!!");
							i--;
						}
					}
	
					if(palindrome(sum1)) {
						total += amnt;
						total = total * 2;
						System.out.print("You Win!!!\nYour Amount is : "+total);
						if(total > 20000) {
							System.out.println("You reached to the highest value!!!\nThank You for your participation!!!\nCollect your total amount = "+total);
							System.exit(0);
						}
					}
					else {
						total = total - amnt;
						loss += amnt;
						myTotal += amnt;
						if(total <= 0) {
							System.out.println("Your Total Amount is Zero!!!");
							total = 0;
						}
						else {
							System.out.println("You Loss!!!\nYour Current Amount is : "+ total );
						}
					}
					System.out.print("\nDo you want to play again (y/n) ? ");
					if(sc.next().charAt(0) == 'n') {
						System.out.print("\nYour Total Amount is : "+total);
						System.out.println("\nYour Total Loss is : "+ loss);
						exit = true;
					}
					else {
						arr = shuffle(arr);
					}
				}
			}
		}
	}
	public static char rules() {
		System.out.print("\n\t**Palindrome Game**");
		System.out.println("\nRules :\n1.User need to provide an amount in starting to play\n2.User can pick any 3 numbers\n3.If sum of number is palindrome, player will get \"double\" of its paid amount else it will be \"zero\" ");
		System.out.print("\nAre you willing to play (y/n) : ");
		char ch = sc.next().charAt(0);
		return ch;
	}
	
	public static boolean palindrome(int sum1) {
		int sum2=sum1;
		int r = 0;
		
		while(sum2 != 0) {
			r = r*10 + (sum2%10);
			sum2= sum2/10;
		}
		if(sum1 == r)
			return true;
		return false;
	}
	
	public static int[] shuffle(int[] arr) {
		Random rd = new Random();
		rd.nextInt();
		for(int i=0;i<arr.length;i++) {
			int ch = i+rd.nextInt(arr.length-i);
			int temp = arr[i];
			arr[i] = arr[ch];
			arr[ch] = temp;
		}
		return arr;
	}
}