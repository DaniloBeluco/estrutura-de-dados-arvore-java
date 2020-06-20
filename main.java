
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arvore a = new Arvore();
		a.insere(-1, 1);
		a.insere(1, 3);
		a.insere(1, 4);
		a.insere(3, 5);
	for (No no : a.filhos(3)) {
		System.out.println(no.valor);
	}
	}

}
