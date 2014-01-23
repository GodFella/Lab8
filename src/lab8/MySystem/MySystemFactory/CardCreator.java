/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.MySystem.MySystemFactory;

import lab8.Cards.Card;
import lab8.Cards.CardVoyagesLonginess.*;

/**
 *
 * @author serg
 */
public abstract class CardCreator {

    public abstract Card createCard(int id);

    public abstract Card createCard(Longiness v1, Voyages v2, int id);

    public abstract Card createCard(double money, int id);
}
