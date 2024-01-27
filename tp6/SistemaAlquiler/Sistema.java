package tp6.SistemaAlquiler;

import java.util.ArrayList;


public class Sistema {
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Alquiler> alquileres;

    // Constructor

    public Sistema() {
        this.clientes = new ArrayList<Cliente>();
        this.items = new ArrayList<Item>();
        this.alquileres = new ArrayList<Alquiler>();
    }


    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
     public void addItem(Item item){
        items.add(item);
    }
     public void addAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    public void seVencioAlquiler() {
        for (int i=0; i< alquileres.size(); i++){
            Alquiler alquilerr = alquileres.get(i);
            if (alquilerr.estaVencido()){
                Cliente cliente = alquilerr.getCliente();
                Item item = alquilerr.getItem();
                System.out.println("Alquiler vencido: Cliente: " + cliente.getNombre() + ", Ítem: " + item);
            }
        }
    }
    
    public void sePuedeAlquilar(){
        for(int i=0;i<items.size();i++){
            Item itemss = items.get(i);
            if(itemss.estaDisponible()){
                itemss.alquilar();
                System.out.println("Ítem alquilado " + itemss);
                }
            }
        }


    }

