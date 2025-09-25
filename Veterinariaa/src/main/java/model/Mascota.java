package model;

import java.util.Arrays;

public class Mascota {
    private String codigo;
    private String nombre;
    private String raza;
    private double peso;
    private String color;
    private byte edad;
    private String especie;
    private String[] enfermedades;

    public Mascota(String codigo, String nombre, String raza, double peso, String color, byte edad, String especie, String[] enfermedades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
        this.edad = edad;
        this.especie = especie;
        this.enfermedades = Arrays.copyOf(enfermedades, 5);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double    getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String[] getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String[] enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String toString() {
        return "Código: " + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Peso: " + peso + "\n" +
                "Color: " + color + "\n"+
                "Edad: " + edad + "\n" +
                "Especie: " + especie + "\n" +
                "Enfermedades: "  + java.util.Arrays.toString(enfermedades);
    }
}
