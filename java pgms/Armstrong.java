import java.util.*;
class Armstrong{
public static void main(String[] args){
int u,l,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the lower limit");
l=sc.nextInt();
System.out.println("Enter the upper limit");
u=sc.nextInt();
for(i=1;i<=u;i++)
{
int r,n=i,s=0;
while(n!=0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(s==i)
{
System.out.println(" "+i);
}
}
}
}