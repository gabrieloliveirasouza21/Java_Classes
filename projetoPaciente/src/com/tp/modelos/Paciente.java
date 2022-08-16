package com.tp.modelos;

public class Paciente {
    //atributos 
    
    public String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    // métodos

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
    
    
    public float calcularIMC(){
        return (peso/(altura*altura));
    }   
}

