package order;

//asta vreau sa fie interfata de strategy si sa creez in Order un obiect de tip Pizza sau Menu
//T apartine {Pizza, Menu}
//R apartine {MenuBuilder, PizzaFactory}
public interface Creator<T, R> {
    public T create(R object);
}
