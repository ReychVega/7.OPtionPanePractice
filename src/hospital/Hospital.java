package hospital;

import domain.Menu;


/**
 *
 * @author reych
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        menu.definirUsuario();
        menu.solicitarDatosPorUsuario();
        menu.mostrar();        
        
    }
    
}

/*

 donde el usuario 
seleccione por medio de un menú de 
opciones que datos de desea ingresar 
(Administrativo, Doctor o Paciente) y
también un menú de opciones de los datos 
que desea mostrar (Administrativo, Doctor,
Paciente)
4. Guarde el programa en el área de archivos
de su correspondiente grupo*/