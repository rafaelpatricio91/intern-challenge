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
	
	int valor, valor2;
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

	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)
	{
		this.valor = valor;
	}

	public int getValor2()
	{
		return valor2;
	}

	public void setValor2(int valor2)
	{
		this.valor2 = valor2;
	}
	
}
