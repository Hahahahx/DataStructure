package 银行家算法;
import java.util.*;

public class Banker {

	public static void main(String[] args) {
		
		Arithmetic P[]  = new Arithmetic[5];
		int Available[]  = new int[]{1,2,2,2};
		int p = 0;
		
		while(p<5)
		{
			int Max[] = new int[4];
			int Allocation[] = new int[4];
			
			System.out.println("P"+p);
			System.out.print("Max");
			
			Scanner in = new Scanner(System.in);
			
		    for (int i = 0 ; i <Max.length; i ++)
		    {
		    	Max[i] = in.nextInt();
		    }
		    
		    System.out.print("Allocation");
		    for (int i = 0 ; i <Allocation.length; i ++)
		    {
		    	Allocation[i] = in.nextInt();
		    }
		    
			P[p] = new Arithmetic(Max,Allocation);
	        p++;
		}
		
		
		
		for (int i =0; i <P.length ; i++)
		{
			System.out.println("\nP"+(i+1));
			P[i].Show();
		}
		System.out.println();
		Arithmetic.BankerArithmetic(P, Available);
		

	}
	
	

}
