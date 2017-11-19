package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author bevani01
 */
public class EBook extends Book {
  private final String format;
  
  public EBook(String format, String author, int publishingYear, long id, String title) {
      super(author, publishingYear, id, title, 1); // putting the 1 there to take the in variable to not give me an error
      this.format = format;
  }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
  @Override
  public void checkout() { }
  @Override
  public void checkin() {}
  
  @Override
  public String getInfo() {
      return String.format("%s (%d). %s is at %s ", author, publishingYear, title, format);
}
}
