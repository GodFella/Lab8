/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8.day;
import java.util.Random;
/**
 *
 * @author serg
 */
public class DayPassed {
    static private Random r=new Random();
    public static int getDayPassed(){
        return r.nextInt(3)/2;
    }
}
