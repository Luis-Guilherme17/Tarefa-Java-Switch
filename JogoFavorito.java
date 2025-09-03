
package com.mycompany.jogofavorito;

import java.util.Scanner;

public class JogoFavorito {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
   
try{
    System.out.println("Digite seu jogo favorito de 1 a 5: ");
    System.out.println("1: Minecraft");
    System.out.println("2: FIFA");
    System.out.println("3: Fortnite");
    System.out.println("4: Call of Duty");
    System.out.println("5: The Sims");
    
    int game = scanner.nextInt();
    
    switch (game) {
        case 1:
            System.out.println("O seu jogo favorito é Minecraft?");
        break;

        case 2:
            System.out.println("O seu jogo favorito é FIFA?");
        break;

        case 3:
            System.out.println("O seu jogo favorito é Fortnite?");
        break;

        case 4:
            System.out.println("O seu jogo favorito é Call of Duty?");
        break;

        case 5:
            System.out.println("O seu jogo favorito é The Sims?");
        break;

        default:
            System.out.println("Vish, seu jogo não está listado dessa vez.");
        }
            
        }catch(Exception e) {
        System.out.println("O valor digitado não é válido, digite outro por favor.");

        }finally{
        System.out.println("Obrigado por utilizar o nosso serviço.");
        }        
    }
}