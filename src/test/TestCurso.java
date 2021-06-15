package test;

import dominio.Curso;

public class TestCurso {
    public static void main(String[] args) {
        Curso cursoA = new Curso();
        double [] notas = new double[12];
        llenaNotas(notas);    
        cursoA.setNotas(notas);
        cursoA.mostrarNotas();
        cursoA.setPromedio();
        System.out.println("El Promedio del Curso: "+cursoA.getPromedio());
        cursoA.setEstudiantesEncimaPromedio();
        System.out.println("Numero de Estudiantes encima del Promedio: "+cursoA.getnroEstudiantesEncimaPromedio());

    }
    public static void llenaNotas(double [] notas){
        for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;
        }
    }
}
