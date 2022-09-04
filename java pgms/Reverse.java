import java.util.*;
class Reverse{
public static void main(String[] args){
int a,n,r=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
n=sc.nextInt();
while(n!=0)
{
a=n%10;
r=r*10+a;
n=n/10;
}
System.out.println("Reverse is "+r);
}}

