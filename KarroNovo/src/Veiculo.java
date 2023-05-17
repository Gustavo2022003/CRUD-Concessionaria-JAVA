import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    private Integer codigo;
    private String cor, marca, modelo;
    private Double valor;

    Scanner scanner = new Scanner(System.in);


    public Veiculo(){

        System.out.println("Digite o código do veículo:");
        this.codigo = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a cor do veículo:");
        this.cor = scanner.nextLine();

        System.out.println("Digite a marca do veículo:");
        this.marca = scanner.nextLine();

        System.out.println("Digite o modelo do veículo:");
        this.modelo = scanner.nextLine();

        System.out.print("Digite o valor do veículo:\nR$ ");
        this.valor = Double.parseDouble(scanner.nextLine());

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
        this.codigo = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a cor do veículo:");
        this.cor = scanner.nextLine();

        System.out.println("Digite a marca do veículo:");
        this.marca = scanner.nextLine();

        System.out.println("Digite o modelo do veículo:");
        this.modelo = scanner.nextLine();

        System.out.print("Digite o valor do veículo:\nR$ ");
        this.valor = Double.parseDouble(scanner.nextLine());
    }

}
