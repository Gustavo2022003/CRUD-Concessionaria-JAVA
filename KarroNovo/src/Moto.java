import java.util.Scanner;

public class Moto extends Automotor{
    private boolean partidaEletrica;
    private Integer cilindradas;
    Scanner scanner = new Scanner(System.in);
    public Moto(){
        super();
        System.out.println("A moto possuí partida elétrica? [S/N]");
        String partidaEletrica = scanner.nextLine().toUpperCase();

        if (partidaEletrica == "S"){
            this.partidaEletrica = true;
        } else if (partidaEletrica == "N"){
            this.partidaEletrica = false;
        } else {
            System.out.println("Digite um valor válido!");
        }

        System.out.println("Digite quantas cilindradas a moto possuí?");
        this.cilindradas = scanner.nextInt();

    }
}
