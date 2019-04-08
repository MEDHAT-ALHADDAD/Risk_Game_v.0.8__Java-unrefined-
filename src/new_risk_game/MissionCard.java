package new_risk_game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


public final class MissionCard {
    
    private Player player;
    private boolean mission1,mission2,mission3,mission4,mission5,mission6,mission7,mission8,mission9,mission10,mission11,mission12;
    private boolean done;
    private static int i;
    private static ArrayList a=new ArrayList();
    
    public MissionCard(Player p){
        done =false;
        int r=i;
        a.add(r);
        i=randomMission();
        int j=0;
        while(j<a.size()){
            while(i==(int)a.get(j))
                i=randomMission();
            j++;
        }
        player=p;
        switch(i){
            case 1:
                mission1=true;
                break;
            case 2:
                mission2=true;
                break;
            case 3:
                mission3=true;
                break;
            case 4:
                mission4=true;
                break;
            case 5:
                mission5=true;
                break;
            case 6:
                mission6=true;
                break;
            case 7:
                mission7=true;
                break;
            case 8:
                mission8=true;
                break;
            case 9:
                mission9=true;
                break;
            case 10:
                mission10=true;
                break;
            case 11:
                mission11=true;
                break;
            case 12:
                mission12=true;
                break;
            /*case 13:
                mission13=true;
                break;
            case 14:
                mission14=true;
                break; */   
        }
        setPlayer(p);
        p.setMission(this);
        
    }        
    
