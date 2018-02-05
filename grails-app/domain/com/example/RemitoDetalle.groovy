package com.example

class RemitoDetalle {
	static auditable = true

    Producto producto
	Remito remito
    int cantidad
	static belongsTo = Remito
    static constraints = {
    }
}
