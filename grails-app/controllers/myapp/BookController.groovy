package myapp

import grails.rest.RestfulController
import com.example.Book
import grails.plugin.springsecurity.annotation.Secured
import grails.converters.JSON



@Secured("ROLE_USER")
class BookController extends RestfulController<Book> {
	BookController() {
		super(Book)
	}
    def index() {
		def list = ["HOLA","COMO","ESTAS"] //Book.list()
		render list  as JSON
            // respond(message: "Hello World")
    }
}
