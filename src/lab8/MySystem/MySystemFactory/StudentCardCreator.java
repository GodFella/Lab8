/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8.MySystem.MySystemFactory;
import lab8.Cards.*;
import lab8.Cards.CardVoyagesLonginess.*;
/**
 *
 * @author serg
 */
public class StudentCardCreator extends CardCreator{
    @Override
    public Card createCard(int id){
        return new StudentCard(id);
    }

    @Override
    public Card createCard(Longiness v1,Voyages v2, int id){
         return new StudentCard(id);
    }

    @Override
    public Card createCard(double money,int id){
        return new StudentCard(id);
    }
}
