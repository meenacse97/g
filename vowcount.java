package guvi;
import java.util.Scanner;
public class vowcount {
	public static void main(String[] args){
	  int count = 0;
	  String s;
	  Scanner sc=new Scanner(System.in);
	  s=sc.next();
	          for (int i = 0; i < s.length(); i++) {
	             char ch = s.charAt(i);
	             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	  
	                  count++;
	          }
	             }
	 System.out.println("Number of vowels : " + count);
	  }
}
