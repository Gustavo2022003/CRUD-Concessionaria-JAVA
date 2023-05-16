import java.util.Scanner;

public class Moto extends Automotor{
    private boolean partidaEletrica;
    private Integer cilindradas;

    public Moto(boolean partidaEletrica, Integer cilindradas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
    }
    Scanner scanner = new Scanner(System.in);
    public Moto(){
        super();
        System.out.println("A moto possuí partida elétrica? [S/N]");
        String partidaEletrica = scanner.nextLine().toUpperCase();

        if (partidaEletrica.equals("S")){
            this.partidaEletrica = true;
        }else if(partidaEletrica.equals("N")){
            this.partidaEletrica = false;
        }else{
            while(!(partidaEletrica.equals("S")  || partidaEletrica.equals("N") )){
                System.out.println("Digite um valor valido!");
                System.out.println("A moto possuí partida elétrica? [S/N]");
                partidaEletrica = scanner.next();
                if (partidaEletrica.equals("S")){
                    this.partidaEletrica = true;
                }else if(partidaEletrica.equals("N")) {
                    this.partidaEletrica = false;
                }
            }
        }

        System.out.println("Digite quantas cilindradas a moto possuí?");
        this.cilindradas = scanner.nextInt();

    }

    @Override
    public void exibir(){
        System.out.println("\n==MOTO==");
        super.exibir();
        System.out.println("Partida elétrica: " + this.partidaEletrica + "\nCilindradas: " + this.cilindradas);
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println("A moto possuí partida elétrica? [S/N]");
        String partidaEletrica = scanner.nextLine().toUpperCase();

        if (partidaEletrica.equals("S")){
            this.partidaEletrica = true;
        }else if(partidaEletrica.equals("N")){
            this.partidaEletrica = false;
        }else{
            while(!(partidaEletrica.equals("S")  || partidaEletrica.equals("N") )){
                System.out.println("Digite um valor valido!");
                System.out.println("A moto possuí partida elétrica? [S/N]");
                partidaEletrica = scanner.next();
                if (partidaEletrica.equals("S")){
                    this.partidaEletrica = true;
                }else if(partidaEletrica.equals("N")) {
                    this.partidaEletrica = false;
                }
            }
        }

        System.out.println("Digite quantas cilindradas a moto possuí?");
        this.cilindradas = scanner.nextInt();
    }
}
