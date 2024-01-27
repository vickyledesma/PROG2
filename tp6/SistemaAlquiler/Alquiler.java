package tp6.SistemaAlquiler;

import java.time.LocalDate;


public class Alquiler {
    private Cliente cliente;
    private Item item;
    private LocalDate fechaVencimiento;


 public Alquiler(Cliente cliente, Item item, LocalDate fechaVencimiento) {
        this.cliente = cliente;
        this.item = item;
        this.fechaVencimiento = fechaVencimiento;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Item getItem() {
        return item;
    }


    public void setItem(Item item) {
        this.item = item;
    }


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }


    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public boolean estaVencido() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.isAfter(fechaVencimiento);
    }

    
}
