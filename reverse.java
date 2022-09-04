import java.util.*;
public class reverse
{
public static void main(String[] arg)
{
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
int reverse = 0;
while(n != 0)   
{  
int remainder = n % 10;  
reverse = reverse * 10 + remainder;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  