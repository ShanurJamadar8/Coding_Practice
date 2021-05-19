package session8;
import java.util.*;
public class Assignment12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {			
			for(int j=i+1;j<str.length();j++) {
				int n1 = ch[i], n2 = ch[j];;
				if(n1>90) 
					n1-=32;
				if(n2>90)
					n2-=32;
				
				if(n1>n2) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		str = Arrays.toString(ch);
		System.out.println("String  After Sorting : "+Arrays.toString(ch));
		sc.close();
	}
}