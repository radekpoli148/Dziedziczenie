/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dziedziczenie.potwor;

/**
 *
 * @author PC
 */
public class Szkielet extends Potwor
{
    @Override
    public void atakuj()
    {
        super.atakuj();
        /*
        Dodatkowe instrukcje ataku
        */
        System.out.println("To metoda atakuj z klasy Szkielet");
    }
    
    String typBroni;
    public Szkielet()
    {
        System.out.println("Domyślny konstruktor z klasy Szkielet");
    }
    
    public Szkielet(double predkoscChodzenia, double zywotnosc)
    {
        super(predkoscChodzenia, zywotnosc);
        System.out.println("Niedomyślny konstruktor z klasy Szkielet z 2 argumentami");
    }
    
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
    {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyślny konstruktor z klasy Szkielet z 3 argumentami");
    }

    @Override
    protected void opis() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
