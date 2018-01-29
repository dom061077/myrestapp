package myapp

import grails.rest.RestfulController
import com.example.Book
import grails.plugin.springsecurity.annotation.Secured



@Secured("ROLE_USER")
class BookController extends RestfulController<Book> {
	BookController() {
		super(Book)
	}
    def index() {
             respond(message: "Hello World")
    }
}
