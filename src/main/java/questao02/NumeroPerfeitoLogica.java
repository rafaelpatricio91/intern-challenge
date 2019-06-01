package questao02;

import javax.inject.Inject;

import questao02.model.NumeroPerfeito;

public class NumeroPerfeitoLogica
{
	@Inject
	private NumeroPerfeito p;
	int v, sum;
	
	public boolean calculaNumPerfeito(int valor)
	{
		for (int i = 1; i < valor; i++)
		{ 	//testa se o número é par e acumula o somatório dos numeros divisiveis
			if ( (valor%i)==0 )
			{
				p.setSum( (p.getSum() + i) );
			}
		}
		
		//Se o somatório dos divisores for igual ao valor, o numero é perfeito
		if (p.getSum() == valor)
		{
			return true;
		}
		else 
		{
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

