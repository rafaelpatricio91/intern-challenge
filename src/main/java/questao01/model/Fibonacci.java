package questao01.model;

public class Fibonacci
{
	private Long ultimo=1L;
	private Long penultimo=1L;
	private Long antipenultimo=0L;
	
	public Long getUltimo()
	{
		return ultimo;
	}
	public void setUltimo(Long ultimo)
	{
		this.ultimo = ultimo;
	}
	public Long getPenultimo()
	{
		return penultimo;
	}
	public void setPenultimo(Long penultimo)
	{
		this.penultimo = penultimo;
	}
	public Long getAntipenultimo()
	{
		return antipenultimo;
	}
	public void setAntipenultimo(Long antipenultimo)
	{
		this.antipenultimo = antipenultimo;
	}
	
	
}
