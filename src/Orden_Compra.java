import java.util.Date;

public class OrdenCompra {
    private Date fecha_pedido;
    private int id_compra;
    private double monto;
    private int cantidad;

    // Constructor
    public OrdenCompra(Date fecha_pedido, int id_compra, double monto, int cantidad) {
        this.fecha_pedido = fecha_pedido;
        this.id_compra = id_compra;
        this.monto = monto;
        this.cantidad = cantidad;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}