public class Aeropuerto {
    private String nombre;
    private String pais;
    private String ciudad;
    private int pistasAterrizaje;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String pais, String ciudad, int pistasAterrizaje) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.pistasAterrizaje = pistasAterrizaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPistasAterrizaje() {
        return pistasAterrizaje;
    }

    public void setPistasAterrizaje(int pistasAterrizaje) {
        this.pistasAterrizaje = pistasAterrizaje;
    }
}
