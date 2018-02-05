package com.example.proveedor

import grails.converters.JSON
import grails.rest.RestfulController
import com.example.Remito
import com.example.RemitoDetalle
import com.example.Producto
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_USER")
class RemitoController extends RestfulController {
	
	RemitoController(){
		super(Remito)
	}

    def index() { }
	
	def save(){
		log.info "save method"
		def jsonParams = JSON.parse(request.reader)
		log.info('Obs. remito: '+jsonParams.observacion)
		def remitoInstance = new Remito(fecha:new Date(),observacion:jsonParams.observacion)
		def remitoDetInstance
		def response=[:]
                
                log.info('Parametros enviados:'+jsonParams.fecha+'');
                render response as JSON
		/*jsonParams.Detalle.each{ det ->
				remitoDetInstance = new RemitoDetalle()
				remitoDetInstance.producto = Producto.load(det.productoId)
				remitoDetInstance.cantidad = det.cantidad
				remitoInstance.addToDetalle(remitoDetInstance)
		}
		if (remitoInstance.save()){
			response.success = true
			response.object = remitoInstance
			render response as JSON
		}else{
			log.info("Errores: "+remitoInstance.errors.allErrors)
			response.success = false
			response.object = remitoInstance
			render response as JSON
		}*/
	}
}
