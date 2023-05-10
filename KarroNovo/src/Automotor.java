import java.util.Scanner;

public class Automotor extends Veiculo{
    private String tipoCombustivel;

    Scanner scanner = new Scanner(System.in);

    public Automotor(){
        super();

        System.out.println("Digite o tipo de combustível:");
        String tipoCombustivel = scanner.nextLine().toUpperCase();

        if (tipoCombustivel != "G" || tipoCombustivel != "A" || tipoCombustivel != "F" || tipoCombustivel != "E" || tipoCombustivel != "D") {
            System.out.println("Por favor, escolha um tipo de freio válido!");
        } else {
            this.tipoCombustivel = tipoCombustivel;
        }

    }
}
