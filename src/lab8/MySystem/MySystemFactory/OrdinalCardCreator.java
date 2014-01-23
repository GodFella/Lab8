/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8.MySystem.MySystemFactory;

import lab8.Cards.Card;
import lab8.Cards.CardVoyagesLonginess.Longiness;
import lab8.Cards.CardVoyagesLonginess.Voyages;
import lab8.Cards.*;

/**
 *
 * @author serg
 */
public class OrdinalCardCreator extends CardCreator{
    @Override
    public Card createCard(int id){
        return new OrdinalCard(0,id);
    }

    @Override
    public Card createCard(Longiness v1,Voyages v2, int id){
         return new OrdinalCard(v1,v2,id);
    }

    @Override
    public Card createCard(double money,int id){
        return new OrdinalCard(money,id);
    }
}
