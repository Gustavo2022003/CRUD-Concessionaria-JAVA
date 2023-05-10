public class Automotor extends Veiculo{
    private String tipoCombustivel;

    public Automotor(String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(codigo, cor, marca, modelo, valor);
        this.tipoCombustivel = tipoCombustivel;
    }
}
