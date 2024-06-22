package proyecto_colaboraciones;

import java.io.Serializable;

/**
 *
 * @author joser
 */
public class Colaborador implements Serializable {

    private String nombre;

    private int numeroColaboraciones;

    public Colaborador(String nombre, int numeroColaboraciones) throws Exception {
        this.nombre = nombre;

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
        return "Nombre: " + nombre + " Colaboraciones: " + numeroColaboraciones;
    }

}
