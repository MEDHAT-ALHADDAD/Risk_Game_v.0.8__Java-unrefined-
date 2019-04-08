package new_risk_game;

import java.awt.Color;
import java.util.ArrayList;

public class Tile {
    
  protected String name;
  protected String content;//
  protected int no_of_soldiers;
  protected Player owner=null;
  protected ArrayList<String> neighbors=new ArrayList<>();//

  public final void init() {
      this.neighbors = new ArrayList<>();
      if (null != this.name) switch (this.name) {
          case "ALASKA":
              this.content = "NORTHAMERICA";
              this.neighbors.add("NWTERRITORY");
              this.neighbors.add("ALBERTA");
              this.neighbors.add("KAMCHATKA");
              break;
          case "ALBERTA":
              this.content = "NORTHAMERICA";
              this.neighbors.add("ALASKA");
              this.neighbors.add("NWTERRITORY");
              this.neighbors.add("ONTARIO");
              this.neighbors.add("WESTERNUS");
              break;
          case "CENTRALAMERICA":
              this.content = "NORTHAMERICA";
              this.neighbors.add("WESTERNUS");
              this.neighbors.add("EASTERNUS");
              this.neighbors.add("VENEZUELA");
              break;
          case "EASTERNUS":
              this.content = "NORTHAMERICA";
              this.neighbors.add("WESTERNUS");
              this.neighbors.add("CENTRALAMERICA");
              this.neighbors.add("ONTARIO");
              this.neighbors.add("QUEBEC");
              break;
          case "GREENLAND":
              this.content = "NORTHAMERICA";
              this.neighbors.add("NWTERRITORY");
              this.neighbors.add("ICELAND");
              this.neighbors.add("ONTARIO");
              this.neighbors.add("QUEBEC");
              break;
          case "NWTERRITORY":
              this.content = "NORTHAMERICA";
              this.neighbors.add("ALASKA");
              this.neighbors.add("ONTARIO");
              this.neighbors.add("ALBERTA");
              this.neighbors.add("GREENLAND");
              break;
          case "ONTARIO":
              this.content = "NORTHAMERICA";
              this.neighbors.add("QUEBEC");
              this.neighbors.add("NWTERRITORY");
              this.neighbors.add("GREENLAND");
              this.neighbors.add("ALBERTA");
              this.neighbors.add("EASTERNUS");
              this.neighbors.add("WESTERNUS");
              break;
          case "QUEBEC":
              this.content = "NORTHAMERICA";
              this.neighbors.add("ONTARIO");
              this.neighbors.add("EASTERNUS");
              this.neighbors.add("GREENLAND");
              break;
          case "WESTERNUS":
              this.content = "NORTHAMERICA";
              this.neighbors.add("EASTERNUS");
              this.neighbors.add("CENTRALAMERICA");
              this.neighbors.add("ALBERTA");
              this.neighbors.add("ONTARIO");
              break;
          case "ICELAND":
              this.content = "EUROPE";
              this.neighbors.add("GREENLAND");
              this.neighbors.add("GREATBRITAIN");
              this.neighbors.add("SCANDINAVIA");
              break;
          case "GREATBRITAIN":
              this.content = "EUROPE";
              this.neighbors.add("ICELAND");
              this.neighbors.add("SCANDINAVIA");
              this.neighbors.add("WESTERNEUROPE");
              this.neighbors.add("NORTHERNEUROPE");
              break;
          case "SCANDINAVIA":
              this.content = "EUROPE";
              this.neighbors.add("ICELAND");
              this.neighbors.add("GREATBRITAIN");
              this.neighbors.add("NORTHERNEUROPE");
              this.neighbors.add("UKRAINE");
              break;
          case "NORTHERNEUROPE":
              this.content = "EUROPE";
              this.neighbors.add("GREATBRITAIN");
              this.neighbors.add("SCANDINAVIA");
              this.neighbors.add("UKRAINE");
              this.neighbors.add("SOUTHERNEUROPE");
              this.neighbors.add("WESTERNEUROPE");
              break;
          case "WESTERNEUROPE":
              this.content = "EUROPE";
              this.neighbors.add("GREATBRITAIN");
              this.neighbors.add("SOUTHERNEUROPE");
              this.neighbors.add("NORTHERNEUROPE");
              this.neighbors.add("NORTHAFRICA");
              break;
          case "SOUTHERNEUROPE":
              this.content = "EUROPE";
              this.neighbors.add("WESTERNEUROPE");
              this.neighbors.add("UKRAINE");
              this.neighbors.add("NORTHERNEUROPE");
              this.neighbors.add("EGYPT");
              this.neighbors.add("NORTHAFRICA");
              this.neighbors.add("MIDDLEEAST");
              break;
          case "UKRAINE":
              this.content = "EUROPE";
              this.neighbors.add("SCANDINAVIA");
              this.neighbors.add("NORTHERNEUROPE");
              this.neighbors.add("SOUTHERNEUROPE");
              this.neighbors.add("MIDDLEEAST");
              this.neighbors.add("URAL");
              this.neighbors.add("AFGHANISTAN");
              break;
          case "VENEZUELA":
              this.content = "SOUTHAMERICA";
              this.neighbors.add("PERU");
              this.neighbors.add("CENTRALAMERICA");
              this.neighbors.add("BRAZIL");
              break;
          case "BRAZIL":
              this.content = "SOUTHAMERICA";
              this.neighbors.add("PERU");
              this.neighbors.add("VENEZUELA");
              this.neighbors.add("ARGENTINA");
              this.neighbors.add("NORTHAFRICA");
              break;
          case "ARGENTINA":
              this.content = "SOUTHAMERICA";
              this.neighbors.add("BRAZIL");
              this.neighbors.add("PERU");
              break;
          case "PERU":
              this.content = "SOUTHAMERICA";
              this.neighbors.add("VENEZUELA");
              this.neighbors.add("BRAZIL");
              this.neighbors.add("ARGENTINA");
              break;
          case "NORTHAFRICA":
              this.content = "AFRICA";
              this.neighbors.add("BRAZIL");
              this.neighbors.add("EGYPT");
              this.neighbors.add("WESTERNEUROPE");
              this.neighbors.add("SOUTHERNEUROPE");
              this.neighbors.add("EASTAFRICA");
              this.neighbors.add("CONGO");
              break;
          case "EGYPT":
              this.content = "AFRICA";
              this.neighbors.add("NORTHAFRICA");
              this.neighbors.add("EASTAFRICA");
              this.neighbors.add("MIDDLEEAST");
              this.neighbors.add("SOUTHERNEUROPE");
              break;
          case "EASTAFRICA":
              this.content = "AFRICA";
              this.neighbors.add("EGYPT");
              this.neighbors.add("CONGO");
              this.neighbors.add("MADAGASCAR");
              this.neighbors.add("MIDDLEEAST");
              this.neighbors.add("SOUTHAFRICA");
              this.neighbors.add("NORTHAFRICA");
              break;
          case "CONGO":
              this.content = "AFRICA";
              this.neighbors.add("NORTHAFRICA");
              this.neighbors.add("EASTAFRICA");
              this.neighbors.add("SOUTHAFRICA");
              break;
          case "SOUTHAFRICA":
              this.content = "AFRICA";
              this.neighbors.add("MADAGASCAR");
              this.neighbors.add("CONGO");
              this.neighbors.add("EASTAFRICA");
              break;
          case "MADAGASCAR":
              this.content = "AFRICA";
              this.neighbors.add("SOUTHAFRICA");
              this.neighbors.add("EASTAFRICA");
              break;
          case "INDONESIA":
              this.content = "AUSTRALIA";
              this.neighbors.add("SIAM");
              this.neighbors.add("WESTERNAUSTRALIA");
              this.neighbors.add("NEWGUINEA");
              break;
          case "NEWGUINEA":
              this.content = "AUSTRALIA";
              this.neighbors.add("INDONESIA");
              this.neighbors.add("EASTERNAUSTRALIA");
              break;
          case "WESTERNAUSTRALIA":
              this.content = "AUSTRALIA";
              this.neighbors.add("INDONESIA");
              this.neighbors.add("EASTERNAUSTRALIA");
              break;
          case "EASTERNAUSTRALIA":
              this.content = "AUSTRALIA";
              this.neighbors.add("WESTERNAUSTRALIA");
              this.neighbors.add("NEWGUINEA");
              break;
          case "URAL":
              this.content = "ASIA";
              this.neighbors.add("UKRAINE");
              this.neighbors.add("CHINA");
              this.neighbors.add("AFGHANISTAN");
              this.neighbors.add("SIBERIA");
              break;
          case "AFGHANISTAN":
              this.content = "ASIA";
              this.neighbors.add("INDIA");
              this.neighbors.add("MIDDLEEAST");
              this.neighbors.add("CHINA");
              this.neighbors.add("URAL");
              this.neighbors.add("UKRAINE");
              break;
          case "MIDDLEEAST":
              this.content = "ASIA";
              this.neighbors.add("UKRAINE");
              this.neighbors.add("AFGHANISTAN");
              this.neighbors.add("EGYPT");
              this.neighbors.add("EASTAFRICA");
              this.neighbors.add("INDIA");
              this.neighbors.add("SOUTHERNEUROPE");
              break;
          case "INDIA":
              this.content = "ASIA";
              this.neighbors.add("AFGHANISTAN");
              this.neighbors.add("MIDDLEEAST");
              this.neighbors.add("SIAM");
              this.neighbors.add("CHINA");
              break;
          case "SIAM":
              this.content = "ASIA";
              this.neighbors.add("CHINA");
              this.neighbors.add("INDIA");
              this.neighbors.add("INDONESIA");
              break;
          case "CHINA":
              this.content = "ASIA";
              this.neighbors.add("SIAM");
              this.neighbors.add("INDIA");
              this.neighbors.add("AFGHANISTAN");
              this.neighbors.add("URAL");
              this.neighbors.add("SIBERIA");
              this.neighbors.add("MONGOLIA");
              break;
          case "SIBERIA":
              this.content = "ASIA";
              this.neighbors.add("URAL");
              this.neighbors.add("CHINA");
              this.neighbors.add("YAKUTSK");
              this.neighbors.add("IRKUTSK");
              this.neighbors.add("MONGOLIA");
              break;
          case "YAKUTSK":
              this.content = "ASIA";
              this.neighbors.add("SIBERIA");
              this.neighbors.add("IRKUTSK");
              this.neighbors.add("KAMCHATKA");
              break;
          case "IRKUTSK":
              this.content = "ASIA";
              this.neighbors.add("YAKUTSK");
              this.neighbors.add("KAMCHATKA");
              this.neighbors.add("SIBERIA");
              this.neighbors.add("MONGOLIA");
              break;
          case "MONGOLIA":
              this.content = "ASIA";
              this.neighbors.add("CHINA");
              this.neighbors.add("JAPAN");
              this.neighbors.add("IRKUTSK");
              this.neighbors.add("KAMCHATKA");
              this.neighbors.add("SIBERIA");
              break;
          case "JAPAN":
              this.content = "ASIA";
              this.neighbors.add("MONGOLIA");
              this.neighbors.add("KAMCHATKA");
              break;
          case "KAMCHATKA":
              this.content = "ASIA";
              this.neighbors.add("MONGOLIA");
              this.neighbors.add("YAKUTSK");
              this.neighbors.add("IRKUTSK");
              this.neighbors.add("JAPAN");
              this.neighbors.add("ALASKA");
              break;
          default:
              break;
      }
	}
  
    public void setName(String name) {
        this.name = name;
        this.no_of_soldiers=1;
        init();
    }
}