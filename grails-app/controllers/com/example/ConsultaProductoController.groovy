package com.example

import grails.converters.JSON
import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_USER")
class ConsultaProductoController extends RestfulController {

	ConsultaProductoController(){
		super(Book)
	}

    def index() { render "HOLA" }
	
	def buscarProducto(){
		log.info("parametros: "+params)
		//log.info()
		Producto productoInstance = Producto.findByCodigo(params.id);
		//def bodyRequest  = getObjectToBind()
		//render JSON.parse(request.reader)
		render productoInstance as JSON
                
		
	}
}
