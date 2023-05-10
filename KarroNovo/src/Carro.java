public class Carro extends Automotor{
    private Integer quantidadePortas;

    public Carro(Integer quantidadePortas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.quantidadePortas = quantidadePortas;
    }
}
