import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
char b;
Scanner sc=new Scanner(System.in);
System.out.print("enter input");

b=sc.nextChar();


if(Character.isalphabetic(b))
{
System.out.print("it is a alphabet");
}
else
System.out.print("not an alphabet");
}
}
