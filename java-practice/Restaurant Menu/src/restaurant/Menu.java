package restaurant;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    MenuItem dish1 = new MenuItem("Grilled Steak", 15.99, "grilled steak", "main", true);

    //fields
        private String menuItems;
        private String lastUpdated;

    // constructors
    public Menu(String aMenuItems, String aLastUpdated) {
        this.menuItems = aMenuItems;
        this.lastUpdated = aLastUpdated;
    }

    //getters

    public String getMenuItems() {
        return menuItems;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }


    //setters


    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //instance method to return the menu
    public String menuDetails() {
        return this.lastUpdated + "\n" + this.menuItems;

    }

}
