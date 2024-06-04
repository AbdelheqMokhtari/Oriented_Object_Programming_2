/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.myproject;

import java.util.Scanner;

/**
 *
 * @author Expert Info
 */
public class Quiz {

    String nom;
    int val;

    //constructor
    Quiz(String nom, int val) {
        this.nom = nom;
        this.val = val;
    }

    void calculScore() {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "X" + val + "=");
            int inputCandidat = sc.nextInt();
            int res = i * val;

            if (res == inputCandidat) {
                System.out.print("Correct!\n ");
                score++;
            } else {
                System.out.print("False!\n");
            }
        }

        System.out.println(nom + "!" + "Your score is :" + score + "/10 \n \n");
        
    }

}




