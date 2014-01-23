/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import lab8.Cards.*;
import lab8.Cards.CardVoyagesLonginess.Longiness;
import lab8.Cards.CardVoyagesLonginess.Voyages;
import lab8.MySystem.*;
import lab8.MySystem.MySystemFactory.*;
import lab8.Turniket.Turniket;

/**
 *
 * @author serg
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CardCreator factory = new OrdinalCardCreator();
        Card c1 = MySystem.createCard(factory, 8);
        factory = new OrdinalCardCreator();
        Card c2 = MySystem.createCard(factory,Longiness.TenDays,Voyages.Ten);
        Turniket.observeCard((SubwayCard) c1);
        Turniket.observeCard((SubwayCard) c1);
        Turniket.observeCard((SubwayCard) c1);
        Turniket.observeCard((SubwayCard) c1);
        for (int i = 0; i < 12; i++) {
            Turniket.observeCard((SubwayCard) c2);
        }
        System.out.println(((SubwayCard) c2).timeLeft);
        MySystem.showGeneralInformation("Accumulative");
    }

}
