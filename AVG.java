import java.util.*;
public class AVG {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
        if(a>=0||b>=0||c>=0&&a<=100||b<=100||c<=100){
        int avg =(a+b+c)/3;
        System.out.println(str);
        System.out.println(avg);
        }
		
	}

}
