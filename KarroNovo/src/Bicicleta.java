import java.util.Scanner;

public class Bicicleta extends Veiculo{
    private String tipoFreio;
    Scanner scanner = new Scanner(System.in);

    public Bicicleta(String tipoFreio, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(codigo, cor, marca, modelo, valor);
        this.tipoFreio = tipoFreio;
    }

    public Bicicleta(){
        super();
        System.out.println("Digite o tipo de freio da bicicleta:");
        String tipoFreio = scanner.nextLine();
        tipoFreio = tipoFreio.toUpperCase();

        if (tipoFreio.equals("C") || tipoFreio.equals("V") || tipoFreio.equals("F") || tipoFreio.equals("M") || tipoFreio.equals("H")) {
            this.tipoFreio = tipoFreio;
        } else {
            System.out.println("Por favor, escolha um tipo de freio válido!");
            System.out.println(tipoFreio);
        }

    }

    @Override
    public void exibir(){
        System.out.println("\n\u001B[36m==BICICLETA==\u001B[0m");
        super.exibir();
        System.out.println("Tipo de freio: " + this.tipoFreio);
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println("Digite o tipo de freio da bicicleta:");
        String tipoFreio = scanner.nextLine();
        tipoFreio = tipoFreio.toUpperCase();

        if (tipoFreio.equals("C") || tipoFreio.equals("V") || tipoFreio.equals("F") || tipoFreio.equals("M") || tipoFreio.equals("H")) {
            this.tipoFreio = tipoFreio;
        } else {
            System.out.println("Por favor, escolha um tipo de freio válido!");
            System.out.println(tipoFreio);
        }
    }

}
