public class Medicamento {
    private String bula;
    private String validade;

    // Construtor
    public Medicamento(String bula, String validade) {
        this.bula = bula;
        this.validade = validade;
    }

    // Métodos Getters e Setters

    public String getBula() {
        return bula;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }

    public String getValidade() {
        return validade;
    }
}
