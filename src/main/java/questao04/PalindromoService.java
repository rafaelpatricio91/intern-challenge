package questao04;

public class PalindromoService
{
	private String palavraFixa="";
	String palavra=palavraFixa;
	String temp="";
	String palindromo="";
	
	public boolean temNumero(String p) {  
		boolean bol = false;  
		for ( int i = 0; i < p.length(); i++ ) { 
			if ( Character.isDigit( p.charAt(i) ) ) 
			{  
				bol = true;  
				break;  
			}  
		}  
	return bol;  
	}
	
	public String invertePalavra(String palavra)
	{
		for (int i = palavra.length()-1; i >= 0; i--)
		{
			temp += palavra.charAt(i);
		}
		
		return temp;
	}
	
	public boolean testeSemAlterar(String palavra)
	{
		boolean bol = false;
		if (palavra.equals(invertePalavra(palavra)) && !palavra.isEmpty())
		{
			palindromo = palavra;
			System.out.println("Palindromo: " + palindromo );
			bol = true;
			return bol;
		}
		
		return bol;
	}
	
	public String testeRetirandoLetras(String palavra)
	{
		int i = 1;
		if (!(palavra.equalsIgnoreCase(temp) && palavra.isEmpty()) ) 
		{
			while (palavra.length() > 1 && !palavra.equals(temp) && !palavra.isEmpty())
			{
				temp = "";
				palavra = palavraFixa;
				temp = invertePalavra(palavra);
				
				temp = temp.substring(i);
				palavra = palavra.substring(0, palavra.length()-i);
				System.out.println("temp1: "+ temp);
				System.out.println("palavra1: " + palavra);
				
				if (palavra.equalsIgnoreCase(temp) && palavra.length()>1)
				{
					System.out.println("palindromo1 = " + palavra);
					return palavra;
				}
	
				if (!(palavra.equalsIgnoreCase(temp) && palavra.isEmpty()) ) 
				{
					temp = "";
					palavra = palavraFixa;
					temp = invertePalavra(palavra);
					palavra = palavra.substring(i);
					temp = temp.substring(0, temp.length()-i);
					System.out.println("palavra2: " + palavra);
					System.out.println("temp2: "+ temp);
					
					if (palavra.equalsIgnoreCase(temp))
					{
						System.out.println("palindromo2 = " + palavra);
						return palavra;
					}
				}
				
				if (!(palavra.equalsIgnoreCase(temp) && palavra.isEmpty()) )  
				{
					temp = "";
					palavra = palavraFixa;
					temp = invertePalavra(palavra);
					
					temp = temp.substring(i);
					palavra = palavra.substring(0, palavra.length()-i);
					palavra = palavra.substring(i);
					temp = temp.substring(0, temp.length()-i);
					System.out.println("palavra3: " + palavra);
					System.out.println("temp3: "+ temp);
					
					if (palavra.equalsIgnoreCase(temp) && !palavra.isEmpty())
					{
						System.out.println("palindromo3 = " + palavra);
						return palavra;
					}
					
				}
				i++;
			}
			
			if (palavra.length() <= 0)
			{
				System.out.println("sem resultado");
			}
		}
		return palavra;
	}

	public String getPalavraFixa()
	{
		return palavraFixa;
	}

	public void setPalavraFixa(String palavraFixa)
	{
		this.palavraFixa = palavraFixa;
	}
		
	
	
}
