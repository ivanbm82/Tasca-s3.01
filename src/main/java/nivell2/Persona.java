package nivell2;

public class Persona {

    private String nombre;
    private String apellidos;
    private String calle;
    private String numCalle;
    private String pisoPuerta;
    private String telefono;

    public Persona(String nombre, String apellidos, String calle, String numCalle, String pisoPuerta, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calle = calle;
        this.numCalle = numCalle;
        this.pisoPuerta = pisoPuerta;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", calle=" + calle + ", numCalle=" + numCalle
                + ", pisoPuerta=" + pisoPuerta + ", telefono=" + telefono + "]";
    }
}