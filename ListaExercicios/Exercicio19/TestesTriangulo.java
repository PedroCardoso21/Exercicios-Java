package ListaExercicios.Exercicio19;

public class TestesTriangulo {
    Triangulo triangulo;

    public TestesTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
        maiorLado(triangulo);
        menorLado(triangulo);
        valorDoMeio(triangulo);
        existenciaTriangulo();
        System.out.println(tipoTriangulo());
    }

    public static int maiorLado(Triangulo triangulo) {
        if (triangulo.getLadoA() >= triangulo.getLadoB() && triangulo.getLadoA() >= triangulo.getLadoC()) {
            return triangulo.getLadoA();
        } else if (triangulo.getLadoB() >= triangulo.getLadoC() && triangulo.getLadoB() >= triangulo.getLadoC()) {
            return triangulo.getLadoB();
        } else {
            return triangulo.getLadoC();
        }
    }

    public static int menorLado(Triangulo triangulo) {
        if (triangulo.getLadoA() <= triangulo.getLadoB() && triangulo.getLadoA() <= triangulo.getLadoC()) {
            return triangulo.getLadoA();
        } else if (triangulo.getLadoB() <= triangulo.getLadoC() && triangulo.getLadoB() <= triangulo.getLadoC()) {
            return triangulo.getLadoB();
        } else {
            return triangulo.getLadoC();
        }
    }

    public static int valorDoMeio(Triangulo triangulo) {
        if (triangulo.getLadoA() != maiorLado(triangulo) && triangulo.getLadoA() != menorLado(triangulo)) {
            return triangulo.getLadoA();
        } else if (triangulo.getLadoB() != maiorLado(triangulo) && triangulo.getLadoB() != menorLado(triangulo)) {
            return triangulo.getLadoB();
        } else {
            return triangulo.getLadoC();
        }
    }

    public boolean existenciaTriangulo() {
        if (maiorLado(triangulo) < (menorLado(triangulo) + valorDoMeio(triangulo))) {
            return true;
        } else {
            return false;
        }
    }

    public String tipoTriangulo() {
        if (existenciaTriangulo()) {
            if (triangulo.getLadoA() == triangulo.getLadoB() && triangulo.getLadoA() == triangulo.getLadoC()) {
                return "O triângulo é equilátero!";
            } else if (triangulo.getLadoA() != triangulo.getLadoB() && triangulo.getLadoA() != triangulo.getLadoC()
                       && triangulo.getLadoB() != triangulo.getLadoC()) {
                return "O triângulo é escaleno";
            } else {
                return "O triângulo é isósceles";
            }
        } else {
            return "Não é possível formar um triângulo";
        }
    }
}
