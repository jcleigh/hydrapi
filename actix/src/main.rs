use actix_web::{web, App, HttpServer, Responder};

async fn root() -> impl Responder {
    format!("rust/actix")
}

async fn hello() -> impl Responder {
    format!("Hello, World!")
}

#[actix_web::main]
async fn main() -> std::io::Result<()> {
    HttpServer::new(|| {
        App::new()
            .route("/", web::get().to(root))
            .route("/hello", web::get().to(hello))
    })
    .bind(("0.0.0.0", 8080))?
    .run()
    .await
}