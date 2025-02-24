public class ServicoDeLimpeza{
    public boolean estacomcarrinho;
    public boolean gerente;
  
    public boolean getEstacomcarrinho(){
      return estacomcarrinho;
    }
    public boolean getGerente(){
      return gerente;
    }
    
    public void setEstacomcarrinho(boolean estacomcarrinho){
      this.estacomcarrinho=estacomcarrinho;
    }
    public void setGerente(boolean gerente){
      this.gerente = gerente;
    }
    
  
    public ServicoDeLimpeza(boolean estacomcarrinho, boolean gerente){
      this.estacomcarrinho = estacomcarrinho;
      this.gerente = gerente;
    }
  }