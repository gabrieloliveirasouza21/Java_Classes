package retangulo;

public class Retangulo {
    private float comprimento = 0;
    private float largura = 0;

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }
    
    public float calcArea(){
        return largura * comprimento;
    }
    
    public float calcPerimetro(){
        return (largura*2) + (comprimento * 2);
    }

    public void getComprimento(float comprimento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getLargura(float largura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
