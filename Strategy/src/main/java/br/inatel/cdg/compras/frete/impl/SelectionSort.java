package br.inatel.cdg.compras.frete.impl;

import br.inatel.cdg.compras.Dados;

public class SelectionSort implements Dados {


	@Override
	public int[] ordenaDados(int[] vetor) {
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor.length; i++) {
				if (vetor[i] < vetor[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = vetor[fixo];
				vetor[fixo] = vetor[menor];
				vetor[menor] = t;
			}
		}
		return vetor;
	}
}