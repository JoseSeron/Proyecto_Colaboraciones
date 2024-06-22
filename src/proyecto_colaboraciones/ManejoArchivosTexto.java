package proyecto_colaboraciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author joser
 */
public class ManejoArchivosTexto {

    private File archivo;

    public ManejoArchivosTexto(String rutaArchivo) {
        this.archivo = new File(rutaArchivo);
    }

    // leer el archivo
    public String leerArchivo() {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contenido.toString();
    }

    //escribir el archivo
    public void escribirArchivo(String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // agregar al archivo al final
    public void agregarAlArchivo(String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // borrar
    public void borrarArchivo() {
        if (archivo.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                bw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // borrar archivo
    public boolean eliminarArchivo() {
        return archivo.delete();
    }

    // exists
    public boolean existeArchivo() {
        return archivo.exists();
    }

//    // Método para obtener el tamaño del archivo
//    public long obtenerTamanoArchivo() {
//        return archivo.length();
//    }
    // Método para obtener el nombre del archivo
    public String obtenerNombreArchivo() {
        return archivo.getName();
    }

}
