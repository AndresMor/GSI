/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_1;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Multilist {

    class Nodo {

        int nro_registro;  //Registro
        Nodo link_nodo; //Para Moverse entre listas principales
        ArrayList<String> campos = new ArrayList<>();//Campos
    }

    ArrayList<String> Getcampos(Nodo ptr,ArrayList<String> list, int reg){
        Nodo p = ptr;
        while(p != null && p.nro_registro != reg){
            p = p.link_nodo;
        }
        list = p.campos;
        return list;
    }

    Nodo Agregarlista(Nodo ptr, int reg) {
        Nodo p = new Nodo();
        p.nro_registro = reg;

        if (ptr == null) {
            return p;
        }

        Nodo q = ptr;
        while (q.link_nodo != null) {
            q = q.link_nodo;
        }
        q.link_nodo = p;
        return ptr;
    }

    Nodo Agregarcampo(Nodo ptr, int reg, String campo) {
        Nodo p = ptr;

        while (p != null && p.nro_registro != reg) {
            p = p.link_nodo;
        }
        if (p == null) {
            return p;
        }
        ArrayList<String> m = p.campos;
        m.add(campo);
        return ptr;
    }

}
