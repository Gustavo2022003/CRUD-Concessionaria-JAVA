import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    private Integer codigo;
    private String cor, marca, modelo;
    private Double valor;

    Scanner scanner = new Scanner(System.in);


    public Veiculo(){

        System.out.println("Digite o código do veículo:");
        this.codigo = scanner.nextInt();

        System.out.println("Digite a cor do veículo:");
        this.cor = scanner.next();

        System.out.println("Digite a marca do veículo:");
        this.marca = scanner.next();

        System.out.println("Digite o modelo do veículo:");
        this.modelo = scanner.next();

        System.out.println("Digite o valor do veículo:");
        this.valor = scanner.nextDouble();

    }

    public Veiculo(Integer codigo, String cor, String marca, String modelo, Double valor){
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public void exibir(){
        System.out.println("Código: " + this.codigo + "\nCor: " + this.cor + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nValor: " + this.valor);
    }

    public Integer getCodigo(){
        return this.codigo;
    }

    public void editar(){
        System.out.println("Digite o código do veículo:");
        this.codigo = scanner.nextInt();

        System.out.println("Digite a cor do veículo:");
        this.cor = scanner.next();

        System.out.println("Digite a marca do veículo:");
        this.marca = scanner.next();

        System.out.println("Digite o modelo do veículo:");
        this.modelo = scanner.next();

        System.out.println("Digite o valor do veículo:");
        this.valor = scanner.nextDouble();
    }

}
