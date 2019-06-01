package questao05;

public class NumberCount
{
	public static void main(String[] args)
	{
		Integer valorA=5987, valorB=6123;
		int inteiro, resto;
		int array[] = new int[10];
		
		String str;
		
		for (Integer i = valorA; i <= valorB; i++)
		{
			Integer nnn;
			str = i.toString();
			char vetc[] = str.toCharArray();
			
			for (char c : vetc)
			{
				nnn = c - '0';
				
				array[nnn]++;
			}
		}
		
		for (int n : array)
		{
			System.out.println(n);
		}
		
	}
	
}
