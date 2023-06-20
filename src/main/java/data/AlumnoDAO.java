package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    private static final String NOMBRE_ARCHIVO = "C:/Users/abrah/OneDrive/Escritorio/UNIVERSIAS 2023/OneDrive/TAREAS DE PRAGRAMACION/tareaImplementacionPaguinaWeb/implementacionPaguinaWeb/alumnos.txt";


    public static List<String> extraerNombresDesdeArchivo() {
        List<String> nombres = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO ))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nombres.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nombres;
    }

}
