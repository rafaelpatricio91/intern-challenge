package questao01.manager;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import questao01.service.FibonacciService;

@Named
@RequestScoped
public class FiboMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private FibonacciService fs;
	Long val;
	Long val2;
	
	public void calcular(Long val)
	{
		val2 = fs.retornaValorAnterior(val);
//		val2 = val;
		System.out.println(val2);
	}

	public FibonacciService getFs()
	{
		return fs;
	}

	public void setFs(FibonacciService fs)
	{
		this.fs = fs;
	}

	public Long getVal()
	{
		return val;
	}

	public void setVal(Long val)
	{
		this.val = val;
	}

	public Long getVal2()
	{
		return val2;
	}

	public void setVal2(Long val2)
	{
		this.val2 = val2;
	}
	
}

