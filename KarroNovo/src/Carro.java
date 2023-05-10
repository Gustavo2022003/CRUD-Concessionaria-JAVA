import java.util.Scanner;

public class Carro extends Automotor{
    private Integer quantidadePortas;

    Scanner scanner = new Scanner(System.in);

    public Carro(){
        super();
        System.out.println("Digite a quantidade de portas:");
        this.quantidadePortas = scanner.nextInt();
    }

}
