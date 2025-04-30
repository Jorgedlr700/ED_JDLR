package org.example;

public class Main {
    public static void main(String[] args) {

        Persona_jdlr pers1 = new Persona_jdlr(1,"Papa", 85, 1.75, 22);
        Persona_jdlr pers2 = new Persona_jdlr(2,"Pepe", 75, 1.80, 25);


        JDLR_GravedadPlaneta plan1 = new JDLR_GravedadPlaneta(1,"Tierra", 9.81);
        JDLR_GravedadPlaneta plan2 = new JDLR_GravedadPlaneta(2,"Marte", 3.72);
        JDLR_GravedadPlaneta plan3 = new JDLR_GravedadPlaneta(3,"Júpiter", 24.79);

        // Calcular pesos de la persona en Tierra
        Result result = getResult(pers1, plan1, plan2, plan3);

        // Calcular pesos de la persona en Marte
        Main.Result2 Result2 = getResult2(pers2, plan1, plan2, plan3);

        // Calculo IMC
        Main.IMC IMC = getImc(pers1, pers2);

        // Lo que muestra la información
        System.out.println(pers1);
        System.out.println("El IMC de la persona " + pers1.getNombre() + " es: " + IMC.imc1());

        System.out.println(pers2);
        System.out.println("El IMC de la persona " + pers2.getNombre() + " es: " + IMC.imc2());

        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);

        System.out.println("Peso de " + pers1.getNombre() + " en Tierra: " + result.pesoTierra1());
        System.out.println("Peso de " + pers1.getNombre() + " en Marte: " + result.pesoMarte1());
        System.out.println("Peso de " + pers1.getNombre() + " en Júpiter: " + result.pesoJupiter1());

        System.out.println("Peso de " + pers2.getNombre() + " en Tierra: " + Result2.pesoTierra2());
        System.out.println("Peso de " + pers2.getNombre() + " en Marte: " + Result2.pesoMarte2());
        System.out.println("Peso de " + pers2.getNombre() + " en Júpiter: " + Result2.pesoJupiter2());
    }

    public static IMC getImc(Persona_jdlr pers1, Persona_jdlr pers2) {
        double imc1 = pers1.getPeso() / (pers1.getAltura() * pers1.getAltura());
        double imc2 = pers2.getPeso() / (pers2.getAltura() * pers2.getAltura());
        IMC IMC = new IMC(imc1, imc2);
        return IMC;
    }

   public record IMC(double imc1, double imc2) {
    }

    private static Result2 getResult2(Persona_jdlr pers2, JDLR_GravedadPlaneta plan1, JDLR_GravedadPlaneta plan2, JDLR_GravedadPlaneta plan3) {
        double masa2 = pers2.getMasa();
        double pesoTierra2 = masa2 * plan1.getGravedadPlaneta();
        double pesoMarte2 = masa2 * plan2.getGravedadPlaneta();
        double pesoJupiter2 = masa2 * plan3.getGravedadPlaneta();
        Result2 Result2 = new Result2(pesoTierra2, pesoMarte2, pesoJupiter2);
        return Result2;
    }

    private record Result2(double pesoTierra2, double pesoMarte2, double pesoJupiter2) {
    }

    private static Result getResult(Persona_jdlr pers1, JDLR_GravedadPlaneta plan1, JDLR_GravedadPlaneta plan2, JDLR_GravedadPlaneta plan3) {
        double masa1 = pers1.getMasa();
        double pesoTierra1 = masa1 * plan1.getGravedadPlaneta();
        double pesoMarte1 = masa1 * plan2.getGravedadPlaneta();
        double pesoJupiter1 = masa1 * plan3.getGravedadPlaneta();
        Result result = new Result(pesoTierra1, pesoMarte1, pesoJupiter1);
        return result;
    }

    private record Result(double pesoTierra1, double pesoMarte1, double pesoJupiter1) {
    }
}


