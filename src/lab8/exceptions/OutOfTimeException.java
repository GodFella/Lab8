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
public class OutOfTimeException extends RuntimeException {

    private String m;

    public OutOfTimeException() {
        m = "  This card's usage period is ended";
    }

    @Override
    public String toString() {
        return m;
    }
}
