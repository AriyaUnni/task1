import java.util.*;
class ASCII
{
public static void main(String[] args)
{
char a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character");
a=sc.next().charAt(0);
int b=a;
System.out.println("ASCII value "+a+" is "+b);
}
}