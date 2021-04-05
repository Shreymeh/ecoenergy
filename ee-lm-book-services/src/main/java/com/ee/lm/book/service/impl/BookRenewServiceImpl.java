public class BookRenewServiceImpl implements BookRenewService 
{
  @Autowired 	
  UserServiceValidation userValidationService;
    
  @Autowired
  ReservationService reservationService;  
  
  @Autowired
  PenaltyService penaltyService;
	
 
  public bool renewBook(Book book) 
  {
	if (!userValidationService.validateMaxBooksAllowed(userId))
	{		
		throw new UserServiceException();
	}
	
	List<IssuedBookDetails> overTimedBooksDetails = userValidationService.validateIfTimeLineCrossed(userId);
	if (overTimedBooksDetails != null && !overTimedBooksDetails.isEmpty())
	{
		throw new UserServiceException(" APPROPRIATE_ERROR_MSG ");
	}
	
	IssuedBookDetails issuedBookDetails = reservationService.fetchReservationDetails(bookId);
	
	if (issuedBookDetails.status.equals(BookStatus.AVAILABLE))
	{
		return reservationService.renewBook(userId, bookId);		
    } 
	else if (issuedBookDetails.status.equals(BookStatus.ISSUED)) 
	{
		if (issuedBookDetails.getUserId.equals(userId)) 
		{
			if (!UserServiceValidation.validateIfTimeLineCrossed(issuedBookDetails.getIssuedDate()))
			{
				PenaltyDetails penalty = penaltyService.getPenaltyDetais(String userId, String bookId);
				
				throw new UserServiceException(" APPROPRIATE_ERROR_MSG ");
			}
			else
			{
				return reservationService.renewBook(userId, bookId);
			}			
		}
		else
			throw new UserServiceException(" APPROPRIATE_ERROR_MSG - BOOK HAS ALREADY BEEN ISSUED TO SOMEONE ELSE !");
    }	
  }   
  
}
