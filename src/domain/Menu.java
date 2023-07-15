package domain;

import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class Menu {

    private int tipoDeUsuario;
    private Persona usuario;

    public Menu() {
        this.tipoDeUsuario = -1;
        this.usuario = null;

    }

    //solicita seleccionar el usuario
    public void definirUsuario() {
        String[] opciones = new String[]{"Paciente", "Doctor", "Administrativo"};
        Object panel = null;
        this.tipoDeUsuario = JOptionPane.showOptionDialog(null, panel, "Seleccione el tipo de usuario.",
                0, -1, null, opciones, null);
        //System.out.println(tipoDeUsuario);
    }

    //evaluamos que datos solicita
    public void solicitarDatosPorUsuario() {

        //datos generales
        String nombre, apellido, stringEdad;
        int edad;

        //verificamos que exista una seleccion para continuar y pedimos los datos generales
        if (this.tipoDeUsuario != -1) {
            nombre = JOptionPane.showInputDialog(null, "ingrese el nombre");
            apellido = JOptionPane.showInputDialog(null, "ingrese el apellido");
            stringEdad = JOptionPane.showInputDialog(null, "ingrese la edad");

            //revisamos que existan datos
            if (!this.verificaDatos(nombre) && !this.verificaDatos(apellido)
                    && !this.verificaDatos(stringEdad)) {

                //de esta forma para evitar error de Integer.parse si es nulo el dato
                edad = Integer.parseInt(stringEdad);
                
                //creamos la instancia de acuerdo a las opciones
                this.creamosInstancia(nombre, apellido, edad);

            }
        }
    }

    public void mostrar() {
        if (this.usuario != null) {
            JOptionPane.showMessageDialog(null, this.usuario.toString());
        }
    }

    private boolean verificaDatos(Object object) {
        //System.out.println(object);
        if (object == null) {
            return true;
        }
        return false;
    }

    
    //recibe datos generales y crea una instancia
    private void creamosInstancia(String nombre, String apellido, int edad) {
        switch (tipoDeUsuario) {

            case 0:
                String tipoDeSangre = JOptionPane.showInputDialog(null, "ingrese el tipo de sangre");
                String genero = JOptionPane.showInputDialog(null, "ingrese el genero");

                if (!this.verificaDatos(genero) && !this.verificaDatos(tipoDeSangre)) {
                    this.usuario = new Paciente(genero, tipoDeSangre, edad, nombre, apellido);
                }
                break;
            case 1:
                double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el salario"));
                String especialidad = JOptionPane.showInputDialog(null, "ingrese la especialidad");

                if (!this.verificaDatos(salario) && !this.verificaDatos(especialidad)) {
                    this.usuario = new Doctor(salario, especialidad, edad, nombre, apellido);
                }
                break;
            case 2:
                double salario1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el salario"));
                String departamento = JOptionPane.showInputDialog(null, "ingrese el departamento");
                this.usuario = new Administrativo(salario1, departamento, edad, nombre, apellido);
                break;
        }
    }
}
