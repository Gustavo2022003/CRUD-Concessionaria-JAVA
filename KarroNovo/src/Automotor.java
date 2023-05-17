import java.util.Scanner;

public class Automotor extends Veiculo{
    private String tipoCombustivel;

    Scanner scanner = new Scanner(System.in);

    public Automotor(){
        super();
        System.out.println("Digite o tipo de combustível\nG - Gasolina\nA - Alcool\nF - Flex\nE - Eletrico\nD - Diesel");
        this.tipoCombustivel = scanner.nextLine().toUpperCase();

        while(!(this.tipoCombustivel.equals("G")  || this.tipoCombustivel.equals("A") || this.tipoCombustivel.equals("F") || this.tipoCombustivel.equals("E") || this.tipoCombustivel.equals("D"))){
            System.out.println("Digite o tipo de combustível\nG- Gasolina\nA- Alcool\nF- Flex\nE- Eletrico\nD- Diesel");
            this.tipoCombustivel = scanner.nextLine().toUpperCase();
        }
    }

    public Automotor(String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(codigo, cor, marca, modelo, valor);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Tipo do combustivel: " + this.tipoCombustivel);
    }
    
    public String getTipoCombustivel(){
        return this.tipoCombustivel;
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println("Digite o tipo de combustível\nG - Gasolina\nA - Alcool\nF - Flex\nE - Eletrico\nD - Diesel\n");
        this.tipoCombustivel = scanner.nextLine().toUpperCase();

        while(!(this.tipoCombustivel.equals("G")  || this.tipoCombustivel.equals("A") || this.tipoCombustivel.equals("F") || this.tipoCombustivel.equals("E") || this.tipoCombustivel.equals("D"))){
            System.out.println("Valor inválido!");
            System.out.println("Digite o tipo de combustível\nG- Gasolina\nA- Alcool\nF- Flex\nE- Eletrico\nD- Diesel");
            this.tipoCombustivel = scanner.nextLine().toUpperCase();
        }
    }
}
