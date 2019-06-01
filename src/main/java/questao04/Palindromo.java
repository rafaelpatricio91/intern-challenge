package questao04;

public class Palindromo
{
	private String palavraFixa="";
	String temp="";
	String palindromo="";
	
	//Função que verifica se tem numero na string, invalidando a entrada
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
	
	//armazena o inverso da palavra informada na var temp
	public String invertePalavra(String palavra)
	{
		for (int i = palavra.length()-1; i >= 0; i--)
		{
			temp += palavra.charAt(i);
		}
		System.out.println(temp);
		return temp;
	}
	
	//testa se é palindromo sem mexer na palavra
	public boolean testaSemAlterar(String palavra)
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
	
	//começa a retirar letras pra tentar encontar o palindromo
	public String testeRetirandoLetras(String palavra)
	{
		int i = 1;
		this.palavraFixa = palavra;
		if (!(palavra.equalsIgnoreCase(temp) && palavra.isEmpty()) ) 
		{
			//testa enquanto a palavra tiver mais que um caractere, já que excluimos palidromos de 1 letra
			while (palavra.length() > 1 && !palavra.equals(temp) && !palavra.isEmpty())
			{
				temp = "";
				palavra = palavraFixa;
				temp = invertePalavra(palavra);
				//inverte a palavra e atribui a temp
				
				temp = temp.substring(i); //retira a primeira letra da palavra invertida
				palavra = palavra.substring(0, palavra.length()-i); //retira a ultima letra da palavra normal
				
				if (palavra.equalsIgnoreCase(temp) && palavra.length()>1)
				{
					return palavra;
					//testa se sao palindromos agora e retorna a palavra
				}
	
				if (!(palavra.equalsIgnoreCase(temp) && palavra.isEmpty()) ) 
				{
					temp = "";
					palavra = palavraFixa;
					temp = invertePalavra(palavra);
					//restauro a palavra para o estado normal e crio o inverso dela em temp
					
					palavra = palavra.substring(i);
					temp = temp.substring(0, temp.length()-i);
					//refaço o processo retirada de letras anterior porem ao inverso
					//toda vez que ele passar por aqui, enquanto estiver dentro do while
					//ele vai tirar mais letras, ate que a palavra tenha duas letras ou ache o palindromo
					//pois eu mando tirar o numero de letras de acordo com o indice que incrementa
					
					if (palavra.equalsIgnoreCase(temp))
					{
						return palavra;
						//testo se sao palindromos agora e retorno a palavra
					}
				}
				
				if (!(palavra.equalsIgnoreCase(temp) && palavra.isEmpty()) )  
				{
					temp = "";
					palavra = palavraFixa;
					temp = invertePalavra(palavra);
					//restauro tudo novamente
					
					temp = temp.substring(i);
					palavra = palavra.substring(0, palavra.length()-i);
					palavra = palavra.substring(i);
					temp = temp.substring(0, temp.length()-i);
					//dessa vez eu retiro uma letra do inicio e outra do fim da palavra e da sua inversa e testo
					//nesse if eu consigo pegar o palindromo de bananas por exemplo
					
					if (palavra.equalsIgnoreCase(temp) && !palavra.isEmpty())
					{
						return palavra;
						//testo se sao palindromos agora e retorno a palavra
					}
					
				}
				i++;
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
