class NumPattern21
{
public static void main(String[] args)
{
int n=5;
for(int i=n;i>=1;i--)
{
for(int j=n-i;j>=1;j--)
System.out.print(" ");
for(int k=1;k<=2*i-1;k++)
{
if(k==1||k==2*i-1)
System.out.print(n-i+1);
else
System.out.print(" ");
}
System.out.println("");
}
for(int i=2;i<=n;i++)
{
for(int j=n-i;j>=1;j--)
System.out.print(" ");
for(int k=1;k<=2*i-1;k++)
{
if(k==1||k==2*i-1)
System.out.print(n-i+1);
else
System.out.print(" ");
}
System.out.println("");
}
}
}