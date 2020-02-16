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

    public void printAll() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %-20s, price: %5.2f, analog ID: %d, Category: %s \n", ID, name, price,
                AnalogID, category);
    }

    @Override
    public boolean equals(Object O) {
        if (this == O)
            return true;
        if (O == null)
            return false;
        if (getClass() != O.getClass())
            return false;
        String str1 = this.toString();
        String str2 = O.toString();
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    protected Object clone() {
        GenericItem item = new GenericItem(this.ID, this.name, this.price, this.AnalogID, this.category);
        return item;
    }
}