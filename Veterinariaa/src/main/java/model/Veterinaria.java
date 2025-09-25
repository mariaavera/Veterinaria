package model;

import java.util.ArrayList;

public class Veterinaria {
    private String nombre;
    private String telefono;
    private String ubicacion;
    private String nit;
    private ArrayList<Mascota> listaMascotas;


    public Veterinaria(String nombre, String telefono, String ubicacion, String nit) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaMascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    /**
     * This method allows you to register a new pet in case they are not already in the data base
     * @param nuevaMascota
     * @return
     */
    public String registrarMascota(Mascota nuevaMascota){
        String resultado = "";
        Mascota mascotaEncontrada = null;
        mascotaEncontrada = buscarMascota(nuevaMascota.getCodigo());
        if(mascotaEncontrada == null){
            listaMascotas.add(nuevaMascota);
            resultado = "La mascota fue registrada en la veterinaria ";
        }else{
            resultado = "La mascota ya existe para la veterinaria ";
        }
        return resultado;
    }

    /**
     * This method allows you to look up for a pet registered in the database
     * @param codigo
     * @return
     */
    public Mascota buscarMascota(String codigo){

        Mascota resultado = null;
        for(int i=0; i < listaMascotas.size(); i++){

            Mascota mascotaAux = listaMascotas.get(i);
            if(mascotaAux.getCodigo().equals(codigo)){
                resultado = mascotaAux;
                break;
            }
        }
        return resultado;
    }

    /**
     * This method allows you to look up for a pet registered in the database
     * @param codigo
     * @return
     */
    public Mascota buscarMascota4(String codigo){

        Mascota resultado = null;
        for(Mascota mascotaAux : listaMascotas){
            if(mascotaAux.getCodigo().equals(codigo)){
                return mascotaAux;
            }
        }
        return resultado;
    }

    /**
     * This method allows you to eliminate or remove a pet from de database.
     * @param codigo
     * @return
     */
    public String eliminarMascota(String codigo){
        Mascota mascotaEncontrada = null;

        mascotaEncontrada = buscarMascota(codigo);

        if(mascotaEncontrada != null){
            listaMascotas.remove(mascotaEncontrada);
            System.out.println("Mascota eliminada exitosamente");
            return "Mascota eliminada exitosamente";
        }else{
            return "Mascota no existe";
        }

    }

    /**
     * This method allos you to edit or update existing pet information in the database.
     * @return
     */

    public String actualizarMascota(String codigoActual,String nuevoNombre){
        String resultado = "";
        Mascota mascotaEncontrada = null;

        mascotaEncontrada = buscarMascota(codigoActual);
        if(mascotaEncontrada != null){
            mascotaEncontrada.setNombre(nuevoNombre);
            resultado = "La información de la mascota fue actualizada correctamente";
        }else{
            resultado = "La mascota no existe";
        }

        return resultado;
    }

    public String actualizarMascota(String codigoActual, String nuevoNombre,String nuevaRaza, double nuevoPeso, byte nuevaEdad, String nuevaEspecie, String []nuevaEnfermedades){
        String resultado = "";
        Mascota mascotaEncontrada = null;

        mascotaEncontrada = buscarMascota(codigoActual);
        if(mascotaEncontrada != null){
            mascotaEncontrada.setNombre(nuevoNombre);
            mascotaEncontrada.setRaza(nuevaRaza);
            mascotaEncontrada.setPeso(nuevoPeso);
            mascotaEncontrada.setEdad(nuevaEdad);
            mascotaEncontrada.setEspecie(nuevaEspecie);
            mascotaEncontrada.setEnfermedades(nuevaEnfermedades);
            resultado = "La información de la mascota fue actualizada correctamente";
        }else{
            resultado = "La mascota no existe";
        }

        return resultado;
    }



}