package Exercicios;

import java.util.Scanner;

public class Exercicio_Modelo01 {

	public static void main(String[] args) {

        double nota1, nota2, notafinal;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Digite a nota do primeiro bimestre:");
        nota1 = sc.nextDouble();
        
        System.out.println ("Digite a nota do segundo bimestre:");    
        nota2 = sc.nextDouble();
        
        notafinal = nota1 + nota2;
        
        if (notafinal >= 60){
            
            System.out.println ("APROVADO !!");
            
        }
        else {
            System.out.println ("REPROVADO");
        }
        
        sc.close();
    }
}
/*
https://www.youtube.com/watch?v=SRyQZBaA-_s

*/