package questao01.service;

import javax.inject.Inject;

import questao01.model.Fibonacci;

public class FibonacciLogica
{
	@Inject
	private Fibonacci f;
	
	public Long retornaValorAnterior(Long val)
	{
		Long aux=0L, valorFinal=0L;
		
		//utilizao, além da var aux acima, os três atributos da classe Fibonacci. São eles: ultimo, penultimo e antipenultimo,
		//que representam esses valores independente de onde eu estiver na sequência.
		//Ex: quando eu estiver no valor 13 da sequencia, o ultimo terá valor 13, penultimo 8 e antipenultimo o valor 5.
		//Dessa forma eu tenho total controle do que fazer dentro da sequência.
		
		//For até um valor qualquer, visto que ele nunca vai fazer loop até ele, sempre parando antes
		//val+1 somente pra ele executar mesmo assim caso a entrada seja 0
		for (int i = 0; i < val+1; i++) 
		{
			aux = f.getUltimo();
			f.setUltimo( (aux+f.getPenultimo()) );
			f.setPenultimo(aux);
			f.setAntipenultimo( (f.getUltimo()-f.getPenultimo()) );
			//A regra acima foi o padrão que eu identifiquei pra seguirem a sequência
			//antipenultimo + penultimo = ultimo /  ultimo - penultimo = antipenultimo / ultimo - antipenultimo = penultimo
			
			//como me atributo que retorna (penultimo) já inicia com 1, se a entrada fosse 0 ele retornaria o 1 incorretamente
			//por isso essa exceção
			if (val == 0) 
			{
				valorFinal = 0L;
				break;
			}
			
			//quando o ultimo valor iguala ou ultrapassa o valor informado, paro a execução e retorno o penultimo valor
			else if (f.getUltimo() >= val)
			{
				valorFinal = f.getPenultimo();
				break;
			}
		}
		
		return valorFinal;
	}

	public Fibonacci getF()
	{
		return f;
	}

	public void setF(Fibonacci f)
	{
		this.f = f;
	}
	
	
}
