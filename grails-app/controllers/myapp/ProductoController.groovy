package myapp

import grails.rest.RestfulController
import com.example.Producto
import grails.converters.JSON

class ProductoController extends RestfulController<Producto> {

	ProductoController(){
		super(Producto)
	}

	
    def index() { 
		def list = Producto.list()
		render list as JSON
	}
	
	def traerProducto(int codigo){
		Producto prodInstance = Producto.findByCodigo(codigo)
		render prodInstance as JSON
	}
}
