/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList")
    println()

//    create our list
    val snacks = mutableListOf<String>()
//    add some things
    snacks.add("Cheetos")
    snacks.add("Maple Bacon Chips")
    snacks.add("Toblerone")
    snacks.add("Popcorn")
    snacks.add("Chocolate")
    snacks.add("Liquorice")
    snacks.add("Cheese")
    snacks.add("Moro")
//show it
    println(snacks)

//    show specific items
    println(snacks[0])

//    println(snacks[8]) this line would be out of bounds

//    change a value
    snacks[1] = "CHEESE!!!!"
    println(snacks)

//    remove
    snacks.removeAt(0)
    println(snacks)

//    add in new items in specific places
    snacks.add(1, "Curly Fries")
    println(snacks)
//    sort the list
    snacks.sort()
    println(snacks)

//    shuffle list (randomize it)
    snacks.shuffle()
    println(snacks)

    //get random item from list
    val item = snacks.random()
    println(item)

    //searching for an item
    val item2 = snacks.contains("CHEESE!!!!")
    println("CHEESE!!!! is in list $item2")

//    searching for an item
    println("CHEESE!!!! is in the list ${ snacks.contains("CHEESE!!!!") }")
    println("Lava is in the list ${ snacks.contains("Lava") }")

    // getting the index of something
    println("liquorice index ${snacks.indexOf("Liquorice")}")
    println("Car index ${snacks.indexOf("Car")}")

    // loop through the list
    for (snack in snacks) {
        println(snack)
    }

    // loop using an index
    for(i in 0..< snacks.size) {
        println("$i: ${ snacks[i] }")

    }

    //loop getting index and values
    for((i, snack) in snacks.withIndex()) {
        println("$i: $snack")
    }
}

