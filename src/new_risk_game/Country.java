/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_risk_game;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Medhat
 */
public class Country extends Tile{
   protected JButton btn;
   protected JLabel namelbl;
   protected JLabel numberlbl;
   protected boolean isSelected;
   //private static int count;

    public Country(Tile t,JButton btn, JLabel namelbl, JLabel numberlbl   )
    {
        super.name=t.name;
        super.content=t.content;
        super.no_of_soldiers=t.no_of_soldiers;
        super.owner=t.owner;
        super.neighbors=t.neighbors;
        this.btn = btn;
        this.namelbl = namelbl;
        this.numberlbl=numberlbl;
        this.numberlbl.setText(super.no_of_soldiers+"");
    }
    
   
     public void setContent(String content) {
        this.content = content;
    }

    public void setNo_of_soldiers(int no_of_soldiers) {
        this.no_of_soldiers = no_of_soldiers;
        this.numberlbl.setText(no_of_soldiers+"");
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public int getNo_of_soldiers() {
        return no_of_soldiers;
    }

    public Player getOwner() {
        return owner;
    }
  
  
  public boolean isSelected(){
      return this.isSelected;
  }
  
     public void unSelect(){
       isSelected=false;
   }
     
     public void Select(){
       isSelected=true;
   }

public void SoldiersIncrease(){
    no_of_soldiers++;
    this.numberlbl.setText(no_of_soldiers+"");
}


public void SoldiersIncrease(int i){
    no_of_soldiers+=i;
    this.numberlbl.setText(no_of_soldiers+"");
}

public void Soldiersdecrease(){
    no_of_soldiers--;
    this.numberlbl.setText(no_of_soldiers+"");
}

public void Soldiersdecrease(int i){
    no_of_soldiers-=i;
    this.numberlbl.setText(no_of_soldiers+"");
}

public boolean isAdjesent(Country str){
    for (int i=0;i<this.neighbors.size();i++){
        if(str.getName().equals(neighbors.get(i)))
            return true;
    }
      return false;
  }
   
   public void setColor(Color c){
       this.namelbl.setForeground(c);
       this.numberlbl.setForeground(c);
   }
}


 

