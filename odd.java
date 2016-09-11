import java.io.*;
import java.util.*;
class odd
{int n;
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
if((n%2)==0)
{
System.out.print("even");
}
else
System.out.print("odd");
}
}
