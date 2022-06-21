/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    public ReporteEstudiante(String c ){
        super(c);
    }
    public void establecerListaEstudiantes(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    public void establecerPromedioMatriculas(){
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas
                    + lista.get(i).getMatricula();
            
        }
        promedioMatriculas = promedioMatriculas / lista.size();
   
    }
    public ArrayList<Estudiante> obtenerListaEstudiantes() {
        return lista;
    } 
    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }
   
    
    @Override
    public String toString() {
        String reporte = String.format("%s\n", "Lista Estudiante");
        for (int i = 0; i < lista.size(); i++) {
            reporte = String.format("%s%s\n",
                    reporte,
                    lista.get(i));
        }
        String cadena = String.format("\nCodigo: %s \n"
                + "%s"
                + "El promedio de matriculas es: %.2f\n",
                codigo,
                reporte,
                obtenerPromedioMatriculas());
        return cadena;

    }

}

