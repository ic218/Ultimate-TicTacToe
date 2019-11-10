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
public enum Winner {
      NONE(""),
    X("-fx-color: blue;"),
    O("-fx-color: red"),
    TIE("-fx-color: purple;");

    private final String style;

    Winner(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}  

