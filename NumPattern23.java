class NumPattern23
{
public static void main(String[] args)
{
int n=5;
for(int i=n;i>=1;i--)
{
for(int j=1;j<=n-i;j++)
System.out.print(j);
for(int k=1;k<=2*i-1;k++)
{
if(k==1||k==2*i-1)
System.out.print(n-i+1);
else
System.out.print(" ");
}
for(int j=1;j<=n-i;j++)
System.out.print(j);
System.out.println("");
}
for(int i=2;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(j);
for(int k=1;k<=2*i-1;k++)
{
if(k==1||k==2*i-1)
System.out.print(n-i+1);
else
System.out.print(" ");
}
for(int j=1;j<=n-i;j++)
System.out.print(j);
System.out.println("");
}
}
}