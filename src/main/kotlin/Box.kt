import java.util.*

fun main(args: Array<String>) {
   val scanner = Scanner(System.`in`)
    print( "Please enter object's length: ")
    var length:Float=scanner.nextFloat()
    print( "Please enter object's width: ")
    var width:Float=scanner.nextFloat()
    print( "Please enter object's length: ")
    var height:Int=scanner.nextInt()
//    if (box3.validate(length, width, height)) println("Box3")
//    else if (box5.validate(length, width, height)) println("Box5")
//    else println("It's too big to contain!")
    when(Box3().validate(length,width,height)){
        true -> println("Box3")
        false -> if(Box5().validate(length,width,height)) println("Box5") else println("It's too big to contain!")
    }

}


class Box3 : Box(23f,14f,13)
class Box5 : Box(39.5f,27.5f,23)


open class Box(var length: Float, var width: Float, var height: Int){
    fun validate(length: Float, width:Float, height: Int) : Boolean {
        return (length<=this.length && width<=this.width && height<=this.height)
    }
}

