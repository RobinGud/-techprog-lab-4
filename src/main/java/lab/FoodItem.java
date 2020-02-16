package lab;

import java.util.Date;

/**
 * FoodItem
 */
public class FoodItem extends GenericItem {

    Date DateOfIncome;
    short expires;

    FoodItem(int ID, String name, float price, int AnalogID, Category category, Date DateOfIncome, short expires) {
        super(ID, name, price, AnalogID, category);
        this.DateOfIncome = DateOfIncome;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Name: %-20s, price: %5.2f, analog ID: %d, Category: %s, date of income: %s, expires: %d \n",
                ID, name, price, AnalogID, category, DateOfIncome, expires);
    }

    @Override
    protected Object clone() {
        FoodItem item = new FoodItem(this.ID, this.name, this.price, this.AnalogID, this.category, this.DateOfIncome,
                this.expires);
        return item;
    }
}