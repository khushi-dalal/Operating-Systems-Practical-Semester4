import java.util.*;

class Print{
	int count = 1;
	
	void printf()
	{
		for(int j = 1; j<= count; j++)
		{
			System.out.print(j + " ");
		}
		System.out.println();
		count++;
		
	}
	
	void printb()
	{
		for(int j = count; j>=1; j--)
		{
			System.out.print(j + " ");
		}
		System.out.println();
		count ++;
	}
}

public class Pattern1 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Print p = new Print();
		for(int i = 0; i<n; i++)
		{
			p.printf();
			p.printb();
		}
		
		if(n%2== 1)
		{
			p.printf();
		}
		
	}
}
