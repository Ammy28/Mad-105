import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main() {
    var date = LocalDate.now()
    var fullMoon = LocalDate.of(2020, 3, 9)
    var nextFM = date.until(fullMoon, ChronoUnit.DAYS)
    println("The next full moon is in $nextFM days.")


}