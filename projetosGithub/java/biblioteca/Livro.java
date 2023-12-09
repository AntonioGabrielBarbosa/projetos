package biblioteca;
import java.util.ArrayList;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private String ISBN;
    private String genero;
    private String disponivel;
    private int quantidade;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDisponivel(){
        return disponivel;
    }
    public void setDisponivel(String disponivel){
        this.disponivel = disponivel;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    

    public Livro(String titulo, String autor, String editora, String ISBN, String genero, int quantidade, ArrayList<Livro> livros){

        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setISBN(ISBN);
        setGenero(genero);
        setDisponivel("Disponivel");
        setQuantidade(quantidade);
        livros.add(this);

    }


    public void atualizar(String titulo, String autor, String editora, String ISBN, String Genero, int quantidade, ArrayList<Livro> livros){


        for(int i = 0; i < livros.size(); i++){

            String livroTitulo = livros.get(i).getTitulo();
            Livro livro = livros.get(i);

            if (livroTitulo.equalsIgnoreCase(titulo)) {
                
                livro.setTitulo(titulo);
                livro.setAutor(autor);
                livro.setEditora(editora);
                livro.setISBN(ISBN);
                livro.setGenero(Genero);
                livro.setQuantidade(quantidade);
                break;

            }

            else{

                System.out.println("Indice que você colocou não existe");

            }

        }

        System.out.println("Livro atualizado");

    }

    public void mostrarCatalogo(ArrayList<Livro> livros){

        for (Livro livro : livros) {

            System.out.println("\nTitulo: \n" + livro.getTitulo() +
            "\n" + "Autor: \n" + livro.getAutor() + "\n" +
            "Editora: \n" + livro.getEditora() + "\n" +
            "ISBN: \n" + livro.getISBN() + "\n" + 
            "Genero: \n" + livro.getGenero() + "\n" +
            "Disponivel: \n" + livro.getDisponivel() + "\n" +
            "quantidade: \n" + livro.getQuantidade());
            
        }

    }

    public void excluir(String titulo, ArrayList<Livro> livros){

        livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));

    }

    public void alugarLivro(String titulo, int quantLivro, ArrayList<Livro> livros){

        for (int i = 0; i < livros.size(); i++) {

            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                
                livros.get(i).setQuantidade(-quantLivro);
                break;

            }

        }


    }

    
    public void devolverLivro(String titulo, int quantLivro, ArrayList<Livro> livros){

        for (int i = 0; i < livros.size(); i++) {

            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                
                livros.get(i).setQuantidade(quantLivro);
                break;

            }

        }


    }
    

}