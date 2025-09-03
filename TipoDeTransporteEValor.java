
package com.mycompany.tipodetransporteevalor;

//Olá, meu nome é Luis e eu vou fazer um código com JavaSwitch e JavaScanner
import java.util.Scanner;

public class TipoDeTransporteEValor {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    //Primeira tarefa 
try{
    System.out.println("Digite qual tipo de passagem você deseja de 1 a 4: ");
    System.out.println("1: Ônibus urbano");
    System.out.println("2: Metrô");
    System.out.println("3: Trem intermunicipal");
    System.out.println("4: Ônibus rodoviário");
    int Passagem = scanner.nextInt();
    
    String TipoDePassagem = "";
    double Valor = 0;
    
    switch (Passagem) {
        case 1:
        TipoDePassagem = "ônibus urbano";
        Valor = 4.40;
        System.out.println("Você deseja comprar uma passagem de ônibus urbano?");
        break;

        case 2:
        TipoDePassagem = "metrô";
        Valor = 5.00;
        System.out.println("Você deseja comprar uma passagem de metrô?");
        break;

        case 3:
        TipoDePassagem = "trem intermunicipal";
        Valor = 6.50;
        System.out.println("Você deseja comprar uma passagem de trem intermunicipal?");
        break;

        case 4:
        TipoDePassagem = "ônibus rodoviário";
        Valor = 12.00;
        System.out.println("Você deseja comprar uma passagem de ônibus rodoviário?");
        break;
        
        default:
        System.out.println("Número inválido, digite novamente um número de 1 a 4.");
        break;
        }
    
        System.out.print("Digite quantas passagens você deseja: ");
        int Quantidade = scanner.nextInt();
  
        System.out.println("Você deseja "+ Quantidade +" passagem(ns) de "+ TipoDePassagem + "?");
    
        double ValorTotal = Quantidade*Valor;
        System.out.println("O valor a se pagar é de R$"+ ValorTotal);
    
    }catch(Exception e) {
    System.out.println("O valor digitado não é válido, digite outro por favor.");
        
    }finally{
    scanner.close();
    System.out.println("Obrigado por utilizar o nosso serviço.");
        }
    }
}