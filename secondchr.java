package guvi;
import java.util.Scanner;
public class secondchr {
	public static void main(String args[]){
String a;
	Scanner s=new Scanner(System.in);
	a=s.nextLine();
String b=a.substring(0,1);
String c=a.substring(1,2).toUpperCase();
String d=b.concat(c);
System.out.println(d.concat(a.substring(2,a.length())));
	}
}
