/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    
    public ReportePolicia(String c) {
        super(c);
    }
    public void establecerListaPolicias(ArrayList<Policia> lista){
        this.lista = lista;
    }
    public void establecerPromediosEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades
                    + lista.get(i).getEdad();           
        }
        promedioEdades = promedioEdades / lista.size();
    }
    public ArrayList<Policia> obtenerListaPolicias(){
        return lista;
    }
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\n", "Lista Policias");
        for (int i = 0; i < lista.size(); i++) {
             reporte = String.format("%s%s\n",
                     reporte,
                    lista.get(i));
        }
        String cadena = String.format("\nCodigo: %s \n"
                + "%s"
                + "El promedio de edades es: %.2f\n",
                codigo,
                 reporte,
                obtenerPromedioEdades());
        return cadena;
    }
}
