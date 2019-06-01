package questao05;

public class NumberCount
{
	public static void main(String[] args)
	{
		Integer valorA=5987, valorB=6123;
		int array[] = new int[10];
		
		String str;
		
		//for a partir do valor A indo ate B
		for (Integer i = valorA; i <= valorB; i++)
		{
			Integer nnn;
			str = i.toString(); //transformo o i em string e jogo em str
			char vetc[] = str.toCharArray(); //transformo a string str em um array de char
			
			for (char c : vetc)
			{
				nnn = c - '0'; // percorro o array de char, pego o elemento, jogo pra nnn(Integer) novamente
				array[nnn]++; //e digo que a posição daquele array incrementa em 1
				//é preciso reconverter de c(char) pra nnn(Integer) pois senao nao consigo usar ele como indice na
				//linha acima. o array nao reconhece char como indice
			}
		}
		
		//mando escrever como ficou o array no final de tudo
		for (int n : array)
		{
			System.out.println(n);
		}
		
	}
	
}
