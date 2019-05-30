package questao01;

public class Teste
{
	public static void main(String[] args)
	{
		int x1=0, x2=1, x3=1, cx3=0, val=0;
		
		for (int i = 0; i < val+1; i++)
		{
			cx3 = x3;
			x3 += x2;
			x2 = cx3;
			x1 = x3-x2;
			
			if (val == 0)
			{
				System.out.println("Anterior: " + (x3 - x3) );
				break;
			}
			
			else if (x3 >= val)
			{
				System.out.println("Anterior: " + x2);
				break;
			}
			
		}
		
//		System.out.println(x1+", "+x2+", "+x3);
		
	}
}
