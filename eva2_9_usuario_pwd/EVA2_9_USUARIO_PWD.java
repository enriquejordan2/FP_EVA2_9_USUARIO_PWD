/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String USUARIO = "Jordan"; 
        final String CONTRASENA = "pepito123"; 
        String Usuario, contrasena;
        
        Scanner captu = new Scanner(System.in);
        
        do{
        System.out.println("Escribe tu usuario: ");
        Usuario = captu.nextLine();
        System.out.println("Introduce tu contraseña: ");
        contrasena = captu.nextLine();
        
        }while (!(Usuario.equals(USUARIO)&& contrasena.equals(CONTRASENA)));
        System.out.println("Bienvenido");
    }
    
}
