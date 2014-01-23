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
public enum Longiness {

    TenDays(10), Month(31);
    int value;

    private Longiness(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
