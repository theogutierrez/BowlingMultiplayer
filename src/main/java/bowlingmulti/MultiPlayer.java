/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingmulti;

/**
 *
 * @author pedago
 */
public class MultiPlayer implements MultiPlayerGame {
    
    private String[] playerName;
    

    public MultiPlayer() {
        
    }
   
    /**
     * Démarre une nouvelle partie pour un groupe de joueurs
     * @param playerName un tableau des noms de joueurs (il faut au moins un joueur)
     * @return une chaîne de caractères indiquant le prochain joueur,
     * de la forme "Prochain tir : joueur Bastide, tour n° 1, boule n° 1"
     * @throws java.lang.Exception si le tableau est vide ou null
     */
    public String startNewGame(String[] playerName) throws Exception {
        if (playerName.length == 0) {
            throw new java.lang.Exception("Tableau est vide ou null");
        }
        this.playerName = playerName;
        return "Prochain tir: joueur " + playerName[0] + "tour n°1, boule n°1";
    }
       
    /**
     * Enregistre le nombre de quilles abattues pour le joueur courant, dans le frame courant, pour la boule courante
     * @param nombreDeQuillesAbattues : nombre de quilles abattue à ce lancer
     * @return une chaîne de caractères indiquant le prochain joueur,
     * de la forme "Prochain tir : joueur Bastide, tour n° 5, boule n° 2",
     * ou bien "Partie terminée" si la partie est terminée.
     * @throws java.lang.Exception si la partie n'est pas démarrée, ou si elle est terminée.
     */
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        
        return "bouchon";
    }    
    
    public int scoreFor(String playerName) throws Exception {
        return 0;
    }
    
}
