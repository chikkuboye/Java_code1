import java.util.*;
public class single
{
public static void main(String[] arg)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int largest;
// largest = (c > ((a > b) ? a : b)) ? c : a ;
largest = (c > (a > b ? a : b)) ? c : ((a > b) ? a : b); 
System.out.println(largest);
}
}