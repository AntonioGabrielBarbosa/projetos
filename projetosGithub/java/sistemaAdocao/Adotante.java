import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Adotante 
{
	
	private String cpf;
	private String nomeCompleto;
	private String endereco;
	private String telefone;
	
	public String getCpf() 
	{
		return cpf;
	}
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	public String getNomeCompleto() 
	{
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) 
	{
		this.nomeCompleto = nomeCompleto;
	}
	public String getEndereco() 
	{
		return endereco;
	}
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
	public void cadastrar() 
	{
		this.setNomeCompleto(JOptionPane.showInputDialog("Nome do adotante"));
		this.setCpf(JOptionPane.showInputDialog("cpf do adotante"));
		this.setTelefone(JOptionPane.showInputDialog("Telefone do adotante"));
		this.setEndereco(JOptionPane.showInputDialog("Endereco"));
	}

	public void consultaAdotante(ArrayList<Adotante> adotantes)
	{
		for(Adotante adotante2 : adotantes) 
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
	
}
