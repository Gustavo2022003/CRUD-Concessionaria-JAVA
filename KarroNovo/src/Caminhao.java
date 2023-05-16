import java.util.Scanner;

public class Caminhao extends Automotor{
    private Double cargaMax;
    private Integer numEixos;
    Scanner scanner = new Scanner(System.in);

    public Caminhao(Double cargaMax, Integer numEixos, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.cargaMax = cargaMax;
        this.numEixos = numEixos;
    }
    public Caminhao(){
        super();
        System.out.println("Digite a carga máxima do caminhão:");
        this.cargaMax = scanner.nextDouble();
        System.out.println("Digite o número de eixos:");
        this.numEixos = scanner.nextInt();
    }

    @Override
    public void exibir(){
        System.out.println("\n\u001B[33m==CAMINHÃO==\u001B[0m");
        super.exibir();
        System.out.println("Carga máxima: " + this.cargaMax + "\nNúmero de eixos: " + this.numEixos);
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println("Digite a carga máxima do caminhão:");
        this.cargaMax = scanner.nextDouble();
        System.out.println("Digite o número de eixos:");
        this.numEixos = scanner.nextInt();
    }
}
