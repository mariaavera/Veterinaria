package model;

public class Propietario {

    private String nombres;
    private String apellidos;
    private String identificacion;
    private String telefono;
    private String direccion;

    public Propietario (String nombres, String apellidos, String identificacion, String telefono, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        return "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Identificación: " + identificacion + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Dirección: " + direccion;
    }
}
