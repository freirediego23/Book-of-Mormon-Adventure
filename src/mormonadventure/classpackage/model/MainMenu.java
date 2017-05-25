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
public class MainMenu implements Serializable {
   
    
    private String GameStart;
    private String RestartGame;
    private String Options;
    private String Help;
    private String ExitGame;

    public MainMenu() {
    }

    
    
    
    
    public String getGameStart() {
        return GameStart;
    }

    public void setGameStart(String GameStart) {
        this.GameStart = GameStart;
    }

    public String getRestartGame() {
        return RestartGame;
    }

    public void setRestartGame(String RestartGame) {
        this.RestartGame = RestartGame;
    }

    public String getOptions() {
        return Options;
    }

    public void setOptions(String Options) {
        this.Options = Options;
    }

    public String getHelp() {
        return Help;
    }

    public void setHelp(String Help) {
        this.Help = Help;
    }

    public String getExitGame() {
        return ExitGame;
    }

    public void setExitGame(String ExitGame) {
        this.ExitGame = ExitGame;
    }

    @Override
    public int hashCode()  {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.GameStart);
        hash = 97 * hash + Objects.hashCode(this.RestartGame);
        hash = 97 * hash + Objects.hashCode(this.Options);
        hash = 97 * hash + Objects.hashCode(this.Help);
        hash = 97 * hash + Objects.hashCode(this.ExitGame);
        return hash;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "GameStart=" + GameStart + ", RestartGame=" + RestartGame + ", Options=" + Options + ", Help=" + Help + ", ExitGame=" + ExitGame + '}';
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
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.GameStart, other.GameStart)) {
            return false;
        }
        if (!Objects.equals(this.RestartGame, other.RestartGame)) {
            return false;
        }
        if (!Objects.equals(this.Options, other.Options)) {
            return false;
        }
        if (!Objects.equals(this.Help, other.Help)) {
            return false;
        }
        if (!Objects.equals(this.ExitGame, other.ExitGame)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
