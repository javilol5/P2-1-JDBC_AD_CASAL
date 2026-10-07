package javier.casal;

public class Main {

    public static void main(String[] args) {

        AnimeDAO dao = new AnimeDAO();

        // INSERTAR
        System.out.println("===== INSERIR REXISTRO =====");

        dao.insertar(
                "One Piece",
                "Anime de piratas e aventuras.",
                "1999-10-20",
                95
        );
//CASAL

        // LEER TODOS
        System.out.println();
        System.out.println("===== LER TODOS OS REXISTROS =====");

        dao.lerTodos();

//CASAL
        // ACTUALIZAR
        System.out.println();
        System.out.println("===== ACTUALIZAR REXISTRO =====");

        dao.actualizar(
                "One Piece",
                "Anime de piratas, aventuras e grandes batallas.",
                "1999-10-20",
                99
        );
//CASAL

        // ELIMINAR
        System.out.println();
        System.out.println("===== ELIMINAR REXISTRO =====");

        dao.eliminar("One Piece");

//CASAL
        // LEER TODOS DE NUEVO
        System.out.println();
        System.out.println("===== LER TODOS OS REXISTROS =====");

        dao.lerTodos();
    }
}