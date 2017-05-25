/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormonadventure;

import mormonadventure.classpackage.model.MainMenu;
import mormonadventure.classpackage.model.Player;

/**
 *
 * @author Diego
 */
public class MormonAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setNameEnter("Diego Freire");
        playerOne.setChooseYourFaction("Nephite");
        playerOne.setWelcomeMessage("Diego the nepthie begins his journey!");
        
        
        
    
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
               
        MainMenu mainmenuone = new mainmenu();
        
        
        
// TODO code application logic here
   
    
    
    }
    
}
