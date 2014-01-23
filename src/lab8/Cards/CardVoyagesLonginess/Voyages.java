/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.Cards.CardVoyagesLonginess;

/**
 *
 * @author serg
 */
public enum Voyages {

    Fife(5), Ten(10);
    private int value;

    private Voyages(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
