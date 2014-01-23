/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.MySystem;

import java.util.ArrayList;
import lab8.Cards.*;
import lab8.MySystem.MySystemFactory.*;
import lab8.Cards.CardVoyagesLonginess.*;

/**
 *
 * @author serg
 */
public class MySystem {

    private static int id;
    private static ArrayList passesDescriptions = new ArrayList();

    private static class PassDescription {

        Object data;
        Object property;
    }

    public static Card createCard(CardCreator temp) {
        return temp.createCard(id++);
    }

    public static Card createCard(CardCreator temp, Longiness v1, Voyages v2) {
        return temp.createCard(v1, v2, id++);
    }

    public static Card createCard(CardCreator temp, double money) {
        return temp.createCard(money, id++);
    }

    public static void addPass(SubwayCard c, boolean cond) {
        PassDescription o = new PassDescription();
        o.data = c;
        o.property = cond;
        passesDescriptions.add(o);
    }

    public static void showGeneralInformation(String flag) {
        switch (flag) {
            case "General":
                System.out.println("The general information:");
                for (Object c : passesDescriptions) {
                    System.out.println("    card:");
                    System.out.println(((SubwayCard) ((PassDescription) c).data).id);
                    System.out.println(((SubwayCard) ((PassDescription) c).data).type);
                    System.out.println(((PassDescription) c).property);
                }
                break;
            case "Student":
                System.out.println("The information for student cards:");
                for (int i = 0; i < passesDescriptions.size(); i++) {
                    if (((PassDescription) passesDescriptions.get(i)).data instanceof StudentCard) {
                        System.out.println("    card");
                        System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).id);
                        System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).type);
                        System.out.println(((PassDescription) passesDescriptions.get(i)).property);
                    }
                }
                break;
            case "School":
                System.out.println("The information of the school cards");
                for (int i = 0; i < passesDescriptions.size(); i++) {
                    if (((PassDescription) passesDescriptions.get(i)).data instanceof SchoolCard) {
                        System.out.println("    card");
                        System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).id);
                        System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).type);
                        System.out.println(((PassDescription) passesDescriptions.get(i)).property);
                    }
                }
                break;
            case "Ordinal":
                System.out.println("The information of ordinal cards:");
                for (int i = 0; i < passesDescriptions.size(); i++) {
                    if (((PassDescription) passesDescriptions.get(i)).data instanceof Accumulatable) {
                        if (!((Accumulatable) ((PassDescription) passesDescriptions.get(i)).data).ifAccumulative()) {
                            System.out.println("    card");
                            System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).id);
                            System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).type);
                            System.out.println(((PassDescription) passesDescriptions.get(i)).property);
                        }
                    }

                }
                break;
            case "Accumulative":
                System.out.println("The information of accumulative card:");
                for (int i = 0; i < passesDescriptions.size(); i++) {
                    if (((PassDescription) passesDescriptions.get(i)).data instanceof Accumulatable) {
                        if (((Accumulatable) ((PassDescription) passesDescriptions.get(i)).data).ifAccumulative()) {
                            System.out.println("    card");
                            System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).id);
                            System.out.println(((SubwayCard) ((PassDescription) passesDescriptions.get(i)).data).type);
                            System.out.println(((PassDescription) passesDescriptions.get(i)).property);
                        }
                    }

                }
                break;
            default:
                break;
        }

    }
}
