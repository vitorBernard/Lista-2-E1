



public class Pessoa
{
	private String nome;
	private String dataNascimento;
	
	// encapsulamento
        
	public String getNome()
	{
		return this.nome;
	}
	public String getDataNascimento()
	{
		return this.dataNascimento;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setDataNascimento(String DataNascimento)
	{
		this.dataNascimento = DataNascimento;
	}

	//metodo

        @Override
	public String toString()
	{
		return ( "nome: " +getNome()+ "\nData de Nascimento: " +getDataNascimento() + "\n");
	}
	
	// Construtor
	public Pessoa(String nome, String dataNascimento)
	{
		setNome(nome);
		setDataNascimento(dataNascimento);
	}
        public Pessoa()
        {
        }
}
