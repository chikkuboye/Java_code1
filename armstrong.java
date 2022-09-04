import java.util.*;
public class armstrong
{
public static void main(String[] args)
{

Scanner obj1 = new Scanner(System.in);
int start_num = obj1.nextInt();
int end_num = obj1.nextInt();
int num = obj1.nextInt();
int temp = num;
int p = 0;
while(num>=start_num && num<=end_num)
{
int rem = num%10;
p = (p) + (rem * rem * rem);
num = num/10;
}
if(temp == p)
{
System.out.println("Yes. It is Armstrong No.");
}
else
{
System.out.println("No.It is not Armstrong No.");
}
}
}


