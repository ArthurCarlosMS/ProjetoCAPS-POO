public class Seguranca extends DispositivoDeSeguranca{
    public String fardamento;
  
    public String getFardamento(){
      return fardamento;
    }
  
    public void setFardamento(String fardamento){
      this.fardamento=fardamento;
    }
  
    public Seguranca (int idDispositivo, String tipo, String status, String fardamento){
      super(idDispositivo, tipo, status)
      this.fardamento=fardamento;
    }
  }