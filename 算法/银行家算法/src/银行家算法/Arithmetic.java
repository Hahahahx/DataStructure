package 银行家算法;

public class Arithmetic {
	
	private String Pid[] = new String[4];
	private int Max[] = new int[4];
	private int Need[] = new int[4];
	private int Allocation[] = new int[4];
	public int Finish = 0;
	
	
	public Arithmetic() {}
	
	public Arithmetic(int []max,int []allocation)
	{
		for (int i= 0 ; i < Allocation.length; i ++)
		{
			Pid[i] = "R"+(i+1) ;
			Max[i] = max[i];
			Allocation [i] = allocation[i];
			Need[i] = Max[i] - Allocation[i];
			
		}
	}
	
	public boolean Judge(int[] Available) {
		
		for (int i = 0 ;i <Available.length ; i ++)
		{
			if (Need[i]>Available[i])
			{
				return false;
			}
		}
		Finish = 1;
		return true;
		
	}

	public void Add(int Available[])
	{
		for (int i = 0 ;i <Available.length; i ++)
		{
			Available[i] += Allocation[i];
		}
	}
    
	public void Show ()
	{
		System.out.print("Pid:       ");
		for (String i : Pid)
		{
			System.out.print(i+" ");
		}
		System.out.print("\nAllocation:");
		for (int i : Allocation)
		{
			System.out.print(i+"  ");
		}
		System.out.print("\nMax:       ");
		for (int i : Max)
		{
			System.out.print(i+"  ");
		}
		System.out.print("\nNeed:      ");
		for (int i : Need)
		{
			System.out.print(i+"  ");
		}
	}
	
	public static void BankerArithmetic(Arithmetic P[],int Available[] ) 
	{
		int Safe=0;
		int  Flag = 0;
		
		for(int j = 0 ;j < P.length ; j++)
		{
			int p = 0;
			for (int i = 0 ;i <P.length; i ++)
			{
				
				if ((P[i].Finish != 1)&&(P[i].Judge(Available)))
				{
					P[i].Add(Available);
					Safe= i+1;
					Flag = 0;
					break;
				}
				else 
				{
					Flag = 1;
				}
				
			}
			

			if (Flag == 1)
			{
				System.out.print("无安全序列！");
			}
			else 
			{
					System.out.print("  p"+Safe);
			
		    }
			
		}
			
	}
	
}
