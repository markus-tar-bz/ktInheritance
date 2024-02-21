open class Shape(
    var name: String
) {
    var inh = "Inherited class variable"
    init {
        println("I am the super class!")
        var op = "Inherited class function variable"
    }

    fun changeName(newName: String) {
        name = newName
    }
}