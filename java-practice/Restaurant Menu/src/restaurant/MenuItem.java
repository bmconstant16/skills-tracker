package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean recentAdd;

    //constructors
//    public MenuItem() {};

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory, boolean aRecentAdd) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.recentAdd = aRecentAdd;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isRecentAdd() {
        return recentAdd;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRecentAdd(boolean recentAdd) {
        this.recentAdd = recentAdd;
    }

    //instance method to return all the info from the object
    public String MenuItemDetails() {
        return this.name + "\n" + this.price + "\n" +  this.category + "\n" +  this.description + "\n" +  this.recentAdd;
    }
}
