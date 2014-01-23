/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8.exceptions;

/**
 *
 * @author serg
 */
public class NoMoneyLeftException extends RuntimeException{
    private String m;

    public NoMoneyLeftException() {
        m = "  No credit left at this card";
    }

    @Override
    public String toString() {
        return m;
    }
}
