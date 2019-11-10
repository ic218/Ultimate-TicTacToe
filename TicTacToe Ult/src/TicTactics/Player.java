/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTactics;



/**
 *
 * @author ivana
 */
public enum Player {
    X("-fx-text-fill: blue;"),
    O("-fx-text-fill: red;");

    private final String style;

    Player(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
