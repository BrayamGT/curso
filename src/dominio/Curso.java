package dominio;

public class Curso {

    private double[] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;

    public Curso() {
        notas = new double[12];

    }

    public void setNotas(double notas[]) {
        this.notas = notas;
    }

    public void mostrarNotas() {
        for (int i = 0; i < 12; i++) {
            System.out.println(this.notas[i]);
        }
    }

    public void setPromedio() {
        double s_notas = 0;
        double promedio = 0;
        for (int i = 0; i < 12; i++) {
            s_notas += notas[i];
        }
        promedio = s_notas / 12;
        this.promedio = promedio;
    }

    public void setEstudiantesEncimaPromedio() {
        //codigo duplicado en setPromedio
        int estudiantes = 0;
        double promedio = 0;
        double s_notas = 0; 
        for (int i = 0; i < 12; i++) {
            s_notas += notas[i];
        }
        promedio = s_notas / 12; 
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedio) {
                estudiantes = estudiantes +1;
            }
        }
        this.estudiantesEncimaPromedio = estudiantes;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public int getnroEstudiantesEncimaPromedio() {
        return this.estudiantesEncimaPromedio;
    }

}
