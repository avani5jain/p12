import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	String str1=sc.next();
	str1=str1.replaceAll("[()]","");
	System.out.print(str1);
	
	}
}
