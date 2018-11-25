package menu;

import pizza.Pizza;

public interface MenuBuilder {
    Menu build();

    MenuBuilder setPizza(final Pizza pizza);
    MenuBuilder setSauce(final String sauce);
    MenuBuilder setDrink(final String drink);
    MenuBuilder setDesert(final String desert);
}
