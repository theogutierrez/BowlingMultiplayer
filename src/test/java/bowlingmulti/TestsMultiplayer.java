/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingmulti;

import bowling.MultiPlayer;
/**
 *
 * @author pedago
 */
public class TestsMultiplayer {
    String[] players = { "John", "Paul", "Georges", "Ringo" };
    MultiPlayerGame game = new MultiPlayer();
    System.out.println(game.startNewGame(players));
}
