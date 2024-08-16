
package ex1p2_carlosdominguez_;

import java.util.ArrayList;

public class Home {
    
    private String Nombre;
    
    private ArrayList <Creacion> ArchivoYDirectorios = new ArrayList();


    public Home(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList <Creacion> getArchivoYDirectorios() {
        return ArchivoYDirectorios;
    }

    public void setArchivoYDirectorios(ArrayList <Creacion> ArchivoYDirectorios) {
        this.ArchivoYDirectorios = ArchivoYDirectorios;
    }

    

    

   
    
    
}
