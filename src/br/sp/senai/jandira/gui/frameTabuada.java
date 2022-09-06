package br.sp.senai.jandira.gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.color.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	
	public void criarTela() {
		
		Font fonteTitulo = new Font("Berlin Sans FB Demi", Font.BOLD, 30);
		Font fontePequena = new Font("Berlin Sans FB Demi", Font.BOLD, 15);
		Font fonteBotao = new Font("Berlin Sans FB Demi", Font.BOLD, 15);
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo); //Definimos que SetTitle vai receber um t�tulo;
		tela.setSize(largura,altura); //Definimos que SetSize vai definir o tamanho da janela
		tela.setBackground(Color.black); //Setando cor para preto
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sair ao Fechar o aplicativo e n�o rodar em segundo plano
		tela.setLayout(null); //Falando pro Java nao colocar mais nenhuma regra, pois somo n�s quem mandamos!
		
		Container painelContainer = tela.getContentPane();
		painelContainer.setBackground(Color.black);
		
		JLabel tituloApp = new JLabel();
		tituloApp.setText("Tabuada v2");
		tituloApp.setBounds(30,10,170,30);
		tituloApp.setFont(fonteTitulo);
		tituloApp.setForeground(Color.orange);
		
		JLabel multiplicando = new JLabel();
		multiplicando.setText("Digite o multiplicador: ");
		multiplicando.setFont(fontePequena);
		multiplicando.setForeground(Color.white);
		multiplicando.setBounds(30, 70, 200, 30);
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBackground(Color.WHITE);
		textMultiplicando.setFont(fontePequena);
		textMultiplicando.setBounds(30, 95, 165, 30);
		
		JLabel maxMultiplicador = new JLabel();
		maxMultiplicador.setText("Digite o máximo multiplicador: ");
		maxMultiplicador.setFont(fontePequena);
		maxMultiplicador.setForeground(Color.white);
		maxMultiplicador.setBounds(30, 120, 250, 30);
		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setFont(fontePequena);
		textMaxMultiplicador.setBounds(30, 145, 215, 30);
		
		JLabel minMultiplicador = new JLabel();
		minMultiplicador.setText("Digite o mínimo multiplicador: ");
		minMultiplicador.setBounds(30, 170, 250, 30);
		minMultiplicador.setFont(fontePequena);
		minMultiplicador.setForeground(Color.white);
		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setFont(fontePequena);
		textMinMultiplicador.setBounds(30, 195, 215, 30);
		
		
		

		
		

		
		painelContainer.add(tituloApp);
		painelContainer.add(multiplicando);
		painelContainer.add(textMultiplicando);		
		painelContainer.add(maxMultiplicador);
		painelContainer.add(textMaxMultiplicador);
		painelContainer.add(minMultiplicador);
		painelContainer.add(textMinMultiplicador);
		
		
		tela.setVisible(true);
		
	}

}
