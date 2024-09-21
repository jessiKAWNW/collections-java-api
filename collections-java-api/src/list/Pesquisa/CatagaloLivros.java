package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatagaloLivros {

    private List<Livro> livroList;

    public CatagaloLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatagaloLivros catagaloLivros = new CatagaloLivros();

        catagaloLivros.adicionarLivro("Titulo 1","Autor 1",2002);
        catagaloLivros.adicionarLivro("Titulo 1","Autor 2",2003);
        catagaloLivros.adicionarLivro("Titulo 3","Autor 2",2004);
        catagaloLivros.adicionarLivro("Titulo 4","Autor 4",2005);
        catagaloLivros.adicionarLivro("Titulo 5","Autor 5",2006);
        catagaloLivros.adicionarLivro("Titulo 6","Autor 6",2007);

        System.out.println(catagaloLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catagaloLivros.pesquisarPorIntervaloAnos(2002,2004));
        System.out.println(catagaloLivros.pesquisarPorTitulo("Titulo 1"));
    }
}
