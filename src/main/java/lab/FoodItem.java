package lab;

import java.util.Date;

/**
 * FoodItem
 */
public class FoodItem extends GenericItem {

    Date DateOfIncome;
    short expires;

    FoodItem(int ID, String name, float price, GenericItem analogObj, Category category, Date DateOfIncome,
            short expires) {
        super(ID, name, price, analogObj, category);
        this.DateOfIncome = DateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, GenericItem analogObj, Date DateOfIncome, short expires) {
        super(name, price, analogObj);
        this.DateOfIncome = DateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, Category category, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, 0f, null, null, (short) 32);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %-20s, price: %5.2f, Category: %s, date of income: %s, expires: %d \n", ID,
                name, price, category, DateOfIncome, expires);
    }

    @Override
    protected Object clone() {
        FoodItem item = new FoodItem(this.ID, this.name, this.price, this.analogObj, this.category, this.DateOfIncome,
                this.expires);
        return item;
    }
}