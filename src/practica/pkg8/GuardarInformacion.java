/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class GuardarInformacion {

    public static void guardarInformacion(String consulta, ResultSet rset, String tipo, String campo) throws IOException, SQLException {
        //Esta incompleto
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("consultas.txt", true))) {
            escritor.newLine();
            escritor.write("Consulta: " + consulta);
            escritor.newLine();
            while (rset.next()) {
                if (tipo.equals("tipoString")) {
                    String miString = rset.getString(campo);//no lo se si tengo que quitarlo
                    escritor.write(miString);
                    escritor.newLine();
                    System.out.println(miString);
                } else if (tipo.equals("tipoInt")) {
                    String miString2 = rset.getString(campo);
                    escritor.write(miString2);
                    escritor.newLine();
                    System.out.println(miString2);
                }
            }
        }
    }
}
