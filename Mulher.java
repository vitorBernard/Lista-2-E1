

public class Mulher extends PessoaIMC 
{
   
    
    Mulher(String nome, String data, double peso, double altura ) 
    {
       super.setNome(nome);
       super.setDataNascimento(data);
       super.setPeso(peso);
       super.setAltura(altura);
       double x = super.calculaIMC(altura, peso);
       super.setImc(x);
    }

    @Override
    public String resultIMC()
	{
		if(super.getImc() < 19)
		{
			return String.format("IMC: %2.2f. Abaixo do peso ideal.",super.getImc());
		}
		else if (super.getImc() >= 19 && super.getImc() <= 25.8 )
		{
			return String.format("IMC: %2.2f. Peso ideal.",super.getImc());
		}
		else
		{
		return String.format("IMC: %2.2f. Acima do peso ideal.",super.getImc());
		}
        } 
    public String toString()
	{
		return ("\nNome: " + super.getNome() + "\nData de Nascimento: " +super.getDataNascimento()+ "\nPeso: " +
		getPeso() + "\nAltura: " + getAltura() +"\n" + resultIMC() +"\n");
	}
    
}
