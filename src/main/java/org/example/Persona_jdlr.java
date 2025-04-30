package org.example;

public class Persona_jdlr {
    private int id;
    private String nombre;
    private double  masa;
    private double altura;
    private int edad;

    public Persona_jdlr() {
    }

    public Persona_jdlr(int id, String nombre, double masa, double altura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona_jdlr{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }
}
