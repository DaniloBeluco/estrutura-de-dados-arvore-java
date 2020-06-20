import java.util.ArrayList;

public class Arvore {

	ArrayList<No> lista = new ArrayList<No>();
	private No raiz;

	public Arvore() {
		raiz = null;
	}

	public void insere(int pai, int filho) {

		No novo = new No(filho);

		if (tamanho() == 0) {
			raiz = novo;
			lista.add(novo);

			novo.pai = null;
		} else {
			lista.add(novo);

			for (No no : lista) {

				if (no.valor == pai) {
					novo.pai = no;

				}
			}

			novo.pai.filhos.add(novo);

		}

	}

	public No raiz() {
		return raiz;
	}

	public No pai(No n) {

		return n.pai;
	}

	// retorna os filhos de um no
	public ArrayList<No> filhos(int valor) {
		No n = null;
		for (No no : lista) {
			if (valor == no.valor) {
				n = no;
			}
		}

		if (n.filhos.isEmpty()) {

			return null;

		} else {

			return n.filhos;

		}
	}

	// Testa se um nó é interno
	public boolean verificaInterno(No n) {

		if (n.filhos.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	// Testa se um nó é externo
	public boolean verificaExterno(No n) {
		return n.filhos.isEmpty();

	}

	// Testa se um nó é a raiz
	public boolean verificaRaiz(No n) {
		return n == raiz;
	}

	// Retorna uma lista com todos os nós da Árvore
	public ArrayList<No> elementos() {

		return lista;
	}

	// Retorna o número de nós da Árvore
	public int tamanho() {

		return lista.size();

	}

	// Retorna o elemento armazenado em elementoAntigo e o substitui por
	// elementoNovo
	public int atualizaElemento(No elementoAntigo, No elementoNovo) {

		for (No no : lista) {
			if (no == elementoAntigo) {
				no = elementoNovo;
			}
		}
		return 0;

	}

}
