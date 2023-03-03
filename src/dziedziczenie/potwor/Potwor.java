/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dziedziczenie.potwor;

/**
 *
 * @author PC
 */
public abstract class Potwor {
    protected double predkoscChodzenia = 10; 
    protected double zywotnosc = 100;
    
    public void atakuj()
    {
        /*
        Podstawowe instrukcje ataku
        */
        System.out.println("To metoda atakuj z klasy Potwor");
    }
    
    abstract protected void opis();
    
    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy Potwor");
    }
    
    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyślny konstruktor z klasy Potwor");
    }
}
