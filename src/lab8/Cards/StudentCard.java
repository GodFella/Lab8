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
public class StudentCard extends SubwayCard {

    public StudentCard(int id) {
        super(Longiness.Month, Voyages.Ten, id);
        type="Student Card";
    }

}
