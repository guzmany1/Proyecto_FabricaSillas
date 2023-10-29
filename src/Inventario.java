import java.util.Date;

public class Inventario {
    private int id_producto;
    private String existencia;
    private Date fecha_salida;
    private Date fecha_ingreso;
    private int id_inventario;
    private int id_proveedor;
    private int id_compra;
    private int id_factura;

    // Constructor
    public Inventario(int id_producto, String existencia, Date fecha_salida, Date fecha_ingreso, int id_inventario, int id_proveedor, int id_compra, int id_factura) {
        this.id_producto = id_producto;
        this.existencia = existencia;
        this.fecha_salida = fecha_salida;
        this.fecha_ingreso = fecha_ingreso;
        this.id_inventario = id_inventario;
        this.id_proveedor = id_proveedor;
        this.id_compra = id_compra;
        this.id_factura = id_factura;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
}
