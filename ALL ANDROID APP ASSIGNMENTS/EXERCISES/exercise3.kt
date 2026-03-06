data class Person(val name: String, val age: Int)

fun main() {

    val people = listOf(
        Person("Alice", 22),
        Person("Bob", 30),
        Person("Anna", 25),
        Person("David", 40),
        Person("Brian", 28),
        Person("Chris", 35)
    )

    // Filtrer les noms qui commencent par A ou B
    val filteredPeople = people.filter {
        it.name.startsWith("A") || it.name.startsWith("B")
    }

    // Calculer la moyenne d'âge
    val averageAge = filteredPeople
        .map { it.age }
        .average()

    // Afficher avec 1 décimale
    println("Average age: %.1f".format(averageAge))
}