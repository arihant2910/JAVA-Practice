import java.util.*;
public class FarenhiteToCelsius {


	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner (System.in);
   
    int s= sc.nextInt();
    int e= sc.nextInt();
         int w= sc.nextInt();
	int c=0;
        
        while(s<=e){
            c= (s-32)*5/9;
            System.out.println(s+"\t"+c);
            s=s+w;
        }
		
	}

}
