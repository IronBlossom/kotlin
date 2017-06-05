package another.pkg

import shouldBeGeneratedBy

/**
 * Created by ironb on Tue,6/6/2017.
 */

fun testExFunFromHere() {
    println("Another Kotlin File.kt" shouldBeGeneratedBy 12)

    val aKotClass = `A Kotlin Class`()

    println("aKotClass.aShort= ${aKotClass.aShort} aKotClass.anInt=${aKotClass.anInt}")
}