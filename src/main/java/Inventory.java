import java.util.ArrayList;

class Inventory {
  private ArrayList<Item> ListOfItems;

  public Inventory() {
    this.ListOfItems = new ArrayList<Item>();
  }

  public void addItems(Item item) {
    ListOfItems.add(item);
  }

  public void displayInventory() {
    System.out.println("********************");
    System.out.println("Weapons in inventory");
    System.out.println("********************");
    for (Item item : ListOfItems) {
      System.out.println(item.getQty() + " " + item.getName());
    }
    System.out.println("********************");
  }

}