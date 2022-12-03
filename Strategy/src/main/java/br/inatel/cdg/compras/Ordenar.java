package br.inatel.cdg.compras;

public abstract class Ordenar {
	
	//Composicao com instancia de Frete
	protected Dados dados;

	//Comportamento delegado
	public int[] ordenaDados(int[] vetor) {
		return dados.ordenaDados(vetor);
	}


	//Getter e Setter
	public void setDados(Dados dados) {
		this.dados = dados;
	}

	public Dados getDados() {
		return dados;
	}
}