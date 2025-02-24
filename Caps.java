public class Caps {
    private int codUnidade;
    private String endereco;
    private String cnpj;

    // Construtor
    public Caps(int codUnidade, String endereco, String cnpj) {
        this.codUnidade = codUnidade;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    // Métodos Getters e Setters
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    public String getEndereco() {
        return endereco;
    }

    private void setEndereco(String endereco) { // Método privado conforme o diagrama
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
