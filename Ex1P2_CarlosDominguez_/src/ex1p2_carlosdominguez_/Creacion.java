
package ex1p2_carlosdominguez_;

public abstract class Creacion {
    private String nombre;

    public Creacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract String visualisacion();

    @Override
    public String toString() {
        return nombre;
    }
    
}
