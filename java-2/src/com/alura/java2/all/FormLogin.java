package com.alura.java2.all;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormLogin {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtComputador;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogin window = new FormLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormLogin() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 268, 147);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 85, 14);
		frame.getContentPane().add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(107, 11, 135, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblComputador = new JLabel("Computador");
		lblComputador.setBounds(10, 42, 85, 14);
		frame.getContentPane().add(lblComputador);

		txtComputador = new JTextField();
		txtComputador.setBounds(107, 42, 135, 20);
		frame.getContentPane().add(txtComputador);
		txtComputador.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(157, 77, 85, 23);
		frame.getContentPane().add(btnSalvar);
	}
}
