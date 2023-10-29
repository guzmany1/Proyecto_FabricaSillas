import java.util.Date;

public class TipoPago {
    private int id_tipopago;
    private String descripcion;

    // Constructor
    public TipoPago(int id_tipopago, String descripcion) {
        this.id_tipopago = id_tipopago;
        this.descripcion = descripcion;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public int getId_tipopago() {
        return id_tipopago;
    }

    public void setId_tipopago(int id_tipopago) {
        this.id_tipopago = id_tipopago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
