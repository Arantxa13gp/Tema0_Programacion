package Avanzados;

import java.util.Objects;

public class Furball {
    private String nombre;
    private String dueño;
    private String tipo;
    private String historial;

    private static int nPerros = 0;
    private static int nGatos = 0;

    public void FichaMascota(){
        nombre = dueño = tipo = historial = "";
    }

    public Furball(String nombre, String dueño, String tipo, String historial) {
        setNombre(nombre);
        setDueño(dueño);
        setTipo(tipo);
        setHistorial(historial);
    }

    public Furball(Furball otro){
        this.nombre = otro.nombre;
        this.dueño = otro.dueño;
        this.tipo = otro.tipo;
        this.historial = otro.historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño.replaceAll(" ", "");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        switch (tipo){
            case "perro":
            case "gato":
            case "exótico":
                break;
        }
        this.tipo = tipo;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        if (historial.length() > 500)
            System.err.println("Error, el historial no puede exceder de los 500 caracteres");
       else this.historial = historial;
    }

    public static int getnPerros() {
        return nPerros;
    }

    public static void setnPerros(int nPerros) {
        Furball.nPerros = nPerros;
    }

    public static int getnGatos() {
        return nGatos;
    }

    public static void setnGatos(int nGatos) {
        Furball.nGatos = nGatos;
    }

    @Override
    public String toString() {
        return nombre + " es un animal de tipo: " +tipo+
                " el dueño es:" + dueño + " y su historial médico es: " + historial;
    }

    public Furball clone(){
        return new Furball(this);
    }

    public boolean equals(Furball otro){
        if (!this.nombre.equals(otro.nombre)){
            return false;
        }

        if (!this.dueño.equals(otro.dueño)){
            return false;
        }

        if (!this.tipo.equals(otro.nombre)){
            return false;
        }
        if (!this.historial.equals(otro.nombre)){
            return false;
        }

        return true;
    }
}
