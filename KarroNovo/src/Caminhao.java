import java.util.Scanner;

public class Caminhao extends Automotor{
    private Double cargaMax;
    private Integer numEixos;
    Scanner scanner = new Scanner(System.in);
    public Caminhao(){
        super();
        System.out.println("Digite a carga máxima do caminhão:");
        this.cargaMax = scanner.nextDouble();
        System.out.println("Digite o número de eixos:");
        this.numEixos = scanner.nextInt();
    }
}
