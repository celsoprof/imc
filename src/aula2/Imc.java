package aula2;

public class Imc {

    public static void main(String[] args) {

        int peso = 73;
        double altura = 1.74;

        double imc;

        imc = peso / Math.pow(altura, 2);

        System.out.println(imc);
    }

}
