/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.Cards;

import lab8.Cards.CardVoyagesLonginess.Longiness;
import lab8.Cards.CardVoyagesLonginess.Voyages;

/**
 *
 * @author serg
 */
public class OrdinalCard extends SubwayCard implements Accumulatable {
      
    private boolean ifAccumulative;

    public OrdinalCard(Longiness v1, Voyages v2, int id) {
        super(v1,v2,id);
        ifAccumulative = false;
        type="Ordinal Card";
    }

    public OrdinalCard(double money, int id) {
        super(null,null,id);
        currentMoney = money;
        ifAccumulative = true;
        type="Accumulative card";
    }

    @Override 
    public boolean ifAccumulative(){
        return this.ifAccumulative;
    }
}
