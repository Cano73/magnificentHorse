open class Horses : HorsemanHorsewomanVarious() {
    fun askUserForBreedSelection() {
        ("Not yet implemented")
    }

    val horses: MutableList<Horses.Horse>
        get() {
            return this.horses
        }

    class Horse {

        val breed: Any = (String)

        val name: Any = (String)

    }
}

open class Horse(
    var name: String,
    val origin: String,
    val breed: Breed,        // Rasse
    val horsegroup: String,
    val size: String,
    val Exterior: String,    // Äußere erscheinung
    val coatDye: String,
    val charakter: String,
    val gait: String,       // Gang art
    val Spread: String,     // Verbreitung
    val suitableFor: String,// Geeignet für
    val maxAge: String,
    val grownWith: String

)

class Breed(val breed: String) {
    var firstHorse = IrishCob(
        "Irish Cob / Irish Tinker\n\t" +
                "Gruppe: Kaltblut mit Pony- / Warmbluteinschlag\n\t" +
                "Stockmaß: 130 – 145 cm\n\t" +
                "Exterieur: auffälliges Langhaar und Behang an den Beinen, robuster Körperbau,\n kräftiger Kopf, starker Hals, charakteristisches Bärtchen\n" +
                "Fellfarbe: überwiegend Schecken\n\t" +
                "Charakter: freundlich, unerschrocken, ruhig und gutmütig\n\t" +
                "Gang: erdgebundene, kraftvolle Bewegungen\n\t" +
                "Ursprung: Irland und Großbritannien\n\t" +
                "Verbreitung: überwiegend Europa\n\t" +
                "Geeignet für: Freizeit- und Fahrpferd, Reittherapie, Dressurreiten \n\t" +
                "Maximal alter: Alter 25 - 30 jahre\n\t" +
                "Ausgewachsen mit: Sie sind mit 5 jahren ausgewachsen.\t"

    )
    val scondHorse = QuarterHorse(
        "Quarter Horse / American Quarter Horse\t\n" +
                "Gruppe: vermischt mit nordeuropäischen Warmblut- und später Vollblutpferden\t\n",
                "Stockmaß zwischen 145 und 165 cm\t\n" +
                "Exterieur: Quarter haben einen ziemlich edlen und meist recht kurzen kleinen Kopf\n und ein zierliches Maul Sehr große Augen und bewegliche kleine Ohren.\t\n" +
                "Fell farbe: Blue Roan, Braune, Rappen, Füchse, Schimmel.\t\n" +
                "Charakter Gutmütig, freundlich, lernwillig, nervenstark.\t\n" +
                "Gang: Schritt, Trab und Galopp.\t\n" +
                "Ursprung Nordamerika\t\n" +
                "Verbreitung Weltweit\t\n" + "Geeignet für: Western- und Freizeitreiten\t\n" +
                "Maximal alter: Alter 25 - 30 jahre\n\t" +
                "Ausgewachsen mit: Sie sind mit 5 jahren ausgewachsen.\t"
    )

    val thirdHorse = PaintHorse(
        "PAINT HORSE STECKBRIEF\t\n" +
                "Rasse: Paint Horse\t\n" +
                "Lebenserwartung: 20-25 Jahre\t\n" +
                "Gruppe: Warmblut\t\n" +
                "Stockmaß: 140-160 cm\t\n" +
                "Ursprung: USA\t\n" +
                "Gewicht: 450-600 kg\t\n" +
                "Zucht seit: 18. Jahrhundert\t\n" +
                "Fellfarbe: alle Farben in Tobiano-, Overo- und Tovero-Scheckungen oder einfarbig\t\n" +
                "Hauptzuchtgebiet: USA\t\n" +
                "Exterieur: kompakt, stark bemuskelt, kleiner Kopf, langer Hals\t"
    )
}

fun askUserForBreedSelection() {
    println("Please select the breed of horse you would like to add:")
    println("1. Irish Cob / Irish Tinker")
    println("2. Quarter Horse / American Quarter Horse")
    println("3. Paint Horse")

    val userInput = readLine()
    val breed = when (userInput) {
        "1" -> Breed.IrishCob
        "2" -> Breed.QuarterHorse
        "3" -> Breed.PaintHorse

        else -> {
            println("Invalid input. Please select a number between 1 and 3.")
            askUserForBreedSelection()
            return
        }
    }

    println("Please enter the name of the horse:")
    val name = readLine()

    addHorse(Horse(name ?: "", breed))
}

private val horses = mutableListOf<Horses.Horse>()

fun addHorse(horse: Horse) {
    horses.add(horse)
    println("Horse ${horse.name} of breed ${horse.breed} added to the list of horses.")
}

private fun <E> MutableList<E>.add(element: Horse) {
    ("Not yet implemented")
}


//Stockmass zwischen 155- 165
//Uralte Rasse
//Mit viel Wumms und Temperament