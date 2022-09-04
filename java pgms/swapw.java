import java.util.*;
class swapw{
public static void main(String[] args){
int a,b;
System.out.println("Enter 2 numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping "+a+" "+b);
}
}