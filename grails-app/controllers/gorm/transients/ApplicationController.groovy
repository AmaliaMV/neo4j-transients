package gorm.transients

import example.Person

class ApplicationController {

    def index() {
        Person person = Person.findByName('Benjamín')
        person.title = 'Sr.'
        assert person.dirtyPropertyNames == []

        [person: person]
    }
}
