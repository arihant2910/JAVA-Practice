import java.util.*;
public class  SumOfEven{

	public static void main(String[] args) {
		int sum=0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}