package mx.uv.facing.iinf.poo;

import java.util.ArrayList;

public class Listado {
    ArrayList listadoInterinos = new ArrayList ();
    ArrayList listadoTitulares = new ArrayList ();
    
    public void addProfesorInterino (ProfesorInterino interino) {
        listadoInterinos.add (interino);
    }
    
    public void addProfesorTitular (ProfesorTitular titular) {
        listadoTitulares.add (titular);
    }
    
    void mostrarInterinos () {

    }
    
}