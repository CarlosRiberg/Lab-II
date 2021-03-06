package br.com.senacrs.alp.aulas;

public interface Fila<T extends Object> {

	void insercao(T valor);

	T obter();

	T remocao();
	
	boolean vazia();

	int tamanho();
	
	void esvaziar();
}
