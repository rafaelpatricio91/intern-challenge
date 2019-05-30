package questao04;

public class PalindromoService
{
	String palavraFixa="franca";
	String palavra=palavraFixa;
	String temp="";
	String palindromo="";
	
	public String invertePalavra(String palavra)
	{
		for (int i = palavra.length()-1; i >= 0; i--)
		{
			temp += palavra.charAt(i);
		}
		
		return temp;
	}
//	
//	public void palindromoDireto(String palavra)
//	{
//		if (palavra.equalsIgnoreCase(temp))
//		{
//			System.out.println("palindromo = " + palavra);
//			return palavra;
//		}
//	}
	
	public String retiraLetras(String palavra)
	{
		
		if (!(palavra.equalsIgnoreCase(temp) && palavra.equals("")) ) 
		{
			
			while (palavra.length() > 1 && !palavra.equals(temp) && !palavra.equals(""))
			{
				temp = temp.substring(1);
				palavra = palavra.substring(0, palavra.length()-1);
				System.out.println("temp1: "+ temp);
				System.out.println("palavra1: " + palavra);
				
				if (palavra.equalsIgnoreCase(temp))
				{
					System.out.println("palindromo1 = " + palavra);
					return palavra;
				}
			}
		}
		
		return palavra;
	}
		
	public String retiraLetrasInverso(String palavra)
	{
		temp = "";
		palavra = palavraFixa;
		temp = invertePalavra(palavra);
		System.out.println("temp inicio inverso: "+temp);
		System.out.println("palavra inicio inverso: "+palavra);
		
			if (!(palavra.equalsIgnoreCase(temp) && palavra.equals("")) )  
			{
				while (palavra.length() > 1 && !palavra.equals(temp))
				{
					palavra = palavra.substring(1);
					temp = temp.substring(0, temp.length()-1);
					System.out.println("temp2: "+ temp);
					System.out.println("palavra2: " + palavra);
					
					if (palavra.equalsIgnoreCase(temp))
					{
						System.out.println("palindromo2 = " + palavra);
						return palavra;
					}
				}
				
			}
			return palavra;
	}
		
	
	public void escrevePalidromo(String palavra)
	{
		System.out.println("palavra: " + palavra);
//		this.invertePalavra(palavra);
//		System.out.println("1 inverte palavra: " +this.invertePalavra(palavra));
		if (palavra.equals(invertePalavra(palavra)))
		{
			palindromo = palavra;
			System.out.println("Palindromo direto: " + palindromo );
		}
		
//		this.retiraLetras(palavra);
//		this.retiraLetrasInverso(palavra);
		
		if (this.retiraLetras(palavra).length() > this.retiraLetrasInverso(palavra).length() )
		{
			System.out.println("retiraLetras1: " + this.retiraLetras(palavra));
		}
		
		if ( !(this.retiraLetras(palavra).length() > this.retiraLetrasInverso(palavra).length() ) )
		{
			System.out.println("retiraLetras2: " + this.retiraLetrasInverso(palavra));
		}
	}
}
