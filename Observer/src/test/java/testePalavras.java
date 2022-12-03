import Implementacao.Observador;
import Implementacao.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testePalavras {
    @Test
    public void testPar(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarParidadeDePalavras("Universitaria em prantos por levar horas para fazer trabalho do Chris"),4);
    }

    @Test
    public void testQtdPalavras(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarPalavras("E talvez o trabalho nem seja validado"),7);
    }

    @Test
    public void testMaiusculo(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarPalavrasIniciadasComMaisculo("Mas universitaria FELIZ por ter feito algo UTIL")
                ,3);
    }

    @Test
    public void testeAdicionarObservadores(){

        Observavel programa=new Observavel();

        Observador pc1=new Observador(1,"Teste 1");
        Observador pc2=new Observador(2,"Teste 2");
        Observador pc3=new Observador(3,"Teste 3");

        programa.registraPCs(pc1);
        programa.registraPCs(pc2);
        programa.registraPCs(pc3);

        assertEquals(programa.getPcs().size(),3);
    }
}
