package aplicacao;

import entidadeEnum.StatusPedido;
import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data nascimento (DD/MM/YYYY): ");
        Date dataNasc = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, dataNasc);

        System.out.println("Entre com os dados do pedido: ");
        System.out.println("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos produtos o pedido tera?");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            System.out.println("Entre com o # " + (i + 1) + " item");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preco do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            ItemPedido ip = new ItemPedido(quantidade, precoProduto, produto);

            pedido.addItem(ip);

        }

        System.out.println();
        System.out.print(pedido);

        sc.close();
    }
}
