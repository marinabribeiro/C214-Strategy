package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.SelectionSort;

public class OrdenarSelectionSort extends Ordenar {

    public OrdenarSelectionSort() {
        dados = new SelectionSort();
    }
}
