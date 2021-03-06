package myapp

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
        "/api/book"(resources:"book")
		"/api/producto" (resources:"producto")
		"/api/consultaproducto" (resources:"consultaProducto")
		get "/api/consultaproducto/search/$id" (controller:"consultaProducto",action:"buscarProducto")
		"/api/remito" (resources:"remito")
        post "/api/remito" (controller:"remito",action:"save")
    }
}
