import menu.*;
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
    }
}
