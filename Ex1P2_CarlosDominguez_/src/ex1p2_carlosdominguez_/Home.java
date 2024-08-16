
package ex1p2_carlosdominguez_;

import java.util.ArrayList;

public class Home {
    
    private String Nombre;
    
    private ArrayList <String> ArchivoYDirectorios = new ArrayList();


    public Home(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList <String> getArchivoYDirectorios() {
        return ArchivoYDirectorios;
    }

    public void setArchivoYDirectorios(ArrayList <String> ArchivoYDirectorios) {
        this.ArchivoYDirectorios = ArchivoYDirectorios;
    }

    

   
    
    
}
