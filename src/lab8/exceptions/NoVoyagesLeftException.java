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
public class NoVoyagesLeftException extends RuntimeException {

    private String m;

    public NoVoyagesLeftException() {
        m = "  No more voyages left at this card";
    }

    @Override
    public String toString() {
        return m;
    }
}
