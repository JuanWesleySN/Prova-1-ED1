package br.edu.ifs.ED.lista;

public class ListaSimplesEncadeada<T extends Comparable<T>> extends Lista<T> {

	private No<T> primeiro;
    	private int tamanho;

    public ListaSimplesEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

	
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
		f (tamanho == 0) {
            return (T[]) new Comparable[0]; // Retorna um vetor vazio
        }

        T[] vetor = (T[]) new Comparable[tamanho];
        No<T> currentNode = primeiro;
        int index = 0;

        while (currentNode != null) {
            vetor[index] = currentNode.dado;
            currentNode = currentNode.proximo;
            index++;
        }

        return vetor;
	}

}
