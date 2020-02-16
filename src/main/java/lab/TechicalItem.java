package lab;

/**
 * TechicalItem
 */
public class TechicalItem extends GenericItem {

    short warrantyTime;

    TechicalItem(int ID, String name, float price, GenericItem analogObj, Category category, short warrantyTime) {
        super(ID, name, price, analogObj, category);
        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %-20s, price: %5.2f, Category: %s, warranty time: %d \n", ID, name, price,
                category, warrantyTime);
    }

    @Override
    protected Object clone() {
        TechicalItem item = new TechicalItem(this.ID, this.name, this.price, this.analogObj, this.category,
                this.warrantyTime);
        return item;
    }
}