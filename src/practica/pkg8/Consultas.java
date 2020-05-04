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

            System.out.println("1. Consulta de bares sin utilizar prepared statement"
                    + " y ademas esta la opcion para el sqlInjection.");
            System.out.println("2. Consulta de cervezas sobre la clave primaria "
                    + "enseñando una sola fila utilizando prepared statement.");
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

    //Consulta de bares opcion 1 del menu de consultas
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
            System.out.println("7. Opcion para que escriba lo que quiere el usuario");
            System.out.println("");
            System.out.println("8. Salir");

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
                        System.out.println("No te olvides de poner ;");
                        bares("Down Under Pub");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("No te olvides de poner ;");
                        bares("James Joyce Pub");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("No te olvides de poner ;");
                        bares("Satisfaction");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        System.out.println("No te olvides de poner ;");
                        bares("Talk of the Town");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        System.out.println("No te olvides de poner ;");
                        bares("The Edge");
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 7");
                        System.out.println("No te olvides de poner ;");
                        System.out.println("Escribe la query que quieras(es una opcion para probar el sqlInjection):");
                        System.out.println("(Un ejemplo para el sqlInjection podria ser--> The Edge; delete The Edge from bar;)");
                        /*Quiero usar el sqlInjection de arriba pero no puedo 
                        porque no se si tengo bien el connect. De todas formas creo que funciona*/
                        bares(lector.nextLine());
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Consulta 2 del menu de consultas, consulta de cervezas
    public static void consultaCervezas() throws SQLException, IOException {
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Todos las cervezas"); //esto es para verlas todas por si necesito comprobar cualquier cosa
            System.out.println("2. Amstel");
            System.out.println("3. Budweiser");
            System.out.println("4. Corona");
            System.out.println("5. Dixie");
            System.out.println("6. Erdinger");
            System.out.println("7. Full Sail");
            System.out.println("");
            System.out.println("8. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = Integer.parseInt(lector.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        todosLasCervezas();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("No te olvides de poner ;");
                        cervezas("");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("No te olvides de poner ;");
                        cervezas("");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("No te olvides de poner ;");
                        cervezas("");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("No te olvides de poner ;");
                        cervezas("");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("No te olvides de poner ;");
                        cervezas("");
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("No te olvides de poner ;");
                        cervezas("");
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
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
            ResultSet rset = stat.executeQuery("SELECT * FROM bar;");
            guardarInformacion("todos los bares", rset, "tipoString", "bar"); //No esta acabado
        }
    }

    public static void bares(String nombreBar) throws SQLException {
        try (Connection con = crearConexion()) {
            Statement stat = con.createStatement();
            ResultSet rset = stat.executeQuery("SELECT * FROM bar WHERE name = " + nombreBar);
        }
    }

    public static void todosLasCervezas() throws SQLException, IOException {
        try (Connection con = crearConexion()) {
            Statement stat = con.createStatement();
            ResultSet rset = stat.executeQuery("SELECT * FROM beer;");
            guardarInformacion("todos las cerveza", rset, "tipoString", "cervezas"); //No esta acabado
        }
    }
    
    public static void cervezas(String nombreCerveza) throws SQLException {//ponerlo como un prepared statement
        try (Connection con = crearConexion()) {
            Statement stat = con.createStatement();
            ResultSet rset = stat.executeQuery("SELECT brewer FROM beer WHERE name = " + nombreCerveza);
        }
    }
}
