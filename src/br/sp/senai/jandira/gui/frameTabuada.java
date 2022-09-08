package br.sp.senai.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import br.sp.senai.jandira.model.Tabuada;

public class frameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public int textoMultiplicador;
	public int textoMinMultiplicador;
	public int textoMaxMultiplicador;

	public void criarTela() {

		Font fonteTitulo = new Font("Berlin Sans FB Demi", Font.BOLD, 30);
		Font fontePequena = new Font("Berlin Sans FB Demi", Font.BOLD, 15);
		Font fonteBotao = new Font("Berlin Sans FB Demi", Font.BOLD, 15);
		JFrame tela = new JFrame();

		tela.setTitle(titulo); // Definimos que SetTitle vai receber um t�tulo;
		tela.setSize(largura, altura); // Definimos que SetSize vai definir o tamanho da janela
		tela.setBackground(Color.black); // Setando cor para preto
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sair ao Fechar o aplicativo e n�o rodar em segundo plano
		tela.setLayout(null); // Falando pro Java nao colocar mais nenhuma regra, pois somo n�s quem mandamos!

		Container painelContainer = tela.getContentPane();
		painelContainer.setBackground(Color.black);

		JLabel tituloApp = new JLabel();
		tituloApp.setText("Tabuada v2");
		tituloApp.setBounds(30, 10, 170, 30);
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
		maxMultiplicador.setBounds(30, 170, 250, 30);
		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setFont(fontePequena);
		textMaxMultiplicador.setBounds(30, 195, 215, 30);

		JLabel minMultiplicador = new JLabel();
		minMultiplicador.setText("Digite o mínimo multiplicador: ");
		minMultiplicador.setBounds(30, 120, 250, 30);
		minMultiplicador.setFont(fontePequena);
		minMultiplicador.setForeground(Color.white);
		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setFont(fontePequena);
		textMinMultiplicador.setBounds(30, 145, 215, 30);

		JLabel resultadoTabuada = new JLabel();
		resultadoTabuada.setText("Resultado: ");
		resultadoTabuada.setBounds(30, 260, 100, 100);
		resultadoTabuada.setFont(fontePequena);
		resultadoTabuada.setForeground(Color.white);

		JButton btnCalcularTabuada = new JButton();
		btnCalcularTabuada.setText("Calcular tabuada!");
		btnCalcularTabuada.setBounds(30, 240, 160, 30); // Colocando parametros no bot�o para configurar!
		btnCalcularTabuada.setFont(fonteBotao);
		btnCalcularTabuada.setForeground(Color.white);
		btnCalcularTabuada.setBackground(Color.orange);

		JButton btnLimparTabuada = new JButton();
		btnLimparTabuada.setText("Limpar!");
		btnLimparTabuada.setBounds(200, 240, 120, 30); // Colocando parametros no bot�o para configurar!
		btnLimparTabuada.setFont(fonteBotao);
		btnLimparTabuada.setForeground(Color.white);
		btnLimparTabuada.setBackground(Color.orange);

		JList<String> listaTabuada = new JList<String>();
		listaTabuada.setForeground(Color.white);
		listaTabuada.setBackground(Color.orange);

		JScrollPane scroll = new JScrollPane(listaTabuada);
		scroll.setBounds(30, 330, 305, 300);

		btnCalcularTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listaTabuada.setForeground(Color.black);

				Tabuada btnMultiplicar = new Tabuada();

				btnMultiplicar.multiplicandoNumero = Integer.parseInt(textMultiplicando.getText());
				btnMultiplicar.maxMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());
				btnMultiplicar.minMultiplicador = Integer.parseInt(textMinMultiplicador.getText());

				String[] resultado = btnMultiplicar.getTabuada();
				listaTabuada.setListData(resultado);

			}
		});

		btnLimparTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listaTabuada.setForeground(Color.orange);

				textMultiplicando.setText("      ");
				textMaxMultiplicador.setText("      ");
				textMinMultiplicador.setText("      ");

			}
		});

		painelContainer.add(tituloApp);
		painelContainer.add(multiplicando);
		painelContainer.add(textMultiplicando);
		painelContainer.add(minMultiplicador);
		painelContainer.add(textMinMultiplicador);
		painelContainer.add(maxMultiplicador);
		painelContainer.add(textMaxMultiplicador);
		painelContainer.add(btnCalcularTabuada);
		painelContainer.add(btnLimparTabuada);
		painelContainer.add(resultadoTabuada);
		painelContainer.add(scroll);

		tela.setVisible(true);

	}

}
