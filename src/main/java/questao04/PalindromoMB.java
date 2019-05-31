package questao04;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class PalindromoMB
{	
	@Inject
	PalindromoService service;
	String palavra;
	String msg;
	
	public void testaPalindromo(String palavra)
	{
		if (service.temNumero(palavra))
		{
			msg = "Entrada inválida";
		} 
		else if (service.testaSemAlterar(palavra)) 
		{
			msg=palavra;
		}
		else 
		{
			palavra = service.testeRetirandoLetras(palavra);
			
			if (palavra.length() > 1)
			{
				msg = palavra;
				
			} else
			{
				msg="Sem resultados";
			}
		}
	}

	public PalindromoService getService()
	{
		return service;
	}

	public void setService(PalindromoService service)
	{
		this.service = service;
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
