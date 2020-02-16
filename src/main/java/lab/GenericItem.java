package lab;

/**
 * GenericItem
 */
public class GenericItem {

    public enum Category {
        FOOD, PRINT, DRESS, GENERAL
    }

    public int ID;
    public String name;
    public float price;
    public int AnalogID;
    public Category category = Category.GENERAL;

    GenericItem(int ID, String name, float price, int AnalogID, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.AnalogID = AnalogID;
        this.category = category;
    }

    void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, AnalogID: %d, Category: %s \n", ID, name, price, AnalogID,
                category);
    }
}