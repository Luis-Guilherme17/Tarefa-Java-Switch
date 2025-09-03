
package com.mycompany.agenciabancaria;

//Olá, meu nome é Luis e eu vou fazer um código com JavaSwitch e JavaScanner
import java.util.Scanner;

public class AgenciaBancaria {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    double Saldo = 1000;
try{
    System.out.println("Digite qual serviço você deseja de 1 a 4: ");
    System.out.println("1: Consultar seu saldo");
    System.out.println("2: Sacar uma quantia do seu saldo");
    System.out.println("3: Depositar uma quantia no seu saldo");
    System.out.println("4: Encerrar o atendimento");
    int Serviço = scanner.nextInt();
    
    switch (Serviço) {
        case 1:
        System.out.println("Você deseja consultar o seu saldo?");
        System.out.println("Seu saldo é de R$"+ Saldo); 
        break;

        case 2:
        System.out.println("Você deseja sacar quanto dinheiro do seu saldo?");

        double Saque = scanner.nextDouble();

        if (Saque > Saldo) {
        System.out.println("Quantidade inválida, digite um número igual ou menor que o seu saldo.");
        }else {
        System.out.println("Seu novo saldo é de R$"+ (Saldo-Saque));
        }
        break;

        case 3:
        System.out.println("Você deseja depositar quanto dinheiro no seu saldo?");

        double Depósito = scanner.nextDouble();

        if (Depósito <= 0) {
        System.out.println("Quantidade inválida, digite um número maior que 0.");
        }else {
        System.out.println("Seu novo saldo é de R$"+ (Saldo+Depósito));
        }
        break;

        case 4:
        System.out.println("Você deseja encerrar o atendimento?");
        break;
        
        default:
        System.out.println("Número de serviço inválido, digite novamente um número de 1 a 4.");
        break;
        }
    
    }catch(Exception e) {
    System.out.println("O valor digitado não é válido, digite outro por favor.");
        
    }finally{
    scanner.close();
    System.out.println("Obrigado por utilizar o nosso serviço.");
        }
    }
}