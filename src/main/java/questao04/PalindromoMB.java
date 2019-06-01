package questao04;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class PalindromoMB
{	
	@Inject
	Palindromo p;
	String palavra;
	String msg;
	
	//Aqui eu so chamo as funções passando o valor informado na pagina
	public void testaPalindromo(String palavra)
	{
		if (p.temNumero(palavra))
		{
			msg = "Entrada inválida";
		} 
		else if (p.testaSemAlterar(palavra)) 
		{
			msg=palavra;
		}
		else 
		{
			palavra = p.testeRetirandoLetras(palavra);
			
			if (palavra.length() > 1)
			{
				msg = palavra;
				
			} else
			{
				msg="Sem resultados";
			}
		}
	}

	public Palindromo getService()
	{
		return p;
	}

	public void setService(Palindromo service)
	{
		this.p = service;
	}

	public String getPalavra()
	{
		return palavra;
	}

	public void setPalavra(String palavra)
	{
		this.palavra = palavra;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}
	
}
