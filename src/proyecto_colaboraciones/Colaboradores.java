package proyecto_colaboraciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
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

    public void adicionar(Colaborador colaborador) { //añadir un colaborador 
        colaboradores.add(colaborador);
    }

    public void vaciar() { //vaciar lista de colaboradores
        for (Colaborador colaboradore : colaboradores) {
            colaboradores.remove(colaboradore);
        }
    }

    public Colaborador maximo() { //el colaborador con mayor numero de colaboraciones
        if (colaboradores.isEmpty()) {
            return null;
        }
        return Collections.max(colaboradores, Comparator.comparingInt(Colaborador::getNumeroColaboraciones));
    }

    public Colaborador minimo() {
        if (colaboradores.isEmpty()) {
            return null;
        }
        return Collections.min(colaboradores, Comparator.comparingInt(Colaborador::getNumeroColaboraciones));
    }

    public int tamanio() {
        return colaboradores.size();
    }

    public void listar() {
        //lista todos los colaboradores en Output
        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador);
        }
    }

    // Ordenar colaboradores por número de colaboraciones
    //Comparator para ordenarlos en base al numero de colaboraciones
    public void ordernar() {
        Collections.sort(colaboradores, Comparator.comparingInt(Colaborador::getNumeroColaboraciones));
    }

     public Colaborador obtenerColaboradorRandom() {
        if (colaboradores.size() < 10) {
            return null;
        }
        List<Colaborador> menosColaboradores = obtenerPrimerosColaboradores();
        Random random = new Random();
        return menosColaboradores.get(random.nextInt(menosColaboradores.size()));
    }

    public List<Colaborador> obtenerPrimerosColaboradores() {
        ordernar();
        int size = Math.min(10, colaboradores.size());
        return new ArrayList<>(colaboradores.subList(0, size));
    }

}
