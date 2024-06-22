package proyecto_colaboraciones;

import java.io.Serializable;

/**
 *
 * @author joser
 */
public class Colaborador implements Serializable {

    private String nombre;
    private String apellido;
    private int numeroColaboraciones;

    public Colaborador(String nombre, String apellido, int numeroColaboraciones) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        setNumeroColaboraciones(numeroColaboraciones);
    }

    public Colaborador() {
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.isBlank() || nombre.isEmpty()) {
            throw new Exception("Nombre no puede ser blank o nulo");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (apellido.isBlank() || apellido.isEmpty()) {
            throw new Exception("Apellido no puede ser blank o nulo");
        } else {
            this.apellido = apellido;

        }
    }

    public int getNumeroColaboraciones() {
        return numeroColaboraciones;
    }

    public void setNumeroColaboraciones(int numeroColaboraciones) throws Exception {
        if (numeroColaboraciones < 0) {
            throw new Exception("Numero de colaboraciones no puede ser menor a 0");
        } else {
            this.numeroColaboraciones = numeroColaboraciones;
        }
    }

    @Override
    public String toString() {
        return "Colaborador( " + nombre + " " + apellido + " ; Colaboraciones: " + numeroColaboraciones + " )";
    }

}
