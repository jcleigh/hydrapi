# HydrAPI

This project will spin up multiple REST API services in Docker containers and an `nginx` container that load balances requests across them evenly.
The project was named after the [Hydra](https://en.wikipedia.org/wiki/Lernaean_Hydra), a creature from Greek and Roman mythology.

Currently the project contains the following REST API services:
| Framework     | Language |
|---------------|----------|
| Actix         | Rust     |
| Buffalo       | Go       |
| Express       | NodeJS   |
| Flask         | Python   |
| .NET WebApi   | C#       |
| Rails         | Ruby     |
| Spring Boot   | Java     |

### ** Please note that this project is for personal training and testing purposes only at the moment and should never be used as-is ever. **

---
## Requirements:
- `Docker` / `Docker Desktop`
    - Note: this has only currently been tested using Docker Desktop for Windows

---
## Using HydrAPI:
1. Run the following:
```bash
cd hydrapi
docker-compose up
```

2. Open http://localhost:8080 in your browser. 
    - Hitting the root endpoint, `/`, will display which service that the request was routed to (e.g.: `go/buffalo`). Refresh this endpoint to see the response change depending on where it was routed.
    - Hitting the endpoint `/hello` will return `Hello, World!`, regardless of the service that the request is routed to. 

---
## Other Notes:
- Running each service locally outside of building the Dockerfile may or may not work
- Running tests locally, where they even exist, may or may not work

It is my intention to add more services and endpoints to the project. If you would like to take a crack at it, please open a pull request.

---
## License:
MIT License