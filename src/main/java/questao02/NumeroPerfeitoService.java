package questao02;

import javax.inject.Inject;

import questao02.model.NumeroPerfeito;

public class NumeroPerfeitoService
{
	@Inject
	private NumeroPerfeito p;
	int v, sum;
	
	public boolean calculaNumPerfeito(int valor)
	{
		System.out.println("service entrou " + valor);
		System.out.println("getsum: " + (p.getSum() + 1)) ;
		for (int i = 1; i < valor; i++)
		{ System.out.println(i);
			if ( (valor%i)==0 )
			{
				p.setSum( (p.getSum() + i) );
//				sum += i;
				System.out.println("sum: " + p.getSum());
			}
		}
		
		if (p.getSum() == valor)
		{
			System.out.println("sum: " + p.getSum());
			return true;
		}
		else 
		{
			System.out.println("sum: " + p.getSum());
			return false;
		}
	}
	
	public NumeroPerfeito getP()
	{
		return p;
	}

	public void setP(NumeroPerfeito p)
	{
		this.p = p;
	}

}

