package com.example

import grails.converters.JSON
import grails.rest.RestfulController

class ConsultaProductoController RestfulController {

    def index() { }
	
	def buscarProducto(int codigo){
		log.info("parametros: "+params)
		Producto productoInstance = Producto.findByCodigo(1);
		def bodyRequest  = getObjectToBind()
		render bodyRequest as JSON
	}
}
