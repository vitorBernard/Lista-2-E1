
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MinhaClasseOrdenavel 
{
    // CONSTANTES 
    final int NOME = 1;
    final int NOME_REVERSO = 2;
    final int PESO = 3;
    final int ALTURA = 4;
    final int IMC = 5;
    
    ArrayList <PessoaIMC> lista = new ArrayList<PessoaIMC>();
    
     public void add (PessoaIMC p)
    {
        lista.add(p);
    }
    public PessoaIMC get (int index)
    {
        return lista.get(index);
    }
    
    public Comparator pesoC = new Comparator()
    {
        @Override
        public int compare (Object o1,Object o2)
        {
            double p1, p2;
            p2 = ((PessoaIMC)o2).getPeso();
            p1 = ((PessoaIMC)o1).getPeso();
            return (int) Math.round(p2-p1);
        }
    };  
    public Comparator alturaC = new Comparator()
    {
        @Override
        public int compare (Object o1, Object o2)
        {
            double p1, p2;
            p2 = ((PessoaIMC)o2).getAltura();
            p1 = ((PessoaIMC)o1).getAltura();
            return (int) Math.round(p1-p2);
        }
    };
    
     public Comparator nomeC = new Comparator()
    {
        @Override
        public int compare (Object o1,Object o2)
        {
            String p1, p2;
            p2 = ((PessoaIMC)o2).getNome();
            p1 = ((PessoaIMC)o1).getNome();
            return  p1.compareTo(p2);
        }
    };
      public Comparator imcC = new Comparator()
    {
        @Override
        public int compare (Object o1,Object o2)
        {
            double p1, p2;
            p2 = ((PessoaIMC)o2).getImc();
            p1 = ((PessoaIMC)o1).getImc();
            return (int) Math.round((p2-p1));
        }
    };
     
     
  
    public ArrayList ordena (int criterio )
    {
        switch(criterio)
        {
            case NOME:
                Collections.sort(lista,nomeC);  
                break;
            case NOME_REVERSO:
                Collections.sort(lista,nomeC.reversed());
                break;
            case PESO:
                Collections.sort(lista,pesoC.reversed());
                break;
            case ALTURA:
                Collections.sort(lista,alturaC.reversed());
                break;
            case IMC:  
                Collections.sort(lista,imcC);
                break;
               
            default:
                System.out.println("Opcao invalida");
                break;
        }
    return this.lista;  
    }
}
