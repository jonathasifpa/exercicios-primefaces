package beans.livro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LivroBean implements Serializable{
	private Livro livro = new Livro();;
	private List<Livro> listLivros = new ArrayList<Livro>();

	public String adicionarLivro() {
		listLivros.add(livro);
		livro = new Livro();
		return "questao2";
	}

	public void remover(Livro item) {
		this.listLivros.remove(item);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getListLivros() {
		return listLivros;
	}

	public void setListLivros(List<Livro> listLivros) {
		this.listLivros = listLivros;
	}
}
