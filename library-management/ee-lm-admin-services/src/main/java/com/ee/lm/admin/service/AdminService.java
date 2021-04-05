public interface AdminService 
{
  public boolean addBook(Book book);
  
  public boolean removeBook(String bookId, String adminId);

  public boolean blockUser(String userId, String adminId);

  public boolean unBlockUser(String userId, String adminId);
}