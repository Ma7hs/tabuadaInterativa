package br.senai.sp.jandira;

import br.sp.senai.jandira.gui.frameTabuada;
import br.sp.senai.jandira.model.Tabuada;

public class appTabuada {

	public static void main(String[] args) {
		
		frameTabuada tela = new frameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 400;
		tela.largura = 350;
		tela.criarTela();

		Tabuada tabuada = new Tabuada();

		tabuada.maxMultiplicador = 10;
		tabuada.minMultiplicador = 4;
		tabuada.multiplicandoNumero = 5;

		String[] resultado = tabuada.getTabuada();
		
		int contador = 0;
		
		while (contador < resultado.length) {
			
			System.out.println(resultado[contador]);
			contador++;
	
		}
	}
}
