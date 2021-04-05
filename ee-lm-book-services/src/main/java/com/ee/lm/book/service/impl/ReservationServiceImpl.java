public class ReservationServiceImpl implements ReservationService 
{
  
  @Autowired 	
  BookDAO bookDAOService; // RESTTemplate based adoptor to call Library Management Data Services
    

  public IssuedBookDetails fetchReservationDetails(String selectedBookID) 
  { 
	/*
	 *   
	 *
	 */
	IssuedBookDetails issuedBookDetails	=  bookDAOService.getBookDetails(selectedBookID);
    
  }


  public boolean reserveBook(String userId, String bookId) 
  { 
	/*
	 *   
	 *
	 */
	return bookDAOService.reserveBook(userId, bookId);
    
  }
  
  
  public boolean renewBook(String userId, String bookId, Date renewDate) 
  { 
	/*
	 *   
	 *
	 */
	return bookDAOService.renewBook(userId, bookId);
    
  }
  
  
  public boolean returnBook(String userId, String bookId, Date renewDate) 
  { 
	/*
	 *   
	 *
	 */
	return bookDAOService.returnBook(userId,  bookId);
    
  }
    
}
