

public abstract class PessoaIMC extends Pessoa
{
	private double altura;
	private double peso;
        private double imc;
	
	//encapsulamento
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	public double getPeso()
	{
		return this.peso;
	}
	public double getAltura()
	{
		return this.altura;
        }
        public double getImc()
        {
            return this.imc;
        }
        public void setImc(double imc)
        {
            this.imc = imc;
        }
	
	// metodo
	public double calculaIMC (double altura, double peso)
	{
		return peso/(altura*altura);
	}
        @Override
	public String toString()
	{
		return ("\nNome: " + super.getNome() + "\nData de Nascimento: " +super.getDataNascimento()+ "\nPeso: " +
		getPeso() + "\nAltura: " + getAltura() +"\n");
	}
	public abstract String resultIMC();
		
	// construtor
	public PessoaIMC (String nome, String dataNascimento, double peso, double altura)
	{
		setNome(nome);
		setDataNascimento(dataNascimento);
		setAltura(altura);
		setPeso(peso);
	}
        public PessoaIMC()
        {
            
        }
}