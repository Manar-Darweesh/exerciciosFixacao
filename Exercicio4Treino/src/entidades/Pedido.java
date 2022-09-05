package entidades;

import entidadeEnum.StatusPedido;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date momento = Date.from(Instant.now());
    private StatusPedido status;

    private Cliente cliente;

    private List <ItemPedido> itens = new ArrayList<ItemPedido>();

     public Pedido(){

     }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemPedido item){
         itens.add(item);
    }

    public void removeItem(ItemPedido item){
         itens.remove(item);
    }

    public double total(){
         double soma = 0.0;
         for (ItemPedido it : itens){
             soma = soma + it.subTotal();
         }
         return soma;
    }

    @Override
    public String toString(){
         String moment = sdf.format((momento));
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(moment + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente :" );
        sb.append(cliente + "\n");
        sb.append("Itens do pedido: ");
        for (ItemPedido item : itens){
            sb.append(item + "\n");
        }
        sb.append("Preco total: $");
        sb.append(String.format("%.2f",total()));
        return sb.toString();
    }
}
