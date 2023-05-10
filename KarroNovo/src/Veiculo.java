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
        this.cor = scanner.nextLine();
        System.out.println("Digite a marca do veículo:");
        this.marca = scanner.nextLine();
        System.out.println("Digite o modelo do veículo:");
        this.modelo = scanner.nextLine();
        System.out.println("Digite o valor do carro:");
        this.valor = scanner.nextDouble();

    }

}
