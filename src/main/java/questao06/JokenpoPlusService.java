package questao06;

import javax.inject.Inject;

public class JokenpoPlusService
{
	@Inject
	Partida p;
	
	String msg="";
	
	public String jokenpo(Integer v1, Integer v2)
	{
		switch (v1)
		{
		case 1:
			switch (v2)
			{
			case 1:
				msg="EMPATE"; break;
			case 2:
				msg="PERDEU! PAPEL EMBRULHA PEDRA"; break;
			case 3:
				msg="VENCEU! PEDRA DESTRÓI TESOURA"; break;
			case 4:
				msg="VENCEU! PEDRA ESMAGA LAGARTO"; break;
			case 5:
				msg="PERDEU! SPOCK VAPORIZA PEDRA"; break;
			default:
				msg="Opção Inválida";
			} break;
			
		case 2:
			switch (v2)
			{
			case 1:
				msg="VENCEU! PAPEL EMBRULHA PEDRA"; break;
			case 2:
				msg="EMPATE"; break;
			case 3:
				msg="PERDEU! TESOURA CORTA PAPEL"; break;
			case 4:
				msg="PERDEU! LAGARTO COME PAPEL"; break;
			case 5:
				msg="VENCEU! PAPEL REFUTA SPOCK"; break;
			default:
				msg="Opção Inválida";
			} break;
		case 3:
			switch (v2)
			{
			case 1:
				msg="PERDEU! PEDRA DESTROI TESOURA"; break;
			case 2:
				msg="VENCEU! TESOURA CORTA PAPEL"; break;
			case 3:
				msg="EMPATE"; break;
			case 4:
				msg="VENCEU! TESOURA DECAPITA LAGARTO"; break;
			case 5:
				msg="PERDEU! SPOCK ESMAGA TESOURAS"; break;
			default:
				msg="Opção Inválida";
			} break;
			
		case 4:
			switch (v2)
			{
			case 1:
				msg="PERDEU! PEDRA ESMAGA LAGARTO"; break;
			case 2:
				msg="VENCEU! LAGARTO COME O PAPEL"; break;
			case 3:
				msg="PERDEU! TESOURA DECAPITA LAGARTO"; break;
			case 4:
				msg="EMPATE"; break;
			case 5:
				msg="VENCEU! LAGARTO ENVENENA SPOCK"; break;
			default:
				msg="Opção Inválida";
			} break;
			
		case 5:
			switch (v2)
			{
			case 1:
				msg="VENCEU! SPOCK VAPORIZA PEDRA"; break;
			case 2:
				msg="PERDEU! PAPEL REFUTA SPOCK"; break;
			case 3:
				msg="VENCEU! SPOCK ESMAGA TESOURAS"; break;
			case 4:
				msg="PERDEU! LAGARTO ENVENENA SPOCK"; break;
			case 5:
				msg="EMPATE"; break;
			default:
				msg="Opção Inválida";
			} break;
		
		default: msg="Opção Inválida"; break;
		}
		return msg;
	}
}
