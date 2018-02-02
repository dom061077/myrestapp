package com.example

class Remito {
	static auditable = true

    Date fecha
    String observacion
	
	static hasMany = [detalle:RemitoDetalle]
	
    static constraints = {
    }
}
