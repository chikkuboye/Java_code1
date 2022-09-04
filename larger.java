import java.util.*;
public class larger
{
public static void main(String[] arg)
{
Scanner obj1 = new Scanner(System.in);
int a = obj1.nextInt();

int b = obj1.nextInt();

int c = obj1.nextInt();
if(a>b && a>c)
{
System.out.println("a is largest");
}
else if(b>a && b>c)
{
System.out.println("b is largest");
}
else
{
System.out.println("c is largest");
}
}
} 