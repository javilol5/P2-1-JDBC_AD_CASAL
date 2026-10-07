package javier.casal;

import java.sql.*;

public class Conexion {

    public Connection conexion() {
        String url = "jdbc:postgresql://10.0.9.226:5432/probas";
        String usuario = "postgres";
        String contrasinal = "admin";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, contrasinal);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    } //CASAL



    public static void main(String[] args) {

        Conexion c = new Conexion();

        if (c.conexion() != null) {
            System.out.println("Conexion correcta");
        } else {
            System.out.println("No se pudo conectar");
        }
        System.out.println();
        System.out.println("CASAL");
    }
}
