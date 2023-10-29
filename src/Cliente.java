import java.util.Date;

public class Cliente {
    private String nombre;
    private int telefono;
    private int id_cliente;
    private String direccion;
    private String correo;

    // Constructor
    public Cliente(String nombre, int telefono, int id_cliente, String direccion, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id_cliente = id_cliente;
        this.direccion = direccion;
        this.correo = correo;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}


