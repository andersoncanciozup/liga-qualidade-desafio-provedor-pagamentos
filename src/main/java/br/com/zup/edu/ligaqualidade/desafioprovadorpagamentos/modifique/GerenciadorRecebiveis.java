package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique;

import java.util.List;

public class GerenciadorRecebiveis {


//	
//	 * @param infoAdiantamentos informacao da transacao que pode ser recebida
//	 *                          adiantada. A String está formatada da seguinte
//	 *                          maneira: <b>"idTransacao,taxa"</b>
//	 *                          <ol>
//	 *                          <li>Taxa é um decimal</li>
//	 *                          </ol>

	public String[] adiantamento(List<String> infoAdiantamentos) {
		String[] retorno = new String[2];
		
		retorno[0] = infoAdiantamentos.get(0);

        retorno[1] = "3";

		return retorno;
	}
	
	public List<String> semAdiantamento() {
		return null;
	}
	
	
}
