package questao06;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class JokenpoMB
{
	@Inject
	JokenpoPlusService service;
	@Inject
	Partida p;
	
	public void realizarPartida(Integer v1, Integer v2)
	{
		p.setQuemGanhou(service.jokenpo(v1, v2));
	}

	public JokenpoPlusService getService()
	{
		return service;
	}

	public void setService(JokenpoPlusService service)
	{
		this.service = service;
	}

	public Partida getP()
	{
		return p;
	}

	public void setP(Partida p)
	{
		this.p = p;
	}
	
	
}
