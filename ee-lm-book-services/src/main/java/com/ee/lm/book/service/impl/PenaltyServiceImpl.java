public class PenaltyServiceImpl implements PenaltyService 
{
  @Autowired
  BookIssueService bookIssueService;  
	
  @Autowired 	
  BookIssueDAO bookIssueDAOService; // RESTTemplate based adoptor to call Library Management Data Services 	
 
 
  @Autowired 	
  UserDAO userDAOService; // RESTTemplate based adoptor to call Library Management Data Services

  public PenaltyDetails getPenaltyDetais(String userId, String bookId) 
  {
    // penalty calculations based on Book Details + User Details  from      
  }
  
}
