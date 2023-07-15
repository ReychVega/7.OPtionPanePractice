package domain;

/**
 *
 * @author reych
 */
public class Paciente extends Persona implements Accion{
    
    String genero;
    String tipoDeSangre;

    public Paciente(String genero, String tipoDeSangre, int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
        this.genero = genero;
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    @Override
    public void solicitarDatos() {

    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" + "genero=" + genero + ", tipoDeSangre=" + tipoDeSangre + '}';
    }
    
    
}
