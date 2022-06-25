/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.*;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        // inicio de solución
              do {
            System.out.println("Reporte de Datos"
                    +"Seleccione el objeto de tipo Estudiante a crear\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia\n");
            tipoEstudiante = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = Integer.parseInt(entrada.nextLine());
            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial e1 = new EstudiantePresencial();
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = Double.parseDouble(entrada.nextLine());
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                e1.establecerNombresEstudiante(nombresEst);
                e1.establecerApellidoEstudiante(apellidosEst);
                e1.establecerIdentificacionEstudiante(identificacionEst);
                e1.establecerEdadEstudiante(edadEst);
                e1.establecerNumeroCreditos(numeroCreds);
                e1.establecerCostoCredito(costoCred);
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
//                estudiantes[contador] = estudianteP;
                estudiantes.add(e1);
            } else {
                if (tipoEstudiante == 2) {
                    EstudianteDistancia e2 = new EstudianteDistancia();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = Double.parseDouble(entrada.nextLine());
                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    e2.establecerNombresEstudiante(nombresEst);
                    e2.establecerApellidoEstudiante(apellidosEst);
                    e2.establecerIdentificacionEstudiante(identificacionEst);
                    e2.establecerEdadEstudiante(edadEst);
                    e2.establecerNumeroAsginaturas(numeroAsigs);
                    e2.establecerCostoAsignatura(costoAsig);
                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudianteDistancia
                    estudiantes.add(e2);
                }else{
                    System.out.println("Opción fuera de rango");
                }
            }
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");
            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("S"));
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            System.out.printf("Datos Estudiante :"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}

        
        
        