
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gato 
{
	private int codigoUnico;
	private static int proximoCodigo = 1;
	private String nome;
	private String apelido;
	private String sexo;
	private String dataEntrada;
	private String dataSaida;
	private int idadeAproximada;
	private String nomeRacao;
	private double quantidadeRacao;
	private String raca;
	private double peso;
	private String cpfAdotante;
	
	
	
	public int getCodigoUnico() {
		return codigoUnico;
	}
	public void setCodigoUnico() {
		this.codigoUnico = proximoCodigo;
		proximoCodigo++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	public int getIdadeAproximada() {
		return idadeAproximada;
	}
	public void setIdadeAproximada(int idadeAproximada) {
		this.idadeAproximada = idadeAproximada;
	}
	public String getNomeRacao() {
		return nomeRacao;
	}
	public void setNomeRacao(String nomeRacao) {
		this.nomeRacao = nomeRacao;
	}
	public double getQuantidadeRacao() {
		return quantidadeRacao;
	}
	public void setQuantidadeRacao(double quantidadeRacao) {
		this.quantidadeRacao = quantidadeRacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCpfAdotante() {
		return cpfAdotante;
	}
	public void setCpfAdotante(String cpfAdotante) {
		this.cpfAdotante = cpfAdotante;
	}
	
	public void cadastrarGato() 
	{
		setNome(JOptionPane.showInputDialog("Nome do gato"));
		setApelido(JOptionPane.showInputDialog("Apelido do gato"));
		setSexo(JOptionPane.showInputDialog("Sexo do gato"));
		setCodigoUnico();
		setRaca(JOptionPane.showInputDialog("raca do gato: "));
		setIdadeAproximada(Integer.parseInt(JOptionPane.showInputDialog("idade aproximada do gato")));;
		setDataEntrada(JOptionPane.showInputDialog("Data entrada"));
		setNomeRacao(JOptionPane.showInputDialog("Nome da racao"));
		setQuantidadeRacao(Double.parseDouble(JOptionPane.showInputDialog("Quantidade de racao")));
		setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso do gato")));
		setCpfAdotante("nenhum");
		setDataSaida("não adotado");
	}

	public void consultaGato(ArrayList<Gato> gatos)
	{
		for(Gato gato2 : gatos) 
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

	public void adotarGato(ArrayList<Gato> gatos)
	{
		String cpfEscolhido = JOptionPane.showInputDialog("cpf do adotante");
				int codUnicoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("codigo unico do gato que sera adotado"));
				for(Gato gato2: gatos) 
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

	public void relatorioProvisoes(ArrayList<Gato> listaGatos)
	{
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
}

	

