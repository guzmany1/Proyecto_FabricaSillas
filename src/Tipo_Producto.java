import java.util.Date;

public class TipoProducto {
    private int id_tipoproducto;
    private String descripcion;

    // Constructor
    public TipoProducto(int id_tipoproducto, String descripcion) {
        this.id_tipoproducto = id_tipoproducto;
        this.descripcion = descripcion;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public int getId_tipoproducto() {
        return id_tipoproducto;
    }

    public void setId_tipoproducto(int id_tipoproducto) {
        this.id_tipoproducto = id_tipoproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}