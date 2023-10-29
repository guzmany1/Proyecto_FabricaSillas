import java.util.Date;

public class Proveedor {
    private String contacto;
    private String direccion;
    private int numero_telefono;
    private int id_proveedor;

    // Constructor
    public Proveedor(String contacto, String direccion, int numero_telefono, int id_proveedor) {
        this.contacto = contacto;
        this.direccion = direccion;
        this.numero_telefono = numero_telefono;
        this.id_proveedor = id_proveedor;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
}
