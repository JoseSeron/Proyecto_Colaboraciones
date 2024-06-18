package proyecto_colaboraciones;

import java.util.ArrayList;
import java.util.Collections;
//import proyecto_colaboraciones.Colaborador;

/**
 *
 * @author joser Clase Colaboradores Administrara un arraylist<colaboradores>,
 * aqui se implementan todos los metodos del arraylist
 */
public class Colaboradores {

    private ArrayList<Colaborador> colaboradores;

    public Colaboradores() {
    }

    public void adicionar(Colaborador colaborador) {
colaboradores.add(colaborador);
    }

    public void vaciar() {
        for (Colaborador colaboradore : colaboradores) {
            colaboradores.remove(colaboradore);
        }
    }

    public void maximo() {

    }

    public void minimo() {

    }

    public void tamanio() {

    }

    public void listar() {

    }

    public void ordernar() {

    }

    public void obtenerColaboradorRandom() {

    }

    public void obtenerPrimerosColaboradores() {

    }

}
