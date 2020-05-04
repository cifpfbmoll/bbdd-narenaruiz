/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static practica.pkg8.Consultas.menuDeConsultas;

/**
 *
 * @author Usuario
 */
public class Menu {

    static Scanner lector = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Consulta");
            System.out.println("2. Actualización");
            System.out.println("3. Inserción");
            System.out.println("4. ");
            System.out.println("");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(lector.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        menuDeConsultas();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");

                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");

                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");

                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static Connection crearConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/javabd";
        return DriverManager.getConnection(url, "root", "");//El usuario y contraseña que tengo puestos no funcionan
    }


}
