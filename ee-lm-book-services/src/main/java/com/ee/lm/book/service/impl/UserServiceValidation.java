public class UserServiceValidation implements ServiceValidation
{
	
    
  
  public boolean validateMaxBooksAllowed(String userId) 
  {
	  /*
	   *  userDAO.getIssuedBooksCount(userId);
	   *
	   */
  }

  List<IssuedBookDetails> overTimedBooksDetails validateIfTimeLineCrossed(String userId) 
  {
	  /*
	   *  userDAO.getIssuedBooksDetails(userId);
	   
	   *  Check with SYSTEM_DATE w.r.t. any delay in any of the book issued
	   
	   *  we can make use of PROPERTY -  MAX_DELAY_IN_RETURN
	   */		
  }


  public static boolean validateIfTimeLineCrossed (Date date)
  {
	  /*
	   *  Check with SYSTEM_DATE w.r.t. any delay 
	   
	   
	   *  we can make use of PROPERTY -  MAX_DELAY_IN_RETURN
	   */
	  
  }
}
