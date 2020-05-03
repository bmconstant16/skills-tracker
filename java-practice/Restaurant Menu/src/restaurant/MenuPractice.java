package restaurant;

public class MenuPractice {

    public static void main(String[] args) {
        MenuItem dish1 = new MenuItem("Grilled Steak", 15.99, "grilled steak", "main", true);
        Menu menuList = new Menu("MenuItem", "1-5-2020");
        //System.out.println(dish1.getName());

        System.out.println(menuList.menuDetails());
        System.out.println(dish1.MenuItemDetails());

        dish1.setPrice(17.99);
        System.out.println(dish1.MenuItemDetails());


    }
}
