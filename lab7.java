package OS;
import java.util.Scanner;

public class lab7 
{
	public static void firstFit(char memory_allocation_scenario[], int memory_partition_size[], int m,
			int page_size_array[], int n)
	{
		String allocation[] = new String[m];
		
		for(int i = 0; i < m; i++)
		{
			allocation[i] = String.valueOf(memory_allocation_scenario[i]);
			System.out.print(allocation[i] + " ");
		}
		
		int j;
		for(int i = 0; i < n ; i++)
		{
			System.out.println(page_size_array[i]);
			
			for(j = 0 ; j < m ; j++)
			{
				if(memory_partition_size[j] >= page_size_array[i] && memory_allocation_scenario[j] != 'X' && memory_allocation_scenario[j] != 'R')
				{
					if(allocation[j].equals("-"))
						allocation[j] = String.valueOf(page_size_array[i]);
					
					else 
						allocation[j] = allocation[j] + " " + String.valueOf(page_size_array[i]);
					
					memory_partition_size[j] -= page_size_array[i];
					
					break;
				}
			}
			
			if(j == m)
			{
				for (int k = 0; k < m ; k++)
				{
					System.out.println(allocation[k] + " ");
				}
				
				System.out.println("Error : the remaining memory is not enough");
				
				return;
			}
		}
		
		System.out.println("first fit placement : ");
		for(int i = 0; i < m ; i++)
		{
			System.out.println(allocation[i] + " ");
		}
		
	}
	
	public static void main(String[] args)
	{
		char memory_allocation_scenario[] = { '-', 'X', '-', 'R', '-', 'X', '-'};
		int memory_partition_size[] = {100,20,80,50,50,120,100};
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Speciy total insertation : ");
		
		n = sc.nextInt();
		
		int[] page_size_array = new int[10];
		System.out.println("Input " + n + " inseratations : ");
		
		for(int i = 0 ; i < n ; i++)
		{
			page_size_array[i] = sc.nextInt();
			
		}
		
		firstFit(memory_allocation_scenario, memory_partition_size, 7 , page_size_array, n);
	}
}