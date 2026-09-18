package Fundamentos;

import java.util.Locale;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;
    private String genero;

    public Libro(String titulo, String autor, int paginas, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        if (titulo.length() >20)
            System.err.println("Error el titulo no puede tener mas de 20 caracteres");
        else this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        for(int i = 0; i == autor.length(); i++){
            if (Character.isDigit(autor.charAt(i))){
                System.err.println("Error, el autor contiene un caracter numerico");
                return;
            }
        }
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas < 10 || paginas > 2000){
            System.err.println("Error, el numero de paginas debe de estar entre 10 y 2000");
        }
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero.replaceAll(" ", "").toLowerCase(Locale.ROOT);
    }

    public boolean compruebaAutor(String autor){
        if (this.autor.equals(autor))
            return true;
        return false;
    }

    public boolean compruebaTitulo(String titulo){
        return this.titulo.equals(titulo);
    }

    public boolean compruebaPaginas(int paginas){
        return this.paginas != paginas;
    }

    public String mensaePersonalizado(){
        String resultado = "";
        switch (genero){
            case "fantasia":
                resultado = "Prepárate para vivir una aventura fantástica";
                break;
            case "ciencia ficcion":
                resultado = "Disfrutarás de una aventura más allá de tus expectativas";
                break;
            case "misteria":
                resultado = "No serás capaz de soltarlo";
                break;
            case "otro genero":
                resultado = "Difruta de la gran variedad de nuestra biblioteca";
                break;
        }
        return resultado;
    }
}
