
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class sistemaAdocao extends JFrame 
{
	private JButton cadAdotante;
	private JButton consulAdotante;
	private JButton cadGato;
	private JButton consulGato;
	private JButton adotarGato;
	private JButton relatorioProvisoes;
	
	private ArrayList<Gato> listaGatos = new ArrayList<>();
	private ArrayList<Adotante> listaAdotantes = new ArrayList<>();
	
	Scanner entrada = new Scanner(System.in);

	Adotante adotante = null;
	Gato gato = null;
	
	public sistemaAdocao() 
	{
		this.setTitle("Sistema de adocao de gatos");
		setBounds(0, 0, 1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		cadAdotante = new JButton();
		cadAdotante.setText("cadastrar adotante");
		cadAdotante.setBounds(10, 10, 150, 50);
		this.add(cadAdotante);
		
		consulAdotante = new JButton();
		consulAdotante.setText("Consultar adotantes");
		consulAdotante.setBounds(170, 10, 150, 50);
		this.add(consulAdotante);
		
		cadGato = new JButton();
		cadGato.setText("cadastrar gato");
		cadGato.setBounds(330, 10, 150, 50);
		this.add(cadGato);
		
		consulGato = new JButton();
		consulGato.setText("consulta de gato");
		consulGato.setBounds(500, 10, 150, 50);
		this.add(consulGato);
		
		adotarGato = new JButton();
		adotarGato.setText("adotar gato");
		adotarGato.setBounds(750, 10, 150, 50);
		this.add(adotarGato);
		
		relatorioProvisoes = new JButton();
		relatorioProvisoes.setText("relatorio de provisoes");
		relatorioProvisoes.setBounds(1000, 10, 150, 50);
		this.add(relatorioProvisoes);
		
		cadAdotante.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				adotante = new Adotante();
				adotante.cadastrar();
				listaAdotantes.add(adotante);
			}
		});
		
		consulAdotante.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				adotante.consultaAdotante(listaAdotantes);
			}
		});
		
		cadGato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Gato gato = new Gato();
				gato.cadastrarGato();
				listaGatos.add(gato);
			}
		});
		
		consulGato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gato.consultaGato(listaGatos);
			}
		});
		
		adotarGato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gato.adotarGato(listaGatos);
			}
		});
		
		relatorioProvisoes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gato.relatorioProvisoes(listaGatos);
			}
		});
		
	}
	
	public static void main(String[] args) 
	{
		sistemaAdocao sistema = new sistemaAdocao();
		sistema.setVisible(true);
	}
	
}
