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
    void printAll() {
        System.out.printf(
                "ID: %d, Name: %-20s, price: %5.2f, analog ID: %d, Category: %s, date of income: %s, expires: %d \n",
                ID, name, price, AnalogID, category, DateOfIncome, expires);
    }
}