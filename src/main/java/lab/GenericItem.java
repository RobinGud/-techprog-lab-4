package lab;

/**
 * GenericItem
 */
public class GenericItem {

    public int ID;
    public String name;
    public float price;
    public int AnalogID;

    GenericItem(int ID, String name, float price, int AnalogID) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.AnalogID = AnalogID;
    }

    void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, AnalogID: %d \n", ID, name, price, AnalogID);
    }
}