import java.util.ArrayList;

public class No {
	int valor;
	No raiz;
	No pai;
	ArrayList<No> filhos;

	public No(int valor) {
		raiz = null;
		pai = null;
		filhos = new ArrayList<No>();
		this.valor = valor;
	}

}
