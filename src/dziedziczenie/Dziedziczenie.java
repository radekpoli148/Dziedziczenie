/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dziedziczenie;

import dziedziczenie.potwor.Potwor;
import dziedziczenie.potwor.Szkielet;
import dziedziczenie.potwor.Zombie;


public class Dziedziczenie {

    public static void main(String[] args) {
        /*Klasa potwór została zmieniona na abstrakcyją
        nie można teraz stworzyć podstawowego potwora i 
        trzeba wybrać jego rodzaj*/
        //Potwor p = new Potwor(10, 100) {};
        //System.out.println(p.predkoscChodzenia);
        
        Szkielet s = new Szkielet(20, 50, "Luk");
        //System.out.println(s.predkoscChodzenia);
        
        Zombie z = new Zombie();
        
        Potwor x = new Szkielet(25, 70);
        x.atakuj();
    }
    
}
