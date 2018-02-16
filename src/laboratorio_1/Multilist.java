/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_1;


/**
 *
 * @author Estudiantes
 */
public class Multilist {
   

    class Nodo {
        int nro_registro;  //Registro
        Nodo link_nodo; //Para Moverse entre listas principales
        Subnodo link_subnodo; //Para acceder a la sublista de la lista principal
    }

    class Subnodo {
        String campo;
        Subnodo link;//Moverse entre campos
    }
    
    Subnodo Getcampos(Nodo ptr,Subnodo list, int reg){
        Nodo p = ptr;
        while(p != null && p.nro_registro != reg){
            p = p.link_nodo;
        }
        list = p.link_subnodo;
        
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
        Subnodo q = p.link_subnodo;
        Subnodo r = new Subnodo();
        r.campo = campo;
        if (q == null) {
            p.link_subnodo = r;
        }else{
            while(q.link != null){
                q = q.link;
            }
            q.link = r;
        }
        return ptr;
    }

}
