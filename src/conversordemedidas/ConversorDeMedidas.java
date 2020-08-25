/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordemedidas;

import java.util.Scanner;

public class ConversorDeMedidas {

    
    public static void main(String[] args) {
        float valor;
        
        Conversor conversor = new Conversor();
        Scanner in = new Scanner(System.in);
            System.out.println("Informe um valor em polegadas: ");
            valor = in.nextFloat();
            System.out.println("Valor informado: " + valor);
            conversor.converter(valor);
            
    }
    
}
