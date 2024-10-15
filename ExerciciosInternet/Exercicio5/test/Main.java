package ExerciciosInternet.Exercicio5.test;

import ExerciciosInternet.Exercicio5.dominio.Fisioterapeuta;
import ExerciciosInternet.Exercicio5.dominio.Medico;
import ExerciciosInternet.Exercicio5.dominio.Pediatra;
import ExerciciosInternet.Exercicio5.dominio.Psicologo;

public class Main {
    public static void main(String[] args) {
        Fisioterapeuta f = new Fisioterapeuta("Fisioterapia", "Lucas", 28,7300);
        Psicologo p = new Psicologo("Psicologia", "Eduardo", 23, 3100);
        Pediatra ped = new Pediatra("Pediatria", "Wanessa", 36, 12000);
        Medico[] medicos = {f, p, ped};

        for (Medico m : medicos) {
            m.imprime();
        }
    }
}
