import Implementacao.Observador;
import Implementacao.Observavel;

public class Palavras {
    public static void main(String[] args){

        Observavel programa=new Observavel();

        Observador pc1 =new Observador(1,"Teste 01");
        Observador pc2 =new Observador(2,"Teste 02");
        Observador pc3 =new Observador(3,"Teste 03");

        programa.registraPCs(pc1);
        programa.registraPCs(pc2);
        programa.registraPCs(pc3);



        System.out.println("Qtd de palavras: "
                +programa.contarPalavras("Chris nao eh o Phil"));
        System.out.println("Qtd de palavras com caracteres par: "
                +programa.contarParidadeDePalavras("O Chris NAO eh o Phil"));
        System.out.println("Qtd de palavras caracteres Maiusculos: "
                +programa.contarPalavrasIniciadasComMaisculo("O dia está lindo hoje"));


        System.out.println("++ Notificando os PC's ++ ");
        programa.notificaObservadores();
    }

}
