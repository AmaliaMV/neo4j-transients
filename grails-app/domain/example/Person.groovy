package example

class Person {

    static mapWith = "neo4j"

    String name
    String title

    static transients = ['title']

    def afterLoad() {
        //title = 'Sr.'  // works ok
        //this.setProperty('title', 'Sr.')  // title is marking as dirty

        Helper.withNoAutoFlush {
            title = 'Sr.' // title is marking as dirty
        }
    }
}
