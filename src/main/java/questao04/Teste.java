package questao04;

public class Teste
{
	public static void main(String[] args)
	{
		Palindromo ps = new Palindromo();
		String palavra="banana5";
		ps.setPalavraFixa(palavra);
		
		if (ps.testaSemAlterar(palavra))
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
