package lab5;

class ShoppingCart 
{
    Item[] items;
    double tp;
    public ShoppingCart() 
    {
        items = new Item[5];
        tp = 0.0;
    }
    class Item 
    {
        String itemName;
        int quantity;
        double price;
        public Item(String i, int q, double p) 
        {
            this.itemName = i;
            this.quantity = q;
            this.price = p;
        }
        public void display() 
        {
            System.out.println("Item: " + itemName + "\tQuantity: " + quantity + "\tPrice: " + price);
        }
    }
    public void addItem(String n, int q, double p) 
    {
        for (int i = 0; i < items.length; i++) 
        {
            if (items[i] == null) 
            {
                items[i] = new Item(n, q, p);
                tp += q * p;
                break;
            }
        }
    }
    public void display() 
    {
        for (Item item : items) 
        {
            if (item != null)
                item.display();
        }
        System.out.println("\nTotal Price: " + tp);
    }
}

public class ANS_C 
{
    public static void main(String[] args) 
    {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 12, 30.0);
        cart.addItem("Banana", 1, 15.0);
        cart.addItem("Orange", 6, 20.0);
        cart.display();
    }
}