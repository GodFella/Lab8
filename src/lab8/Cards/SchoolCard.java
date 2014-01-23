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
public class SchoolCard extends SubwayCard {

    public SchoolCard(int id) {
        super(Longiness.TenDays, Voyages.Fife, id);
        type="School Card";
    }
}
