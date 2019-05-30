package questao02;

import javax.inject.Inject;

import questao02.model.NumeroPerfeito;

public class NumeroPerfeitoService
{
	@Inject
	private NumeroPerfeito p;
	@Inject
	private NumeroPerfeitoService s;
	int valor;
	
	public boolean calculaNumPerfeito(int valor)
	{
		System.out.println("service entrou " + valor);
		for (int i = 1; i < valor; i++)
		{
			if ( (valor%i)==0 )
			{
				p.setSum( (p.getSum() + i) );
			}
		}
		
		if (p.getSum() == valor)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		
	}

	public NumeroPerfeito getP()
	{
		return p;
	}

	public void setP(NumeroPerfeito p)
	{
		this.p = p;
	}

	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)
	{
		this.valor = valor;
	}

	public NumeroPerfeitoService getS()
	{
		return s;
	}

	public void setS(NumeroPerfeitoService s)
	{
		this.s = s;
	}
	

}

