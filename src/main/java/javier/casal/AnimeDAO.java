package javier.casal;

import java.sql.*;

public class AnimeDAO {

    private Conexion conexion = new Conexion();

    // CREATE
    public void insertar(String nome, String descripcion, String data, int puntuacion) {

        String sql = "INSERT INTO anime (nome, descripcion, data, puntuacion) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = conexion.conexion();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, descripcion);
            ps.setDate(3, Date.valueOf(data));
            ps.setInt(4, puntuacion);

            ps.executeUpdate();

            System.out.println("Anime inserido correctamente.");

            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }


    // READ - Leer todos los animes
    public void lerTodos() {

        String sql = "SELECT * FROM anime";

        try {
            Connection conn = conexion.conexion();

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        "Nombre: " + rs.getString("nome") +
                                " | Descripcion: " + rs.getString("descripcion") +
                                " | Data: " + rs.getDate("data") +
                                " | Puntuacion: " + rs.getInt("puntuacion")
                );
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }

    // UPDATE - Actualizar un anime
    public void actualizar(String nome, String descripcion, String data, int puntuacion) {

        String sql = "UPDATE anime SET descripcion = ?, data = ?, puntuacion = ? WHERE nome = ?";

        try {
            Connection conn = conexion.conexion();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, descripcion);
            ps.setDate(2, java.sql.Date.valueOf(data));
            ps.setInt(3, puntuacion);
            ps.setString(4, nome);

            ps.executeUpdate();

            System.out.println("Anime actualizado correctamente.");

            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }


    // DELETE - Eliminar un anime
    public void eliminar(String nome) {

        String sql = "DELETE FROM anime WHERE nome = ?";

        try {
            Connection conn = conexion.conexion();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nome);

            ps.executeUpdate();

            System.out.println("Anime eliminado correctamente.");

            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
}