import java.util.*;
public class TotalSalary {
	
	public static void main(String[] args) {
     double  totalSalary=0;
     
        Scanner sc= new Scanner(System.in);
        int BasicSalary = sc.nextInt();
        char grade = sc.next().charAt(0);
        
        double hra = (0.2*BasicSalary);
         double da = (0.5*BasicSalary);
         double pf = (0.11*BasicSalary);
      
		if(BasicSalary>=0&&BasicSalary<=7500000){
        // Write your code here
		if (grade>=65&&grade<=90){
            if(grade=='A'){
            	
                 totalSalary = BasicSalary +hra +da+1700.0-pf;
              
            
                }
            else if(grade=='B'){
              
                 totalSalary = BasicSalary +hra +da+1500.0-pf;
                 
            }
            else{
              totalSalary = BasicSalary +hra +da+1300.0-pf;
                
            }
            
        }
                        

                System.out.println( Math.round(totalSalary));
	}
        
}
}