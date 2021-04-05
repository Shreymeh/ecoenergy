package com.ee.lm.rest.resource;

@Api
@Path("/admin")
public class BookRestResource 
{	
	@Autowired
	AdminService adminService;
	
	@Autowired
	BookReturnService bookReturnService;
	
	@Autowired
	BookRenewService bookRenewService;
	
	@POST
	@Path("/books")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(value="addBook")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response addBook(@ApiParam("book") Book book, @ApiParam("adminId") String adminId) 
	{
		adminService.addBook(bookId, adminId);		
		return Response.status(Status.CREATED).type(MediaType.APPLICATION_JSON).build();
	}
	
	
	@DELETE
	@Path("/books")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="removeBook")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )	
	public Response removeBook(@ApiParam("bookId") String bookId, @ApiParam("adminId") String adminId) 
	{
		adminService.removeBook(bookId, adminId);		
		return Response.status(Status.DELETED).type(MediaType.APPLICATION_JSON).build();
	}
	
	
	@PUT
	@Path("/users/block")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="blockUser")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )	
	public Response blockUser(@ApiParam("userId") String userId, @ApiParam("adminId") String adminId) 
	{
		adminService.blockUser(userId, adminId);		
		return Response.status(Status.UPDATED).type(MediaType.APPLICATION_JSON).build();
	}
	
	
	@PUT
	@Path("/users/unblock")	
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="unBlockUser")
	@ApiResponses(
					{			
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 401, message = "Unauthorized"), 
						@ApiResponse(code = 403, message = "Forbidden"),
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response unBlockUser(@ApiParam("userId") String userId, @ApiParam("adminId") String adminId) 
	{
		adminService.unBlockUser(userId, adminId);		
		return Response.status(Status.UPDATED).type(MediaType.APPLICATION_JSON).build();
	}	
}
