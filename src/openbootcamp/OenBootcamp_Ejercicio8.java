package openbootcamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MARIA DEL CARMEN BUENESTADO FERNÁNDEZ
 */
public class OenBootcamp_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creando el objeto y llamada al constructor
        Persona persona1 = new Persona();
        
        //asignando valores al objeto persona1 utilizando setter
        persona1.setEdad(10);
        persona1.setNombre("Pepito");
        persona1.setTelefono("957555525");
        
        //mostramos valores asignados
        
        
        System.out.println(persona1.toString());
       
        
    }

}
