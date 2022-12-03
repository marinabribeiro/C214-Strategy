package br.inatel.cdg.teste.compras;

import br.inatel.cdg.compras.OrdenarBubbleSort;
import br.inatel.cdg.compras.OrdenarInsertionSort;
import br.inatel.cdg.compras.OrdenarSelectionSort;
import br.inatel.cdg.compras.frete.impl.BubbleSort;
import br.inatel.cdg.compras.frete.impl.InsertionSort;
import org.junit.Test;
import br.inatel.cdg.compras.Ordenar;
import br.inatel.cdg.compras.frete.impl.SelectionSort;

import static org.junit.Assert.*;

public class TestOrdenar {
	
	Ordenar ordenar;
	
	@Test
	public void testeSelectionSort() {
		ordenar = new OrdenarSelectionSort();
		assertTrue(ordenar.getDados() instanceof SelectionSort);
	}

	@Test
	public void testeOrdenarSelectionSort() {
		ordenar = new OrdenarSelectionSort();
		int[] vetor = {1,3,2};
		int[] esperado = {1,2,3};
		int[] res = ordenar.ordenaDados(vetor);
		assertArrayEquals(res,esperado);
	}

	@Test
	public void testerInsertionSort() {
		ordenar = new OrdenarInsertionSort();
		assertTrue(ordenar.getDados() instanceof InsertionSort);
	}

	@Test
	public void testeOrdenarInsertionSort() {
		ordenar = new OrdenarInsertionSort();
		int[] vetor = {1,3,2};
		int[] esperado = {1,2,3};
		int[] res = ordenar.ordenaDados(vetor);
		assertArrayEquals(res,esperado);

	}

	@Test
	public void testeBubbleSort() {
		ordenar = new OrdenarBubbleSort();
		assertTrue(ordenar.getDados() instanceof BubbleSort);
	}

	@Test
	public void testeOrdenarBubbleSort() {
		ordenar = new OrdenarBubbleSort();
		int[] vetor = {1,3,2};
		int[] esperado = {1,2,3};
		int[] res = ordenar.ordenaDados(vetor);
		assertArrayEquals(res,esperado);

	}
}
