import java.util.Date;

public class Factura {
    private int id_factura;
    private int id_inventario;
    private int id_cliente;
    private int cantidad;
    private double precio_unitario;
    private double precio_total;
    private double precio_final;
    private Date fecha;
    private int id_tipopago;

    // Constructor
    public Factura(int id_factura, int id_inventario, int id_cliente, int cantidad, double precio_unitario, double precio_total, double precio_final, Date fecha, int id_tipopago) {
        this.id_factura = id_factura;
        this.id_inventario = id_inventario;
        this.id_cliente = id_cliente;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
        this.precio_final = precio_final;
        this.fecha = fecha;
        this.id_tipopago = id_tipopago;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_tipopago() {
        return id_tipopago;
    }

    public void setId_tipopago(int id_tipopago) {
        this.id_tipopago = id_tipopago;
    }
}