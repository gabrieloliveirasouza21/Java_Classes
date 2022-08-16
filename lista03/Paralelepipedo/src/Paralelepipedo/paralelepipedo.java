/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paralelepipedo;

/**
 *
 * @author gabri
 */
public class paralelepipedo {
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;

    public float getAltura() {
        return altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float calVolume(){
        return altura * comprimento*largura;
    }
    public float calcArea() {
        return ( 2 * (altura * largura + altura * comprimento + largura * comprimento));
    }
}
