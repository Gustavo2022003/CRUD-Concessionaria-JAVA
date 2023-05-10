public class Moto extends Automotor{
    private boolean partidaEletrica;
    private Integer cilindradas;

    public Moto(boolean partidaEletrica, Integer cilindradas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.partidaEletrica = partidaEletrica;
        this.cilindradas = cilindradas;
    }
}
