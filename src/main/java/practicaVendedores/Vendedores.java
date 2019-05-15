/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaVendedores;

import java.util.ArrayList;
import practicaVendedores.Vendedor;

/**
 *
 * @author mac
 */
public class Vendedores {

    private ArrayList<Vendedor> Vendedores;

    public Vendedores() {
        Vendedores = new ArrayList<Vendedor>();
    }

    public boolean anyadir_Vendedor(Vendedor v) {
        
        boolean anyadir = true;
        if(Vendedores.contains(v)){
            anyadir = false;
        } else {
            Vendedores.add(v);
            anyadir = true;
        }
        return anyadir;
    }

    public boolean eliminar_Vendedor(int numvend) {
        
        Vendedor vend = buscar_Vendedor(numvend);
        boolean elimina = true;

        if (Vendedores.contains(numvend)) {
            Vendedores.remove(numvend);
            elimina = true;
        } else {
            elimina = false;
        }
        return elimina;
    }

    public Vendedor buscar_Vendedor(int numvend) {
        Vendedor vend2 = null;
        
        for (int i = 0; i < Vendedores.size(); i++) {
            if (Vendedores.get(i).getNumvend()==numvend) {
                vend2 = Vendedores.get(i);
            }
        }

        return vend2;
    }

    public ArrayList<Vendedor> buscar_Vendedor(String provincia) {
        ArrayList<Vendedor> Vendedores2 = new ArrayList<Vendedor>();

        for (int i = 0; i < Vendedores.size(); i++) {
            Vendedor Vend = Vendedores.get(i);
            if (Vendedores.get(i).getProvincia().equalsIgnoreCase(provincia)) {
                Vendedores2.add(Vendedores.get(i));
            }
        }

        return Vendedores2;
    }
}
