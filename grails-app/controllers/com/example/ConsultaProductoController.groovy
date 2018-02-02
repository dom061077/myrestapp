package com.example

import grails.converters.JSON
import grails.rest.RestfulController

class ConsultaProductoController extends RestfulController {

	ConsultaProductoController(){
		super(Book)
	}

    def index() { render "HOLA" }
	
	def buscarProducto(int codigo){
		log.info("parametros: "+params)
		//log.info()
		Producto productoInstance = Producto.findByCodigo(1);
		//def bodyRequest  = getObjectToBind()
		//render JSON.parse(request.reader)
		render productoInstance as JSON
		
	}
}
