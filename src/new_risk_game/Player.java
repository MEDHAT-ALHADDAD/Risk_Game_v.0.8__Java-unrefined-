package new_risk_game;

import java.awt.*;
import java.util.ArrayList;
import new_risk_game.MissionCard;

public class Player {
    private String name;
    private final Color color;
   // private int no_of_solders;
    private ArrayList<Country> countries=new ArrayList();
    private MissionCard card;
    private int noOfSoldersAvailableForDep;
    
    public Player(String s,Color col){
        this.name=s;
        this.color=col;
    }

    public void setName(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
    public Color getColor(){
        return color;
    }    
    
    public void setMission(MissionCard m){
        card=m;
    }
    public MissionCard getMission(){
        return card;
    }
    
    public ArrayList getCountries(){
        return countries;
    }
    public Country getCountry(int i){
        return countries.get(i);
    }
    public void addCountry(Country c){
        this.countries.add(c);
    }
    public void removeCountry(Country c){
        this.countries.remove(c);
    }
    
    public void addSolders_in_country(int country,int solders){
        (countries.get(country)).SoldiersIncrease(solders);
    }
    public void removeSolders_in_country(int country,int solders){
        (countries.get(country)).Soldiersdecrease(solders);
    }
    public void addSoldier(int i){
        noOfSoldersAvailableForDep+=i;
    }
    public void subSoldier(int i){
        noOfSoldersAvailableForDep-=i;
    }
    
    public int getRemainingSolders(){
        return noOfSoldersAvailableForDep;
    }
    
    public int getDeploySolders(){
       int x=this.countries.size()/3;
       x+=addcontent_solders();
        noOfSoldersAvailableForDep=x;
        return noOfSoldersAvailableForDep;
    }
    
    public int addcontent_solders(){
        int x=0;
         boolean Aisa=false,Africa=false,Australia=false;
         boolean Europe=false,NourthAmerica=false,SouthAmerica=false;
        boolean x1=false,x2=false,x3=false,x4=false,x5=false,x6=false;
        boolean x7=false,x8=false,x9=false,x10=false,x11=false,x12=false;
        boolean a1=false,a2=false,a3=false,a4=false,a5=false,a6=false;    
        boolean y1=false,y2=false,y3=false,y4=false;
        boolean e1=false,e2=false,e3=false,e4=false,e5=false,e6=false,e7=false;
        boolean s1=false,s2=false,s3=false,s4=false;
        boolean n1=false,n2=false,n3=false,n4=false,n5=false,n6=false,n7=false,n8=false,n9=false;
        for(int i=0;i<this.countries.size();i++){
                Country c=(Country)this.countries.get(i);
                if(null!=c.getName())
                    switch (c.getName()) {
                 case "MIDDLEEAST":
                     x1=true;
                     break;
                 case "CHINA":
                     x2=true;
                     break;
                 case "INDIA":
                     x3=true;
                     break;
                 case "SIAM":
                     x4=true;
                     break;
                 case "AFGHANISTAN":
                     x5=true;
                     break;
                 case "URAL":
                     x6=true;
                     break;
                 case "SIBERIA":
                     x7=true;
                     break;
                 case "YAKUTSK":
                     x8=true;
                     break;
                 case "IRKUTSK":
                     x9=true;
                     break;
                 case "MONGOLIA":
                     x10=true;
                     break;
                 case "JAPAN":
                     x11=true;
                     break;
                 case "KAMCHATKA":
                     x12=true;
                     break;
                 default:
                     break;
             }
                Aisa = x1==true&&x2==true&&x3==true&&x4==true&&x5==true
                        &&x6==true&&x7==true&&x8==true&&x9==true&&x12==true&&x11==true&&x12==true;

                if(null!=c.getName())
                    switch (c.getName()) {
                 case "EGYPT":
                     a1=true;
                     break;
                 case "NORTHAFRICA":
                     a2=true;
                     break;
                 case "CONGO":
                     a3=true;
                     break;
                 case "EASTAFRICA":
                     a4=true;
                     break;
                 case "SOUTHAFRICA":
                     a5=true;
                     break;
                 case "MADAGASCAR":
                     a6=true;
                     break;
                 default:
                     break;
             }
                Africa = a1==true&&a2==true&&a3==true&&a4==true&&a5==true&&a6==true;

                if(null!=c.getName())
                    switch (c.getName()) {
                 case "NEWGUINEA":
                     y1=true;
                     break;
                 case "INDONESIA":
                     y2=true;
                     break;
                 case "EASTERNAUSTRALIA":
                     y3=true;
                     break;
                 case "WESTERNAUSTRALIA":
                     y4=true;
                     break;
                 default:
                     break;
             }
                if(y1==true&&y2==true&&y3==true&&y4==true)
                    Australia=true;
                
                if(null!=c.getName())
                    switch (c.getName()) {
                 case "UKRAINE":
                     e1=true;
                     break;
                 case "SCANDINAVIA":
                     e2=true;
                     break;
                 case "ICELAND":
                     e3=true;
                     break;
                 case "GREATBRITAIN":
                     e4=true;
                     break;
                 case "NORTHERNEUROPE":
                     e5=true;
                     break;
                 case "SOUTHERNEUROPE":
                     e6=true;
                     break;
                 case "WESTERNEUROPE":
                     e7=true;
                     break;
                 default:
                     break;
             }
                if(e1==true&&e2==true&&e3==true&&e4==true&&e5==true&&e6==true&&e7==true)
                    Europe=true;
                
                if(null!=c.getName())
                    switch (c.getName()) {
                 case "VENEZUELA":
                     s1=true;
                     break;
                 case "BRAZIL":
                     s2=true;
                     break;
                 case "PERU":
                     s3=true;
                     break;
                 case "ARGENTINA":
                     s4=true;
                     break;
                 default:
                     break;
             }
                if(s1==true&&s2==true&&s3==true&&s4==true)
                    SouthAmerica=true;
                
                if(null!=c.getName())
                    switch (c.getName()) {
                 case "ALASKA":
                     n1=true;
                     break;
                 case "NWTERRITORY":
                     n2=true;
                     break;
                 case "GREENLAND":
                     n3=true;
                     break;
                 case "ALBERTA":
                     n4=true;
                     break;
                 case "ONTARIO":
                     n5=true;
                     break;
                 case "QUEBEC":
                     n6=true;
                     break;
                 case "WESTERNUS":
                     n7=true;
                     break;
                 case "EASTERNUS":
                     n8=true;
                     break;
                 case "CENTRALAMERICA":
                     n9=true;
                     break;
                 default:
                     break;
             }
                if(n1==true&&n2==true&&n3==true&&n4==true&&n5==true&&n6==true&&n7==true&&n8==true&&n9==true)
                    NourthAmerica=true;
        }
        if(Aisa==true){x+=7;}
        if(NourthAmerica==true){x+=5;}
        if(SouthAmerica==true){x+=3;}
        if(Africa==true){x+=3;}
        if(Europe==true){x+=5;}
        if(Australia==true){x+=2;}   
        return x;
    }
}
    