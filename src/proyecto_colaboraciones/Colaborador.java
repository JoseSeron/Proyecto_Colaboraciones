package proyecto_colaboraciones;

/**
 *
 * @author joser
 */
public class Colaborador {

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
