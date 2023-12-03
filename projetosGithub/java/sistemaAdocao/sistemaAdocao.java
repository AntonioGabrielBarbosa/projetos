
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
				Adotante adotante = new Adotante();
				adotante.cadastrar();
				listaAdotantes.add(adotante);
			}
		});
		
		consulAdotante.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(Adotante adotante2 : listaAdotantes) 
				{
					String nome = adotante2.getNomeCompleto();
					String cpf = adotante2.getCpf();
					String telefone = adotante2.getTelefone();
					String endereco = adotante2.getEndereco();
					
					JOptionPane.showMessageDialog(null, "Nome: \n" + nome + "\n" + 
					"cpf: \n" + cpf + "\n" + "telefone: \n" + telefone + "\n" +
							"endereco: \n" + endereco + "\n", "resultado", JOptionPane.INFORMATION_MESSAGE);
				}
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
				for(Gato gato2 : listaGatos) 
				{					
					String nome = gato2.getNome();
					String apelido = gato2.getApelido();
					String nomeRacao = gato2.getNome();
					String dataEntrada = gato2.getDataEntrada();
					String cpfAdotante = gato2.getCpfAdotante();
					String dataSaida = gato2.getDataSaida();
					String raca = gato2.getRaca();
					String sexo = gato2.getSexo();
					int idade = gato2.getIdadeAproximada();
					int codUnico = gato2.getCodigoUnico();
					double peso = gato2.getPeso();
					double quantidadeRacao = gato2.getQuantidadeRacao();
					
					JOptionPane.showMessageDialog(null, "Nome: \n" + nome + "\n"
							+ "Apelido: \n" + apelido + "\n" +
							"nome da racao: \n" + nomeRacao + "\n" +
							"data de entrada: \n" + dataEntrada + "\n" +
							"data de saida: \n" + dataSaida + "\n" +
							"cpf do adotante: \n" + cpfAdotante + "\n" +
							"raca: \n" + raca + "\n" + "sexo: \n" + sexo + "\n" +
							"idade aproximada: \n" + idade + "\n" + 
							"codigo unico: \n" + codUnico + "\n" +
							"peso: \n" + peso + "Kg" + "\n" +
							"quantidade de racao: \n" + quantidadeRacao + "g" + "\n", "resultado", JOptionPane.INFORMATION_MESSAGE);
					
					
				}
			}
		});
		
		adotarGato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cpfEscolhido = JOptionPane.showInputDialog("cpf do adotante");
				int codUnicoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("codigo unico do gato que sera adotado"));
				for(Gato gato2: listaGatos) 
				{	
					int codUnico = gato2.getCodigoUnico();
					
					if(codUnico == codUnicoEscolhido) 
					{
						gato2.setCpfAdotante(cpfEscolhido);
						gato2.setDataSaida(JOptionPane.showInputDialog("Data de saida"));
						break;
					}
					
				}
			}
		});
		
		relatorioProvisoes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(Gato gato3: listaGatos) 
				{	
					String cpfAdotante = gato3.getCpfAdotante();
					if(cpfAdotante.equalsIgnoreCase("nenhum")) 
					{
						String nome = gato3.getNome();
						String apelido = gato3.getApelido();
						String nomeRacao = gato3.getNomeRacao();
						String dataEntrada = gato3.getDataEntrada();
						String dataSaida = gato3.getDataSaida();
						String raca = gato3.getRaca();
						String sexo = gato3.getSexo();
						int idade = gato3.getIdadeAproximada();
						int codUnico = gato3.getCodigoUnico();
						double peso = gato3.getPeso();
						double quantidadeRacao = gato3.getQuantidadeRacao();
						double quantidadeRacaoSemanal = quantidadeRacao * 7;
						
						
						JOptionPane.showMessageDialog(null, "Nome: \n" + nome + "\n"
								+ "Apelido: \n" + apelido + "\n" +
								"nome da racao: \n" + nomeRacao + "\n" +
								"data de entrada: \n" + dataEntrada + "\n" +
								"data de saida: \n" + dataSaida + "\n" +
								"cpf do adotante: \n" + cpfAdotante + "\n" +
								"raca: \n" + raca + "\n" + "sexo: \n" + sexo + "\n" +
								"idade aproximada: \n" + idade + "anos" + "\n" + 
								"codigo unico: \n" + codUnico + "\n" +
								"peso: \n" + peso + "Kg" + "\n" +
								"quantidade de racao por semana: \n" + quantidadeRacaoSemanal + "g" + "\n", "resultado", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
	}
	
	public static void main(String[] args) 
	{
		sistemaAdocao sistema = new sistemaAdocao();
		sistema.setVisible(true);
	}
	
}
