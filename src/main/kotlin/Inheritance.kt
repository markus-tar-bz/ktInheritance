

fun main() {
    //Circle(8.0)
    val myCircle1 = Circle(5.0) //the circle class is called (init block)
    myCircle1.changeName("Peter") //fun from the open/parent class
    println("The new  name of the circle is ${myCircle1.name}")
    Triangle(6.0,8.0 ,10.0 )
}

//you can inherit functions and constructors/variables from the parent class to child class
//kt files have access to all classes.
//In Kotlin, all classes are final by default. To permit the derived class to inherit from the base class,
// we must use the open keyword in front of the base class.
/*When we inherit a class then all the properties and functions are also inherited.
We can use the base class variables and functions in the derived class and can also call functions using the derived class object.
 */

