package proyecto_colaboraciones;

import java.io.Serializable;
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
public class Colaboradores implements Serializable {

    private ArrayList<Colaborador> colaboradores;

    public Colaboradores() {
    }

    public Colaboradores(ArrayList<Colaborador> colaboradores) throws Exception {
        if (colaboradores.size() > 40) {
            throw new Exception("Lista puede tener maximo 40 colaboradores");
        } else {
            this.colaboradores = colaboradores;
        }
    }

    //añadirle un colaborador a la lista
    public void adicionar(Colaborador colaborador) { //añadir un colaborador 
        colaboradores.add(colaborador);
    }

    //vaciar lista de colaboradores
    public void vaciar() {
        for (Colaborador colaboradore : colaboradores) {
            colaboradores.remove(colaboradore);
        }
    }

    //retorna el colaborador con mas colaboraciones
    public Colaborador maximo() {
        if (colaboradores.isEmpty()) {
            return null;
        }
        return Collections.max(colaboradores, Comparator.comparingInt(Colaborador::getNumeroColaboraciones));
    }

    //retorna colaborador con menos colaboraciones
    public Colaborador minimo() {
        if (colaboradores.isEmpty()) {
            return null;
        }
        return Collections.min(colaboradores, Comparator.comparingInt(Colaborador::getNumeroColaboraciones));
    }

    //retorna tamaño del arraylist
    public int tamanio() {
        return colaboradores.size();
    }

    //lista todos los colaboradores en Output
    public void listar() {

        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador);
        }
    }

    // Ordenar colaboradores por número de colaboraciones
    //Comparator para ordenarlos en base al numero de colaboraciones
    public void ordernar() {
        Collections.sort(colaboradores, Comparator.comparingInt(Colaborador::getNumeroColaboraciones));
    }

    //selecciona aleatoriamente un colaborador de los primeros 10(o menos) con 
    //menos colaboraciones
    public Colaborador obtenerColaboradorRandom() {
        if (colaboradores.size() < 10) {
            return null;
        }
        ArrayList<Colaborador> menosColaboradores = obtenerPrimerosColaboradores();
        Random random = new Random();
        return menosColaboradores.get(random.nextInt(menosColaboradores.size()));
    }

    //ordena lista y devuelve una lista de los 10 con menos colaboraciones
    public ArrayList<Colaborador> obtenerPrimerosColaboradores() {
        ordernar();
        int size = Math.min(10, colaboradores.size());
        return new ArrayList<>(colaboradores.subList(0, size));
    }

}
