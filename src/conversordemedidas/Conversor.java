/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordemedidas;

public class Conversor {
    float polegadas, centimetro, largura, altura;
    
    public Conversor(){
    }
    
    public void converter(float polegadas){
        centimetro = polegadas/0.393f;
        largura = centimetro * 0.871575f;
        altura = centimetro * 0.490261f;
        System.out.println("Valor em centímetros: " + centimetro);
        System.out.println("Valor na largura (cm): " + largura);
        System.out.println("Valor na altura (cm): " + altura);
    }
    
    public double getPolegadas(){
        return polegadas;
    }
    public void setPolegadas(float polegadas){
        this.polegadas = polegadas;
    }
}
