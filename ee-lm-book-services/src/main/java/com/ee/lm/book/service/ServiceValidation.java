public interface ServiceValidation 
{
  public boolean validateMaxBooksAllowed(User user); 
  
  private boolean validateIfTimeLineCrossed(User user, String selectedBookID); 
  
}