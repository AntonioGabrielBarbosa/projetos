
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
		this.setNome(JOptionPane.showInputDialog("Nome do gato"));
		this.setApelido(JOptionPane.showInputDialog("Apelido do gato"));
		this.setSexo(JOptionPane.showInputDialog("Sexo do gato"));
		this.setCodigoUnico();
		this.setRaca(JOptionPane.showInputDialog("raca do gato: "));
		this.setIdadeAproximada(Integer.parseInt(JOptionPane.showInputDialog("idade aproximada do gato")));;
		this.setDataEntrada(JOptionPane.showInputDialog("Data entrada"));
		this.setNomeRacao(JOptionPane.showInputDialog("Nome da racao"));
		this.setQuantidadeRacao(Double.parseDouble(JOptionPane.showInputDialog("Quantidade de racao")));
		this.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso do gato")));
		this.setCpfAdotante("nenhum");
		this.setDataSaida("não adotado");
	}
	
}
