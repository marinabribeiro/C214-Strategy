import Algoritmos.BubbleSort;
import Algoritmos.ShellSort;
import Algoritmos.QuickSort;
import Principal.Ordenadores;
import Principal.OrdenarBublleSort;
import Principal.OrdenarShellSort;
import Principal.OrdenarQuickSort;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TesteOrdenadores {
    Ordenadores ordenar;

    @Test
    public void testeOrdenarBubbleSort(){
        ordenar=new OrdenarBublleSort();
        assertTrue(ordenar.getAlgoritmos() instanceof BubbleSort);
    }
    @Test
    public void testeOrdenarComBubbleSort(){
        ordenar=new OrdenarBublleSort();
        ArrayList vetor=new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(70, 21, 3, 17, 63, 12, 90));
        assertEquals(ordenar.ordenarVetores(vetor).get(1),12);
    }

    @Test
    public void testeOrdenarQuickSort(){
        ordenar=new OrdenarQuickSort();
        assertTrue(ordenar.getAlgoritmos() instanceof QuickSort);
    }

    @Test
    public void testeOrdenarComQuickSort(){
        ordenar=new OrdenarQuickSort();
        ArrayList vetor=new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(3,1,10,5,2,9));

        assertEquals(ordenar.ordenarVetores(vetor).get(1),2);
    }
    @Test
    public void testeOrdenarShellSort(){
        ordenar=new OrdenarShellSort();
        assertTrue(ordenar.getAlgoritmos() instanceof ShellSort);
    }

    @Test
    public void testeOrdenarComShellSort(){
        ordenar=new OrdenarQuickSort();
        ArrayList vetor=new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(7,1,2,9,6,3));
        assertEquals(ordenar.ordenarVetores(vetor).get(4),6);
    }
}
