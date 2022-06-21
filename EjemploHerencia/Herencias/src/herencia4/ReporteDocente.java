/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente (String c) {
        super(c);
    }

    public void establecerListaDocentes(ArrayList<Docente> lista) {
        this.lista = lista;
    }
    public void establecerPromedioSueldos(){
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();       
        }
        promedioSueldos = promedioSueldos/lista.size();
    }
    public ArrayList<Docente> obtenerListaDocentes() {
        return lista;
    }
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\n", "Lista Docentes");
        for (int i = 0; i < lista.size(); i++) {
            reporte = String.format("%s%s\n",
                    reporte,
                    lista.get(i));
        }
        String cadena = String.format("\nCodigo: %s \n"
                + "%s"
                + "El promedio de sueldos es: %.2f\n",
                codigo,
                reporte,
                obtenerPromedioSueldos());
        return cadena;

    }

}


