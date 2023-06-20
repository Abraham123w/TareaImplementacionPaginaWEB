package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AsistenciaDAO {
    private static final String NOMBRE_ARCHIVO = "C:/Users/abrah/OneDrive/Escritorio/UNIVERSIAS 2023/OneDrive/TAREAS DE PRAGRAMACION/tareaImplementacionPaguinaWeb/implementacionPaguinaWeb/asistencia.txt";

    public static  void guardarNombresEnArchivo(List<String> nombres) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            StringBuilder sb = new StringBuilder();
            for (String nombre : nombres) {
                sb.append(nombre).append(",");
            }
            // Eliminar la última coma
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
