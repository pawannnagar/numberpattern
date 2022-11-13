class NumPattern12
{
public static void main(String[] args)
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
int flag=2*i-1;
for(int k=i;k>=1;k--)
{
System.out.print(flag);
flag--;
}
for(int l=i-1;l>=1;l--)
System.out.print(l);
System.out.println("");
}
}
}