    public boolean isDone(ArrayList p){
        
        boolean Aisa=false,Africa=false,Australia=false,Europ=false,NourthAmerica=false,SouthAmerica=false;
        boolean x1=false,x2=false,x3=false,x4=false,x5=false,x6=false,x7=false,x8=false,x9=false,x10=false,x11=false,x12=false;
        boolean a1=false,a2=false,a3=false,a4=false,a5=false,a6=false;    
        boolean y1=false,y2=false,y3=false,y4=false;
        boolean e1=false,e2=false,e3=false,e4=false,e5=false,e6=false,e7=false;
        boolean s1=false,s2=false,s3=false,s4=false;
        boolean n1=false,n2=false,n3=false,n4=false,n5=false,n6=false,n7=false,n8=false,n9=false;
        for(int i=0;i<player.getCountries().size();i++){
                Country c=(Country)player.getCountries().get(i);
                if(c.getName()=="Middle East")
                    x1=true;
                else if(c.getName()=="China")
                    x2=true;
                else if(c.getName()=="India")
                    x3=true;
                else if(c.getName()=="Siam")
                    x4=true;
                else if(c.getName()=="Afghanistan")
                    x5=true;
                else if(c.getName()=="Ural")
                    x6=true;
                else if(c.getName()=="Siberia")
                    x7=true;
                else if(c.getName()=="Yakursk")
                    x8=true;
                else if(c.getName()=="Irkutsk")
                    x9=true;
                else if(c.getName()=="Mongolia")
                    x10=true;
                else if(c.getName()=="Japan")
                    x11=true;
                else if(c.getName()=="Kamchatka")
                    x12=true;
                if (x1==true&&x2==true&&x3==true&&x4==true&&x5==true&&x6==true&&x7==true&&x8==true&&x9==true&&x12==true&&x11==true&&x12==true)
                    Aisa=true;
                else
                    Aisa=false;

                if(c.getName()=="Egypt")
                    a1=true;
                else if(c.getName()=="North Africa")
                    a2=true;
                else if(c.getName()=="Congo")
                    a3=true;
                else if(c.getName()=="East Africa")
                    a4=true;
                else if(c.getName()=="South Africa")
                    a5=true;
                else if(c.getName()=="Madagascar")
                    a6=true;
                if(a1==true&&a2==true&&a3==true&&a4==true&&a5==true&&a6==true)
                    Africa=true;
                else
                    Africa=false;

                if(c.getName()=="New Guinea")
                    y1=true;
                else if(c.getName()=="Indonesia")
                    y2=true;
                else if(c.getName()=="Eastern Australia")
                    y3=true;
                else if(c.getName()=="Western Australia")
                    y4=true;
                if(y1==true&&y2==true&&y3==true&&y4==true)
                    Australia=true;
                
                if(c.getName()=="Ukraine")
                    e1=true;
                else if(c.getName()=="Seandinavia")
                    e2=true;
                else if(c.getName()=="Iceland")
                    e3=true;
                else if(c.getName()=="Great Britain")
                    e4=true;
                else if(c.getName()=="Northern Europe")
                    e5=true;
                else if(c.getName()=="Southern Europe")
                    e6=true;
                else if(c.getName()=="Western Europe")
                    e7=true;
                if(e1==true&&e2==true&&e3==true&&e4==true&&e5==true&&e6==true&&e7==true)
                    Europ=true;
                
                if(c.getName()=="Venezuela")
                    s1=true;
                else if(c.getName()=="Brazil")
                    s2=true;
                else if(c.getName()=="Peru")
                    s3=true;
                else if(c.getName()=="Argentina")
                    s4=true;
                if(s1==true&&s2==true&&s3==true&&s4==true)
                    SouthAmerica=true;
                
                if(c.getName()=="Alaska")
                    n1=true;
                else if(c.getName()=="Northwest Territory")
                    n2=true;
                else if(c.getName()=="Greenland")
                    n3=true;
                else if(c.getName()=="Alberta")
                    n4=true;
                else if(c.getName()=="Qntario")
                    n5=true;
                else if(c.getName()=="Quebec")
                    n6=true;
                else if(c.getName()=="Western United States")
                    n7=true;
                else if(c.getName()=="Eastern United States")
                    n8=true;
                else if(c.getName()=="Central America")
                    n9=true;
                if(n1==true&&n2==true&&n3==true&&n4==true&&n5==true&&n6==true&&n7==true&&n8==true&&n9==true)
                    NourthAmerica=true;
                
            }
            
            
        if(mission1==true){ //mission 1,2,3,4,5,6 are to distroy a certin color
            for (Object p1 : p) {
                Player p2=(Player)p1;
                if (p2.getColor() == Color.red&&p2!=this.player) {
                    if (p2.getRemainingSolders() == 0) {
                        done=true;
                    }
                }
            }
        }
        else if(mission2==true){
            
            for (Object p1 : p) {
                Player p2=(Player)p1;
                if (p2.getColor() == Color.black&&p2!=this.player) {
                    if (p2.getRemainingSolders() == 0) {
                        done=true;
                    }
                }
            }
        }
        else if(mission3==true){
            
            for (Object p1 : p) {
                Player p2=(Player)p1;
                if (p2.getColor() == Color.green&&p2!=this.player) {
                    if (p2.getRemainingSolders() == 0) {
                        done=true;
                    }
                }
            }
        }
        else if(mission4==true){
            
            for (Object p1 : p) {
                Player p2=(Player)p1;
                if (p2.getColor() == Color.blue&&p2!=this.player) {
                    if (p2.getRemainingSolders() == 0) {
                        done=true;
                    }
                }
            }
        }
        else if(mission5==true){
            
            for (Object p1 : p) {
                Player p2=(Player)p1;
                if (p2.getColor() == Color.yellow&&p2!=this.player) {
                    if (p2.getRemainingSolders() == 0) {
                        done=true;
                    }
                }
            }
        }
        else if(mission6==true){
            
            for (Object p1 : p) {
                Player p2=(Player)p1;
                if (p2.getColor() == Color.gray&&p2!=this.player) {
                    if (p2.getRemainingSolders() == 0) {
                        done=true;
                    }
                }
            }
        }
        else if(mission7==true){//occupy 24 countries
            if(this.player.getCountries().size()==24);
                done=true;
        }
        else if(mission8==true){//conquer asia & africa
            if(Aisa==true&&Africa==true)
                done=true;
        }
        else if(mission9==true){//conquer asia & south america
            if(Aisa==true&&SouthAmerica==true)
                done=true;
        }
        else if(mission10==true){//conquer north aerica & africa
            if(NourthAmerica==true&&Africa==true)
                done=true;
        }
        else if(mission11==true){//conquer north america & australia
            if(NourthAmerica==true&&Australia==true)
                done=true;
        }
        else if(mission12==true){//conquer asia & europ
            if(Aisa==true&&Europ==true)
                done=true;
        }
        
        return done;
    }
    
    public void setPlayer(Player p){
        this.player=p;
    }
    
    public Player getPlayer(){
        return this.player;
    }
    
    public int randomMission(){
        Random r=new Random();
        int i=r.nextInt();
            i=r.nextInt(12);
        return i;
    }
    
}
