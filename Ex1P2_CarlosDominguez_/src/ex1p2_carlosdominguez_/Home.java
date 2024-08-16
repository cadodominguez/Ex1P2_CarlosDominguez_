
package ex1p2_carlosdominguez_;

import java.util.ArrayList;

public class Home {
    
    private String Nombre;
    
    private ArrayList <String> archivos = new ArrayList();
    private ArrayList <String> directorios = new ArrayList();

    public Home(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList <String> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList <String> archivos) {
        this.archivos = archivos;
    }

    public ArrayList <String> getDirectorios() {
        return directorios;
    }

    public void setDirectorios(ArrayList <String> directorios) {
        this.directorios = directorios;
    }
    
    
}
