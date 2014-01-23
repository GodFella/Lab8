/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.Turniket;

import lab8.Cards.SubwayCard;
import lab8.Cards.Accumulatable;
import lab8.MySystem.MySystem;
import lab8.exceptions.*;
import lab8.day.DayPassed;

/**
 *
 * @author serg
 */
public class Turniket {

    private static boolean ifAccumulatable;

    public static void observeCard(SubwayCard card) {
        if (card instanceof Accumulatable) {
            ifAccumulatable = ((Accumulatable) card).ifAccumulative();
        }
        try {
            if (!ifAccumulatable && card.voyagesLeft <= 0) {
                MySystem.addPass(card, false);
                throw new NoVoyagesLeftException();
            }
            if (!ifAccumulatable && card.voyagesLeft <= 0) {
                MySystem.addPass(card, false);
                throw new OutOfTimeException();
            }
            if (ifAccumulatable && card.currentMoney - 2.5 <= 0) {
                MySystem.addPass(card, false);
                throw new NoMoneyLeftException();
            }
        } catch (NoVoyagesLeftException e) {
            System.out.println(e);
            return;
        } catch (OutOfTimeException e) {
            System.out.println(e);
            return;
        } catch (NoMoneyLeftException e) {
            System.out.println(e);
            return;
        }
        System.out.println("The pass is allowed");
        if (!ifAccumulatable) {
            card.timeLeft -= DayPassed.getDayPassed();
            card.voyagesLeft--;
        } else {
            card.currentMoney -= 2.5;
        }
        ifAccumulatable = false;
        MySystem.addPass(card, true);
    }

}
