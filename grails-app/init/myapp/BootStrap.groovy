package myapp

import com.example.Book
import com.example.auth.*

class BootStrap {

    def init = { servletContext ->
        User.withTransaction {
            Book book = new Book(name: "Grails in action", isbn: "12345", price: 30.00).save(failOnError:true)

            Role role = new Role(authority: "ROLE_USER").save(failOnError:true)
            User user = new User(username: "me", password: "password").save(failOnError:true)
            UserRole.create(user, role)
        }      
    }
    def destroy = {
    }
}
