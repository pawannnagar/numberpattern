class NumPattern22
{
public static void main(String[] args)
{
int n=5;
int a=0,b=1,c=a+b;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(c+" ");
c=a+b;
a=b;
b=c;
}
System.out.println("");
}
}
}
