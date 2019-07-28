

import java.io.*;
public class Ex1 {
    public static void main(String[] args) throws IOException
    {
// criação e colocacao de instancias na lista
        MinhaClasseOrdenavel ordem = new MinhaClasseOrdenavel();
        Mulher maria = new Mulher("Maria","01/10/1970",48,1.6);
        ordem.add(maria);
        Mulher carla = new Mulher("Carla","05/03/1992",63.2,1.7);
        ordem.add(carla);
        Mulher bia = new Mulher("Bia","23/12/2000",49.6,1.5);
        ordem.add(bia);
        Mulher clara = new Mulher("Clara","18/10/1998",50.3,1.67);
        ordem.add(clara);
        Mulher ana = new Mulher("Ana","05/06/2004",50.6,1.72);
        ordem.add(ana);
        Homem  joao = new Homem("Joao","23/03/1977",77.3,1.8);
        ordem.add(joao);
        Homem  pedro = new Homem("Pedro","01/02/2003",60.3,1.83);
        ordem.add(pedro);
        Homem  vitor = new Homem("Vitor","18/11/1998",53.1,1.69);
        ordem.add(vitor);
        Homem  lucas = new Homem("Lucas","21/05/1990",77.4,1.82);
        ordem.add(lucas);
        Homem  carlos = new Homem("Carlos","24/03/1985",96.3,1.99);
        ordem.add(carlos);
        
// teclado
        BufferedReader inData;
        inData = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        int index;
  
        
        
  
        System.out.println("1-IMPRIMIR LISTA\n2-SAIR\n");
        aux = inData.readLine();
        index = Integer.parseInt(aux);
        switch (index)
        {
            case 1:
               System.out.println("\nEscolha seu modo de ordenacao\n" +
                                    "1.Alfabetica (A-Z)\n" +
                                    "2.Alfabetica (Z-A)\n" +
                                    "3.Menor Peso\n" +
                                    "4.Maior Altura\n" +
                                    "5.Menor IMC");
               aux = inData.readLine();
               index = Integer.parseInt(aux);
               ordem.ordena(index);
               for (int i=0; i<=9;i++)
               {
               System.out.print(ordem.get(i));
               }
               break;
         
            case 2:
                System.out.println("Programa Finalizado");
                break;
                
            default:
                System.out.println("Opcao invalida");
                break;
                
        } 
                    
    }
}
