public class BookReturnServiceImpl implements BookReturnService 
{
  @Autowired 	
  UserServiceValidation userValidationService;
    
  @Autowired
  ReservationService reservationService;  
  
  @Autowired
  PenaltyService penaltyService;
	
 
  public void returnBook(String userId, String bookId) 
  {
	List<IssuedBookDetails> overTimedBooksDetails = userValidationService.validateIfTimeLineCrossed(userId);
	if (overTimedBooksDetails != null && !overTimedBooksDetails.isEmpty())
	{
		throw new UserServiceException(" APPROPRIATE_ERROR_MSG ");
	}
	
	IssuedBookDetails issuedBookDetails = reservationService.fetchReservationDetails(bookId);
	
	if (issuedBookDetails.status.equals(BookStatus.AVAILABLE))
	{
		throw new UserServiceException(" APPROPRIATE_ERROR_MSG - DATA_MISMATCH !");
    } 
	else if (issuedBookDetails.status.equals(BookStatus.ISSUED)) 
	{
		if (issuedBookDetails.getUserId.equals(userId)) 
		{
			if (!UserServiceValidation.validateIfTimeLineCrossed(issuedBookDetails.getIssuedDate()))
			{
				PenaltyDetails penalty = penaltyService.getPenaltyDetais(String userId, String bookId);
				
				throw new UserServiceException(" APPROPRIATE_ERROR_MSG - Late Fee Details !");
			}
			else
			{
				throw new UserServiceException(" APPROPRIATE_ERROR_MSG - DATA_MISMATCH !");
			}			
		}
		else
			return reservationService.returnBook(String userId, String bookId);
    }   
  }
  
}
