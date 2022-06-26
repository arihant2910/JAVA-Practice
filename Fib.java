import java.util.Scanner;
public class Fib
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n, t1 = 0, t2 = 1, nextTerm = 0, i;

n = sc.nextInt();

nextTerm = t1 + t2;
for (i = 3; i <= n; ++i)
{
    
t1 = t2;
t2 = nextTerm;
nextTerm = t1 + t2;
}
System.out.println(nextTerm);

}
}