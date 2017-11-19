package exercise8;

/**
 * Class Item
 * @author bevani01
 */


public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;
  
  public Item(long id, String title, int quantity) {
      this.id = id;
      this.title = title;
      this.quantity = quantity;
  }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
      return quantity > 0;
  }

  /**
   * 
   */
  public void checkout() {
      if (isAvailable()) {
          --quantity; 
      }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      ++quantity; 
  }
  
  @Override
  public String toString() {
      if (isAvailable()) {
          if (quantity == 1) {
              return String.format("There is a copy of %s.", title);
          }
          else {
              return String.format("There are %d copies of %s.", quantity, title);
          }
      }
      else {
          return String.format("There are no copies of %s", title);
      }
}
  public abstract String getInfo();
  
}
