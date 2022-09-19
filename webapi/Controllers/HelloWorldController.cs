using Microsoft.AspNetCore.Mvc;

namespace webapi.Controllers;

[ApiController]
[Route("hello")]
public class HelloWorldController : ControllerBase
{
    [HttpGet(Name = "HelloWorld")]
    public string Get()
    {
        return "Hello, World!";
    }
}
