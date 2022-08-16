/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cilindro;

/**
 *
 * @author gabri
 */
public class cilindro {
    private float altura = 0;
    private float raio = 0;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public float getRaio() {
        return raio;
    }
    
    public float calcVolume (){
        return (float) (3.1415*raio*raio*altura);
    }
    
    public float calcArea(){
        return (float)(2*3.1415*raio*(altura+raio));
    }
    
    public float calcAreaLat (){
        return (float) (2*3.1415*raio*altura);
    }
}

