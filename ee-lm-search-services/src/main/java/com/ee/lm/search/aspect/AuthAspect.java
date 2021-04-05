
/**
 * 
 * Authentication Aspect through another service - i.e. User Management System
 *  
 */
@Component
@Aspect
public class AuthAspect 
{
	
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UMSService umsService;
	
	 @Around("@annotation(authenticate)" )
	 public Object authenticateUmsUser()
	 {
		/*
		 *  User Authentication Implementation 
		 */
	 }
}
