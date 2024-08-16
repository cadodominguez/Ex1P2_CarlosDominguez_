
package ex1p2_carlosdominguez_;
import java.util.Random;
public class Directorio extends Creacion {
    private String codigo = cod();
    static Random rd = new Random();
    
    public Directorio(String nombre) {
        super(nombre);
    }
    
    @Override
    public String visualisacion() {
        return codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String cod(){
        String cods = "";
        for (int i = 0; i <= 20; i++) {
            int random = rd.nextInt(65, 90);
            cods += (char) random;
        }
        return cods;
    }
    
}
