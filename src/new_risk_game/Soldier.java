package new_risk_game;

import javax.swing.*;

 enum type
 {
    Soldier(1), Cavalry(5), Artillary(10);
    private int Val;

    private type(int Val) {
        this.Val = Val;
    }

    public void setVal(int Val) {
        this.Val = Val;
    }

    public int getVal() {
        return Val;
    }
    
 }


public class Soldier 
{
    private ImageIcon icon ;
    private String whichCountry ;
    private Boolean isSelected ;
    private Boolean isAttacking ;
    private Boolean isDefending ;
    private type Type ;
    //public enum TurnPhase{Deploy, Attack, Reinforce}  

    public void setIsAttacking(Boolean isAttacking) {
        this.isAttacking = isAttacking;
    }

    public void setIsDefending(Boolean isDefending) {
        this.isDefending = isDefending;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public void setWhichCountry(String whichCountry) {
        this.whichCountry = whichCountry;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public Boolean getIsAttacking() {
        return isAttacking;
    }

    public Boolean getIsDefending() {
        return isDefending;
    }

    public String getWhichCountry() {
        return whichCountry;
    }

    public void setType(type Type) {
        this.Type = Type;
    }

    public type getType() {
        return Type;
    }

    public void setSoldier(Boolean isSelected, Boolean isAttacking, Boolean isDefending, type Type) {
        this.isSelected = isSelected;
        this.isAttacking = isAttacking;
        this.isDefending = isDefending;
        this.Type = Type;
    }
    
    public void setIcon()
    {
        switch(Type)
        {
            case Soldier:
                icon = new ImageIcon("Soldier.png");
                break;
            case Cavalry:
                icon = new ImageIcon("Cavalry.png");
                break;
            case Artillary:
                icon = new ImageIcon("Artillary.png");
                break;
        }
    }
}