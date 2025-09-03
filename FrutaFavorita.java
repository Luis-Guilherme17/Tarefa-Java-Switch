
package com.mycompany.frutafavorita;

import java.util.Scanner;

public class FrutaFavorita {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
   
try{
    System.out.println("Digite qual a sua fruta favorita de 1 a 3: ");
    System.out.println("1: Maçã");
    System.out.println("2: banana");
    System.out.println("3: Laranja");
    
    int resposta = scanner.nextInt();
    
    switch (resposta) {
        case 1:
            System.out.println("Você escolheu a maçã!");
        break;

        case 2:
            System.out.println("Você escolheu a banana!");
        break;

        case 3:
            System.out.println("Você escolheu a laranja!");
        break;

        default:
            System.out.println("Haha, muito engraçado, escolha um número de acordo.");
        
    }   
    }catch(Exception e) {
    System.out.println("O valor digitado não é válido, digite outro por favor.");
        
    }finally{
    System.out.println("Obrigado por utilizar o nosso serviço.");
        }        
    }
}
    
