package questao04;

public class Teste
{
	public static void main(String[] args)
	{
		PalindromoService ps = new PalindromoService();
		String palavra="banana5";
		ps.setPalavraFixa(palavra);
		
		if (ps.testeSemAlterar(palavra))
		{
			System.out.println("palindromo: " + palavra);
		}
		
		if (ps.temNumero(palavra))
		{
			System.out.println("invalido tem numero ai");
		}
		else
		{
			ps.testeRetirandoLetras(palavra);
		}
		
		
	}
	
	
}
