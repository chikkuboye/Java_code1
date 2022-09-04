import java.io.*;
public class swapwo
{
public static void main(String[] arg)
{
int a = 20 ,b = 40;
a = b + a;
b = a - b;
a = a - b;
System.out.println("After swapping two numbers:"+a+" "+b);
}
}