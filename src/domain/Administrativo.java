package domain;

/**
 *
 * @author reych
 */
public class Administrativo extends Persona implements Accion {

    private double salario;
    private String departamento;

    public Administrativo(double salario, String departamento, int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void solicitarDatos() {

    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public String toString() {
        return super.toString() + "Administrativo{" + "salario=" + salario + ", departamento=" + departamento + '}';
    }

    
}
