


package listaenlazada;


public class Nodo {
    public String codigo;
    public String nombre;
    public Nodo link;
    
    public Nodo(String c, String n){
        codigo = c;
        nombre = n;
        link = null;
    }
}
