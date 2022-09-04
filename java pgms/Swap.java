import java.util.*;
class Swap{
public static void main(String[] args){
int a,b,t;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
a=sc.nextInt();
b=sc.nextInt();
t=a;
a=b;
b=t;
System.out.println("After Swapping "+a+" "+b);
}
}
