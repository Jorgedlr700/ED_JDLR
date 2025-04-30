package org.example;

public class Main {
    public static void main(String[] args) {

        Persona_jdlr pers1 = new Persona_jdlr(1,"Papa", 85, 1.75, 22);
        Persona_jdlr pers2 = new Persona_jdlr(2,"Pepe", 75, 1.80, 25);


        JDLR_GravedadPlaneta plan1 = new JDLR_GravedadPlaneta(1,"Tierra", 9.81);
        JDLR_GravedadPlaneta plan2 = new JDLR_GravedadPlaneta(2,"Marte", 3.72);
        JDLR_GravedadPlaneta plan3 = new JDLR_GravedadPlaneta(3,"Júpiter", 24.79);

        // Calcular pesos de la persona en Tierra
        double masa1 = pers1.getMasa();
        double pesoTierra1 = masa1 * plan1.getGravedadPlaneta();
        double pesoMarte1 = masa1 * plan2.getGravedadPlaneta();
        double pesoJupiter1 = masa1 * plan3.getGravedadPlaneta();

        // Calcular pesos de la persona en Marte
        double masa2 = pers2.getMasa();
        double pesoTierra2 = masa2 * plan1.getGravedadPlaneta();
        double pesoMarte2 = masa2 * plan2.getGravedadPlaneta();
        double pesoJupiter2 = masa2 * plan3.getGravedadPlaneta();

        // Lo que muestra la  información
        System.out.println(pers1);
        System.out.println("El IMC de la persona " + pers1.getNombre() + " es " );

        System.out.println(pers2);
        System.out.println("El IMC de la persona " + pers2.getNombre() + " es " );

        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);

        System.out.println("Peso de " + pers1.getNombre() + " en Tierra: " + pesoTierra1);
        System.out.println("Peso de " + pers1.getNombre() + " en Marte: " + pesoMarte1);
        System.out.println("Peso de " + pers1.getNombre() + " en Júpiter: " + pesoJupiter1);

        System.out.println("Peso de " + pers2.getNombre() + " en Tierra: " + pesoTierra2);
        System.out.println("Peso de " + pers2.getNombre() + " en Marte: " + pesoMarte2);
        System.out.println("Peso de " + pers2.getNombre() + " en Júpiter: " + pesoJupiter2);
    }
}


