import java.util.*;

public class SumorProduct {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        switch(c){
            case 1:
                int sum=0;
                for(int i=1;i<=n;i++){
                    
                    sum=sum+i;
                }
                System.out.println(sum);
                break;
            case 2:
                int product=1;
                for(int i=1;i<=n;i++){
                    
                    product=product*i;
                }
                System.out.println(product);
                break;
            default:
                System.out.println("-1");
                
        }

	}
}
