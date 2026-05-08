package coleccionesbiblioteca;

public class Main {

    public static void main(String[] args) {

        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Libro libro1 = new Libro(
                "LIB001",
                "El Hombre Más Rico de Babilonia",
                1926,
                true,
                "George S. Clason",
                "ISBN-9788497941495"
        );

        Libro libro2 = new Libro(
                "LIB002",
                "Padre Rico Padre Pobre",
                1997,
                true,
                "Robert Kiyosaki",
                "ISBN-9781612680194"
        );

        Libro libro3 = new Libro(
                "LIB003",
                "Los Secretos de la Mente Millonaria",
                2005,
                false,
                "T. Harv Eker",
                "ISBN-9780060763282"
        );

        Libro libro4 = new Libro(
                "LIB004",
                "Piense y Hágase Rico",
                1937,
                true,
                "Napoleon Hill",
                "ISBN-9781585424337"
        );

        Libro libro5 = new Libro(
                "LIB005",
                "Hábitos Atómicos",
                2018,
                true,
                "James Clear",
                "ISBN-9780735211292"
        );

        Revista revista1 = new Revista(
                "REV001",
                "Mario Bros Gamer Magazine",
                2025,
                true,
                12,
                "Videojuegos"
        );

        Revista revista2 = new Revista(
                "REV002",
                "Psicología Financiera",
                2026,
                true,
                5,
                "Psicología"
        );

        Revista revista3 = new Revista(
                "REV003",
                "Mentalidad de Éxito",
                2025,
                false,
                8,
                "Desarrollo Personal"
        );

        Revista revista4 = new Revista(
                "REV004",
                "Gaming Universe",
                2024,
                true,
                20,
                "Videojuegos"
        );

        sistema.registrarMaterial(libro1);
        sistema.registrarMaterial(libro2);
        sistema.registrarMaterial(libro3);
        sistema.registrarMaterial(libro4);
        sistema.registrarMaterial(libro5);

        sistema.registrarMaterial(revista1);
        sistema.registrarMaterial(revista2);
        sistema.registrarMaterial(revista3);
        sistema.registrarMaterial(revista4);

        sistema.mostrarCatalogo();

        sistema.agregarEspera("LIB003", "Brayan");

        sistema.agregarEspera("LIB003", "Emily");

        sistema.agregarEspera("LIB003", "Juliana");


        String siguiente1 = sistema.siguienteEnEspera("LIB003");

        System.out.println( "\nSiguiente usuario: " + siguiente1);

        String siguiente2 = sistema.siguienteEnEspera("LIB003");

        System.out.println( "Siguiente usuario: " + siguiente2);


        boolean miembro1 = sistema.registrarMiembro("Brayan");

        System.out.println( "\nBrayan registrado: " + miembro1);

        boolean miembro2 = sistema.registrarMiembro("Emily");

        System.out.println( "Emily registrada: " + miembro2);

        boolean miembro3 = sistema.registrarMiembro("Brayan");

        System.out.println( "Brayan registrado otra vez: " + miembro3);


        System.out.println( "\n¿Brayan tiene membresía? " + sistema.tieneMembresia("Brayan"));

        System.out.println( "¿Carlos tiene membresía? " + sistema.tieneMembresia("Carlos"));

        Material inexistente = sistema.buscarMaterial("LIB999");

        if (inexistente != null) {

            inexistente.mostrarInfo();

        } else {

            System.out.println( "\nLIB999 no existe en el catálogo");

        }

        Material encontrado = sistema.buscarMaterial("LIB001");


        if (encontrado != null) {

            System.out.println("\nMATERIAL ENCONTRADO");

            encontrado.mostrarInfo();

        } else {

            System.out.println("\nEl material no existe");

        }

    }

}
