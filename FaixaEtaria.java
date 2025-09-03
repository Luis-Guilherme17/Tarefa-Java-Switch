
package com.mycompany.faixaetaria;

//Olá, meu nome é Luis e eu vou fazer um código com JavaSwitch e JavaScanner
import java.util.Scanner;

public class FaixaEtaria {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
try{
    System.out.println("Escolha a faixa etária:"); 
    System.out.println("1: Criança (0 a 12)");
    System.out.println("2: Adolescente (13 a 17)");
    System.out.println("3: Adulto (18 a 59)");
    System.out.println("4: Idoso (60 ou mais)");
    
    int opção = scanner.nextInt();

    System.out.print("Digite a sua idade: ");
    int idade = scanner.nextInt();
    
    System.out.println();

switch (opção) {
        case 1:
        if (idade <= 12) {
        System.out.println("Você é uma criança. Sua faixa etária é infantil.");
        }else {
        System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        case 2:
        if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente. Sua faixa etária é juvenil.");
        }else {
            System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        case 3:
        if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto. Sua faixa etária é adulta.");
        }else {
            System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        case 4:
        if (idade >= 60) {
            System.out.println("Você é um idoso. Sua faixa etária é idosa.");
        }else {
            System.out.println("A idade digitada não corresponde à faixa escolhida.");
        }
        break;

        default:
        System.out.println("Opção inválida. Digite de 1 a 4 por favor.");
        break;
        }

    }catch(Exception e) {
    System.out.println("O valor digitado não é válido.");
        
    }finally{
    scanner.close();
    System.out.println("Obrigado por utilizar o nosso serviço.");
        }
    }
}

