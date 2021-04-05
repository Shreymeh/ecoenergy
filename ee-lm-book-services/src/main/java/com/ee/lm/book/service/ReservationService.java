public interface ReservationService 
{
    public IssuedBookDetails fetchReservationDetails(String selectedBookID);
	
	public boolean reserveBook(String userId, String bookId);
}