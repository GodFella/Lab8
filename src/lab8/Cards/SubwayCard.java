/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.Cards;

import lab8.Cards.CardVoyagesLonginess.*;

/**
 *
 * @author serg
 */
public abstract class SubwayCard implements Card {

    public int id;
    public int voyagesLeft;
    public int timeLeft;
    public double currentMoney;
    public String type;

    public SubwayCard(Longiness v1, Voyages v2, int id) {
        if (v1 != null && v2 != null) {
            timeLeft = v1.getValue();
            voyagesLeft = v2.getValue();
        }
        this.id = id;
    }

}
