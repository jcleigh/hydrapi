using Microsoft.AspNetCore.Mvc;

namespace webapi.Controllers;

[ApiController]
[Route("")]
public class RootController : ControllerBase
{
    [HttpGet(Name = "Root")]
    public string Get()
    {
        return "dotnet/webapi";
    }
}
