
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    private static final String ficheroPartido = "C:\\Users\\Santiago\\Downloads\\ProyectoPartido\\src\\PartidoLiga.txt";
    public static void main(String[] args) {
        System.out.println("--- se crea un ArrayList para trabajar en el main");
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        File fichero = new File(ficheroPartido);
        Scanner leerLinea = null;

        try {
            System.out.println("...leemos el contenido del fichero");
            leerLinea = new Scanner(fichero);

            while (leerLinea.hasNextLine()) {
                String linea = leerLinea.nextLine();
                PartidoFutbol partidoJugado = new PartidoFutbol();
                String cortarString[] = linea.split("::");
                partidoJugado.setEquipoLocal(cortarString[0]);
                partidoJugado.setEquipoVisitante(cortarString[1]);
                partidoJugado.setGolLocal(Integer.parseInt(cortarString[2]));
                partidoJugado.setGolVisitante(Integer.parseInt(cortarString[3]));
                partidos.add(partidoJugado);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no leido " + ex);
        }

        System.out.println("...Guardado");
        System.out.println("Total de partidos: " + partidos.size());
        System.out.println("\n--- Lista de partidos ---");

        for (PartidoFutbol p : partidos) {
            System.out.println(p.getEquipoLocal() + " " + p.getGolLocal()
                    + " - " + p.getEquipoVisitante() + " " + p.getGolVisitante());
        }

        //Mostrar partidos donde ganó el visitante
        System.out.println("\n--- Partidos donde ganó el visitante ---");

        for (PartidoFutbol p : partidos) {
            if (p.getGolVisitante() > p.getGolLocal()) {
                System.out.println(p.getEquipoLocal() + " " + p.getGolLocal()
                        + " - " + p.getEquipoVisitante() + " " + p.getGolVisitante());
            }
        }

        //Contar cuántas veces ganó el Barcelona
        int victoriasBarcelona = 0;
        for (PartidoFutbol p : partidos) {
            if (p.getEquipoLocal().equals("Barcelona") && p.getGolLocal() > p.getGolVisitante()) {
                victoriasBarcelona++;
            }
            if (p.getEquipoVisitante().equals("Barcelona") && p.getGolVisitante() > p.getGolLocal()) {
                victoriasBarcelona++;
            }
        }

        System.out.println("\nVeces que ganó el Barcelona: " + victoriasBarcelona);
        // 3. Eliminar partidos que no sean empate
        Iterator<PartidoFutbol> it = partidos.iterator();

        while (it.hasNext()) {
            PartidoFutbol p = it.next();
            if (p.getGolLocal() != p.getGolVisitante()) {
                it.remove();
            }
        }

        System.out.println("\n--- Partidos que quedaron (solo empates) ---");
        for (PartidoFutbol p : partidos) {
            System.out.println(p.getEquipoLocal() + " " + p.getGolLocal()
                    + " - " + p.getEquipoVisitante() + " " + p.getGolVisitante());
        }

       
        // Contar cuántos partidos ganó el equipo local
        int victoriasLocal = 0;
        for (PartidoFutbol p : partidos) {
            if (p.getGolLocal() > p.getGolVisitante()) {
                victoriasLocal++;
            }
        }

        System.out.println("\nPartidos ganados por el equipo local: " + victoriasLocal);

    }
}
