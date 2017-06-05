import another.pkg.testExFunFromHere

/**
 * Created by ironb on Thu,6/1/2017.
 */

val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

infix fun String.lipsum(limit: Int): String = loremIpsum.substring(0..(limit - 1))

infix fun String.shouldBeGeneratedBy(num: Int): String {
    var n = num
    val strBuilder = StringBuilder()
    while (n > 0) {
        strBuilder.append(this)
        n--
    }
    return strBuilder.toString()
}

fun main(args: Array<String>) {
//    println("" lipsum 100)

//    println("Rhine " shouldBeGeneratedBy 100)

    testExFunFromHere()

    println("!= ->")
}

