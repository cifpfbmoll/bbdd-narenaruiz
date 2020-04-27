/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static practica.pkg8.GuardarInformacion.guardarInformacion;
import static practica.pkg8.Menu.crearConexion;
import static practica.pkg8.Menu.lector;

/**
 *
 * @author Usuario
 */
public class Consultas {

    public static void menuDeConsultas() throws IOException {
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Consulta de bares");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(lector.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        consultaBares();
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
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void consultaBares() throws SQLException, IOException {
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Todos los bares");
            System.out.println("2. Down Under Pub");
            System.out.println("3. James Joyce Pub");
            System.out.println("4. Satisfaction");
            System.out.println("5. Talk of the Town");
            System.out.println("6. The Edge");
            System.out.println("");
            System.out.println("7. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(lector.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        todosLosBares();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        bares("Down Under Pub");
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
                        System.out.println("Solo números entre 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void todosLosBares() throws SQLException, IOException {
        try (Connection con = crearConexion()) {
            Statement stat = con.createStatement();
            ResultSet rset = stat.executeQuery("SELECT * FROM bar");
            guardarInformacion("todos los bares", rset, "tipoString", "bares");
        }
    }

    public static void bares(String nombreBar) throws SQLException {
        try (Connection con = crearConexion()) {
            Statement stat = con.createStatement();
            ResultSet rset = stat.executeQuery("SELECT * FROM bar WHERE name = " + nombreBar);
        }
    }
}
