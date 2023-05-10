import java.util.Scanner;

public class Bicicleta extends Veiculo{
    private String tipoFreio;
    Scanner scanner = new Scanner(System.in);

    public Bicicleta(){
        super();
        System.out.println("Digite o tipo de freio da bicicleta:");
        String tipoFreio = scanner.nextLine().toUpperCase();

        if (tipoFreio != "C" || tipoFreio != "V" || tipoFreio != "F" || tipoFreio != "M" || tipoFreio != "H") {
            System.out.println("Por favor, escolha um tipo de freio válido!");
        } else {
            this.tipoFreio = tipoFreio;
        }

    }
}
