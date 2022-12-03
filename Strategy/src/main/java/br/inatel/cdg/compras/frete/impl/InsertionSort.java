package br.inatel.cdg.compras.frete.impl;

import br.inatel.cdg.compras.Dados;

public class InsertionSort implements Dados {


	@Override
	public int[] ordenaDados(int[] vetor) {
		int j;
		int key;
		int i;

		for (j = 1; j < vetor.length; j++)
		{
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
			{
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
		}
		return vetor;
	}
}