package gorm.transients

import example.Person

class BootStrap {

    def init = { servletContext ->

        Person.withNewSession {
            Person.withNewTransaction {
                String name = 'Benjamín'
                if (!Person.findByName(name)) {
                    new Person(name: name, age: 20).save(flush: true)
                }
            }
        }
    }
    def destroy = {
    }
}
