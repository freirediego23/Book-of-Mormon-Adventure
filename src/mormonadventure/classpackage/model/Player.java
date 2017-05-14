/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormonadventure.classpackage.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Player implements Serializable {
    
    private String NameEnter;
    private String ChooseYourFaction;
    private String WelcomeMessage;

    public Player() {
    
    
    }

    
    
    
    
    public String getNameEnter() {
        return NameEnter;
    }

    public void setNameEnter(String NameEnter) {
        this.NameEnter = NameEnter;
    }

    public String getChooseYourFaction() {
        return ChooseYourFaction;
    }

    public void setChooseYourFaction(String ChooseYourFaction) {
        this.ChooseYourFaction = ChooseYourFaction;
    }

    public String getWelcomeMessage() {
        return WelcomeMessage;
    }

    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    @Override
    public int hashCode()  {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.NameEnter);
        hash = 23 * hash + Objects.hashCode(this.ChooseYourFaction);
        hash = 23 * hash + Objects.hashCode(this.WelcomeMessage);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "NameEnter=" + NameEnter + ", ChooseYourFaction=" + ChooseYourFaction + ", WelcomeMessage=" + WelcomeMessage + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.NameEnter, other.NameEnter)) {
            return false;
        }
        if (!Objects.equals(this.ChooseYourFaction, other.ChooseYourFaction)) {
            return false;
        }
        return Objects.equals(this.WelcomeMessage, other.WelcomeMessage);
    }
    
    
    
    
}
