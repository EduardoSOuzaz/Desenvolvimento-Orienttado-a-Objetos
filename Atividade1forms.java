package com.mycompany.atv;
public class Atividade1forms {
    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //metodos
    void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Esta tampada: " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    void rabiscar(){
       if (this.tampada == true){
           System.out.println("Erro não posso rabiscar");
       } else{
           System.out.println("Estou rabiscante");
       }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
        
    }
}
