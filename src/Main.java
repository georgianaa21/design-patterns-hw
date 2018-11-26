import menu.*;
import order.Order;
import pizza.*;

public class Main {

    public static void main(String[] args) {

        Menu menu = new MenuBuilder()
                .with(
                        menuBuilder -> {
                            menuBuilder.pizzaType = "margherita";
                            menuBuilder.sauce = "Ketchup";
                            menuBuilder.drink = "Cola";
                            menuBuilder.desert = "Choco cup";
                            menuBuilder.price = 30.5;
                        }
                ).buildMenu();
        System.out.println(menu.toString());


        Order<Menu> order1 = new Order<>(1);
        Menu menu1 = order1.create("menu", 30.5, "margherita", "Ketchup", "Cola", "Choco cup");
        System.out.println(menu1.toString());
        Order<Pizza> order2 = new Order<>(2);
        Pizza pizza1 = order2.create("pizza", 0, "margherita");


    }
}
