package com.ee.lm.rest.resource;

@Api
@Path("/search/books")
public class BookRestResource 
{	
	@Autowired
	SearchService searchService;
			
	@GET
	@Path("/title/{title}")	
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(response = List.class)
	@ApiResponses(
					{ 
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response searchByTitle(@PathParam("title") String title) 
	{	
		return Response.ok(searchService.searchByTitle(title), MediaType.APPLICATION_JSON).build();				
	}
	
	
	@GET
	@Path("/author/{author}")	
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(response = List.class)
	@ApiResponses(
					{ 
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response searchByAuthor(@PathParam("author") String author) 
	{	
		return Response.ok(searchService.searchByAuthor(author), MediaType.APPLICATION_JSON).build();				
	}
	
	
	
	@GET
	@Path("/subject/{subject}")	
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(response = List.class)
	@ApiResponses(
					{ 
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response searchBySubject(@PathParam("subject") String subject) 
	{	
		return Response.ok(searchService.searchBySubject(subject), MediaType.APPLICATION_JSON).build();				
	}
	
	
	
	@GET
	@Path("/publishDate/{publishDate}")	
	@Produces(MediaType.APPLICATION_JSON)	
	@ApiOperation(response = List.class)
	@ApiResponses(
					{ 
						@ApiResponse(code = 200, message = "OK"), 
						@ApiResponse(code = 404, message = "Resource not found"),
						@ApiResponse(code = 500, message = "Internal Server Error") 
					}
				  )
	public Response searchByPubDate(@PathParam("publishDate") Date publishDate) 
	{	
		return Response.ok(searchService.searchByPubDate(publishDate), MediaType.APPLICATION_JSON).build();				
	}
}
