fun main() {
    val horsemanHorsewomanVarious = HorsemanHorsewomanVarious()
    horsemanHorsewomanVarious.register()

    var horseList = Horses()

    while (true) {
        println("1. Add a horse")
        println("2. List all horses")
        println("3. Exit")

        val userInput = readLine()
        when (userInput) {
            "1" -> {
                horseList.askUserForBreedSelection()
            }

            "2" -> {
                horseList.askUserForBreedSelection()
            }

            "3" -> {
                horseList.askUserForBreedSelection()

                if (!horseList.horses.isEmpty()) {
                    println("Horse list:${horseList}")
                    for (horse in horseList.horses) {
                        println("- ${horse.name} (${horse.breed})")
                    }
                } else {
                    println("No horses in the list.")
                }
            }
        }
    }
}


