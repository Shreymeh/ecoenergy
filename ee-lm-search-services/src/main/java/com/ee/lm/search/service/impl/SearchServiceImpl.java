public interface SearchService 
{
 
  @Autowired 	
  BookDAO bookDAOService; // RESTTemplate based adoptor to call Library Management Data Services
   
	
  public List<Book> searchByTitle(String title)
  {
	/*
	 *   
	 *
	 */
	return bookDAOService.searchByTitle(title);
  }
  
  
  
  public List<Book> searchByAuthor(String author)
  {
	/*
	 *   
	 *
	 */
	return bookDAOService.searchByAuthor(author);
  }
  
  
  
  public List<Book> searchBySubject(String subject)
  {
	/*
	 *   
	 *
	 */
	return bookDAOService.searchBySubject(subject);  
  }
  
  
  
  public List<Book> searchByPubDate(Date publishDate)
  {	  
	/*
	 *   
	 *
	 */
	return bookDAOService.searchByPubDate(publishDate);  
  }
}