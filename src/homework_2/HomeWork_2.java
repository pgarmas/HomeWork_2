/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.util.Scanner;

/**
 *
 * @author Polina
 */
public class HomeWork_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your number");
            Scanner sn = new Scanner(System.in);
            int pick = sn.nextInt();
        
        for (int divider = pick; divider >0; divider--) {
            int result=pick%divider;
            if(result==0) 
                System.out.println("divider="+divider+" ");
        }
    }
    
}
