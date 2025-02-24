public class DispositivoDeSeguranca {
    private int idDispositivo;
    private String tipo;
    private String status;

    // Construtor
    public DispositivoDeSeguranca(int idDispositivo, String tipo, String status) {
        this.idDispositivo = idDispositivo;
        this.tipo = tipo;
        this.status = status;
    }

    // Métodos Getters e Setters
    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
