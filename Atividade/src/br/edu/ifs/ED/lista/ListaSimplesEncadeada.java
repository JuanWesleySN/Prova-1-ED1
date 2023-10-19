package br.edu.ifs.ED.lista;

public class ListaSimplesEncadeada<T extends Comparable<T>> extends Lista<T> {

	
    public ListaSimplesEncadeada(){

    }

    @Override
    public void incluir(T elemento) throws Exception {
        throw new Exception("Não implementado");
    }


    public T get(int posicao)  throws Exception {
        throw new Exception("Posição solicitada não existe na lista");
    }


    public int getPosElemento(T elemento)  throws Exception {
        throw new Exception("Elemento não localizado");
    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public int getTamanho() {
        return Integer.MIN_VALUE;
    }

    public void limpar() {
    }



    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public int compareTo(Lista<T> item) {
        return 0;
    }

	@Override
	public T[] TransformarEmVetor() {
		throw new UnsupportedOperationException("Não implementado 'TransformarEmVetor'");
	}

}
