import java.util.Scanner;

public class Carro extends Automotor{
    private Integer quantidadePortas;

    Scanner scanner = new Scanner(System.in);
    public Carro(){
        super();
        System.out.println("Digite a quantidade de portas:");
        this.quantidadePortas = scanner.nextInt();
    }

    public Carro(Integer quantidadePortas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibir(){
        System.out.println("\n\u001B[31m==CARRO==\u001B[0m");
        super.exibir();
        System.out.println("Número de portas: " + this.quantidadePortas);
    }

    public Integer GetQuantidade_portas(){
        return this.quantidadePortas;
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println("Digite a quantidade de portas:");
        this.quantidadePortas = scanner.nextInt();
    }

}
