package domain;

/**
 *
 * @author reych
 */
public class Doctor extends Persona implements Accion {

    private double salario;
    private String especialidad;

    public Doctor(double salario, String especialidad, int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
        this.salario = salario;
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void solicitarDatos() {
    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" + "salario=" + salario + ", especialidad=" + especialidad + '}';
    }
    
    
}