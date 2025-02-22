class Item extends Inventory{

  private String name;
  private int qty;

  public Item(String name, int qty) {
    
    super();
    this.name = name;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public int getQty() {
    return qty;
  }
}