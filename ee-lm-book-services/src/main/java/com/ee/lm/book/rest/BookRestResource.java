package com.ee.lm.rest.resource;

@Api
@Path("/books")
public class BookRestResource 
{
	
	@Autowired
	BookIssueService bookIssueService;
	
	@Autowired
	BookReturnService bookReturnService;
	
	@Autowired
	BookRenewService bookRenewService;
	
	@POST
	@Path("/issue")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(value="issueBook")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response issueBook(@ApiParam("bookId") String bookId, @ApiParam("userId") String userId) 
	{
		bookIssueService.issueBook(bookId, userId);		
		return Response.status(Status.CREATED).type(MediaType.APPLICATION_JSON).build();
	}
	
	
	@POST
	@Path("/return")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(value="returnBook")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response returnBook(@ApiParam("bookId") String bookId, @ApiParam("userId") String userId) 
	{
		bookReturnService.returnBook(bookId, userId);		
		return Response.status(Status.CREATED).type(MediaType.APPLICATION_JSON).build();
	}
	
	
	
	@PUT
	@Path("/renew")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(value="renewBook")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response renewBook(@ApiParam("bookId") String bookId, @ApiParam("userId") String userId) 
	{
		bookIssueService.bookRenewService(bookId, userId);		
		return Response.status(Status.CREATED).type(MediaType.APPLICATION_JSON).build();
	}	
}
