class NumPattern16
{
public static void main(String[] args)
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
for(int k=1;k<=2*i-1;k++)
{
if(k==1||k==2*i-1)
System.out.print(i);
else
System.out.print(" ");
}
System.out.println();
}
}
}