package example

class Person {

    static mapWith = "neo4j"

    String name
    String title

    static transients = ['title']
}
