package org.example;

public class JDLR_GravedadPlaneta {
    private int id;
    private String nombre;
    private double GravedadPlaneta;

    public JDLR_GravedadPlaneta() {
    }

    public JDLR_GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
        this.id = id;
        this.nombre = nombre;
        GravedadPlaneta = gravedadPlaneta;
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

    public double getGravedadPlaneta() {
        return GravedadPlaneta;
    }

    public void setGravedadPlaneta(double gravedadPlaneta) {
        GravedadPlaneta = gravedadPlaneta;
    }

    @Override
    public String toString() {
        return "JDLR_GravedadPlaneta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", GravedadPlaneta=" + GravedadPlaneta +
                '}';
    }
}
