
package com.mycompany.diadasemana;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
   
try{
    System.out.println("Digite qual o dia da semana de 1 a 7: ");
    System.out.println("1: domingo");
    System.out.println("2: segunda-feira");
    System.out.println("3: terça-feira");
    System.out.println("4: quarta-feira");
    System.out.println("5: quinta-feira");
    System.out.println("6: sexta-feira");
    System.out.println("7: sábado");
    
    int week = scanner.nextInt();
    
    switch (week) {
        case 1:
            System.out.println("Hoje é domindo.");
        break;

        case 2:
            System.out.println("Hoje é segunda-feira.");
        break;

        case 3:
            System.out.println("Hoje é terceiro-feira.");
        break;

        case 4:
            System.out.println("Hoje é quarta-feira.");
        break;

        case 5:
            System.out.println("Hoje é quinta-feira.");
        break;

        case 6:
            System.out.println("Hoje é sexta-feira.");
        break;
        
        case 7:
            System.out.println("Hoje é sábado.");
        break;

        default:
            System.out.println("Dia da semana inválido.");
        }
            
        }catch(Exception e) {
        System.out.println("O valor digitado não é válido, digite outro por favor.");

        }finally{
        scanner.close();
        System.out.println("Obrigado por utilizar o nosso serviço.");
        }        
    }
}
