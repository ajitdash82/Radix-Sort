import java.util.*;
class Radix_s
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,t,co,l=0,dv=1,j,rad,ind,m,o,p;
System.out.println("Enter the dimension of the array::");
n=sc.nextInt();
int a[][]=new int[n][2];
int b[][]=new int[n][2];
int c[]=new int[n];
System.out.println("Enter the elements in to the array::");
for(i=0;i<n;i++)
{
a[i][0]=sc.nextInt();
t=a[i][0];
co=0;
while(t>0)
{
t=t/10;
co++;
}
if(co>l)
l=co;
a[i][1]=co;
}
for(i=0;i<n;i++)
b[i][0]=a[i][0];
for(m=0;m<l;m++)
{
ind=0;
for(i=0;i<n;i++)
{
t=b[i][0]/dv;
b[i][1]=t%10;
}
for(rad=0;rad<10;rad++)
{
for(j=0;j<n;j++)
{
if(b[j][1]==rad)
{
c[ind]=b[j][0];
ind++;
}}}
System.out.println("\nThe sorted array after the radix "+(m+1)+" is::");
for(p=0;p<n;p++)
System.out.print(c[p]+" ");
for(o=0;o<n;o++)
b[o][0]=c[o];
dv=dv*10;
}
System.out.println("\nThe final sorted array is follows::");
for(i=0;i<n;i++)
System.out.print(c[i]+" ");
}
}