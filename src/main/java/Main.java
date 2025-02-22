public class Main {
  public static void main(String[] args) {

    // instantiate
    Inventory inventory = new Inventory();
    Item item1 = new Item("ak-47", 2);
    Item item2 = new Item("M16", 1);
    Item item3 = new Item("Grenade", 8);
    Item item4 = new Item("Parachute", 1);

    // add items
    inventory.addItems(item1);
    inventory.addItems(item2);
    inventory.addItems(item3);
    inventory.addItems(item4);

    // display inventory
    inventory.displayInventory();
  }
}