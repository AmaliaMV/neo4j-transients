package example

class Helper {

    static void withNoAutoFlush(Closure closure) {
        closure.call()
    }
}
