package br.sp.senai.jandira.model;

public class Tabuada {

	public int minMultiplicador;
	public int maxMultiplicador;
	public int multiplicandoNumero;

	public String[] getTabuada() {

		int tamanho = maxMultiplicador - minMultiplicador + 1;

		String tabuada[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicandoNumero * minMultiplicador;
			String resultado = multiplicandoNumero + " x " + minMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minMultiplicador++;
		}

		return tabuada;

	}
}
