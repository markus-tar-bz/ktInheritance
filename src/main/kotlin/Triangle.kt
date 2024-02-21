import kotlin.math.sqrt

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double
) : Shape("Triangle") {
    //var p = inh  .inherited objects can only be assigned to variables inside derived class,
    // otherwise they need to be inside any of the derived class functions
    init {
        //println(p)
        println(inh)
        changeName("TriangleNew")
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }
    fun ire() {
        changeName("VITRON") //function of the parent class can be called directly inside any derived class functions.
    }
    private fun perimeter() = a + b + c
    private fun area() = sqrt((perimeter() / 2) * ((perimeter() / 2) - a) * ((perimeter() / 2) - b) * ((perimeter() / 2) - c))
}