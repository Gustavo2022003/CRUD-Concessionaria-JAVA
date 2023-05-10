public class Veiculo {
    private Integer codigo;
    private String cor, marca, modelo;
    private Double valor;

    public Veiculo(Integer codigo, String cor, String marca, String modelo, Double valor){
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }
}
