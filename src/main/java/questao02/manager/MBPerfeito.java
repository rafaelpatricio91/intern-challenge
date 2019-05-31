package questao02.manager;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import questao02.NumeroPerfeitoService;
import questao02.model.NumeroPerfeito;

@Named
@RequestScoped
public class MBPerfeito implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private NumeroPerfeito perfeito;
	@Inject
	private NumeroPerfeitoService s;
	
	Integer valor;
	String mensagem;
	
	public void checaNumPerfeito(int valor)
	{
		if (s.calculaNumPerfeito(valor) == true) //s.calculaNumPerfeito(valor)
		{
			mensagem = " é perfeito";
		} 
		else 
		{
			mensagem = " NÃO é perfeito";
		}
	}
	
	public NumeroPerfeito getPerfeito()
	{
		return perfeito;
	}

	public void setPerfeito(NumeroPerfeito perfeito)
	{
		this.perfeito = perfeito;
	}
	public String getMensagem()
	{
		return mensagem;
	}
	public void setMensagem(String mensagem)
	{
		this.mensagem = mensagem;
	}

	public NumeroPerfeitoService getS()
	{
		return s;
	}

	public void setS(NumeroPerfeitoService s)
	{
		this.s = s;
	}

	public Integer getValor()
	{
		return valor;
	}

	public void setValor(Integer valor)
	{
		this.valor = valor;
	}
}
