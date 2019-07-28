

public class Homem extends PessoaIMC
{

    Homem(String nome, String data, double peso, double altura ) 
    {
       super.setNome(nome);
       super.setDataNascimento(data);
       super.setPeso(peso);
       super.setAltura(altura);
       super.setImc(super.calculaIMC(altura,peso));
    }
    
    @Override
    public String resultIMC()
	{
		if(super.getImc() < 20.7)
		{
			return String.format("IMC: %2.2f. Abaixo do peso ideal.",super.getImc());
		}
		else if ( super.getImc() >= 20.7 && super.getImc() <= 26.4 )
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