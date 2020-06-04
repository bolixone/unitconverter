package converter
import java.util.*

/* 1 kg to ounces -- 2 meters in yards estas pueden ser los inputs
las respuestas son siempre iguales 1.0 kilogram is 35.27399072294044 ounces

pueden ser de cm a km ahora no solo a mts como antes
lo mismo con los gramos a kg o viceersa
tengo 4 elemntos 1 numero || unidad inicial || cualquier texto || unidad destino

*/

enum class MEDIDAS(val a: String, val b: String, val c: String) {
    KG ("kg", "kilogram", "kilograms"),
    GR ("g", "gram", "grams"),
    MG ("mg", "milligram", "milligrams"),
    LB ("lb", "pound", "pounds"),
    OZ ("oz", "ounce", "ounces"),
    MT ("m", "meter", "meters"),
    KM ("km", "kilometer", "kilometers"),
    CM ("cm", "centimeter", "centimeters"),
    MM ("mm", "millimeter", "millimeters"),
    MI ("mi", "mile", "miles"),
    YD ("yd", "yard", "yards"),
    FT ("ft", "foot", "feet"),
    IN ("in", "inch", "inches"),
    NULL ("", "", "");



}




class Calculadora() {

    val onza: Double = 28.3495
    val kilogramo: Double = 1000.0
    val gramos: Double = 1.0
    val miligramos: Double = 0.001
    val paunds: Double = 453.592

    val metro: Double = 1.0
    val pulgadas: Double = 0.0254
    val pies: Double = 0.3048
    val yardas: Double = 0.9144
    val millas: Double = 1609.344
    val kilometros: Double = 1000.0
    val centimetros: Double = 0.01
    val milimetros: Double = 0.001

//  val calculo: Double = (number * cantidad_origen) / cantidad_destino

    fun input(a: String) {

        val parts = a.split(" ")


        var unit_desde = ""
        var unit_hacia = ""
        var number = 0.0

        if (parts.count() == 4) {
            unit_desde = parts[1]
            unit_hacia = parts[3]
            number = parts[0].toDouble()
        } else if (parts.count() == 5) {
            unit_desde = parts[2]
            unit_hacia = parts[4]
            number = parts[0].toDouble()
        }




        var cantidad_origen: Double = when(unit_desde.toLowerCase()) {
            "kg", "kilogram", "kilograms" -> kilogramo
            "g", "gram", "grams" -> gramos
            "mg", "milligram", "milligrams" -> miligramos
            "lb", "pound", "pounds" -> paunds
            "oz", "ounce", "ounces" -> onza
            "m", "meter", "meters" -> metro
            "km", "kilometer", "kilometers" -> kilometros
            "cm", "centimeter", "centimeters" -> centimetros
            "mm", "millimeter", "millimeters" -> milimetros
            "mi", "mile", "miles" -> millas
            "yd", "yard", "yards" -> yardas
            "ft", "foot", "feet" -> pies
            "in", "inch", "inches" -> pulgadas
            else -> 0.0
        }

        var cantidad_destino: Double = when(unit_hacia.toLowerCase()) {
            "kg", "kilogram", "kilograms" -> kilogramo
            "g", "gram", "grams" -> gramos
            "mg", "milligram", "milligrams" -> miligramos
            "lb", "pound", "pounds" -> paunds
            "oz", "ounce", "ounces" -> onza
            "m", "meter", "meters" -> metro
            "km", "kilometer", "kilometers" -> kilometros
            "cm", "centimeter", "centimeters" -> centimetros
            "mm", "millimeter", "millimeters" -> milimetros
            "mi", "mile", "miles" -> millas
            "yd", "yard", "yards" -> yardas
            "ft", "foot", "feet" -> pies
            "in", "inch", "inches" -> pulgadas
            else -> 0.0
        }

        val calculo: Double = (number * cantidad_origen) / cantidad_destino

        var medida_desde: String = when(unit_desde.toLowerCase()) {
            "kg", "kilogram", "kilograms" -> if (number == 1.0) "kilogram" else "kilograms"
            "g", "gram", "grams" -> if (number == 1.0) "gram" else "grams"
            "mg", "milligram", "milligrams" -> if (number == 1.0) "milligram" else "milligrams"
            "lb", "pound", "pounds" -> if (number == 1.0) "pound" else "pounds"
            "oz", "ounce", "ounces" -> if (number == 1.0) "ounce" else "ounces"
            "m", "meter", "meters" -> if (number == 1.0) "meter" else "meters"
            "km", "kilometer", "kilometers" -> if (number == 1.0) "kilometer" else "kilometers"
            "cm", "centimeter", "centimeters" -> if (number == 1.0) "centimeter" else "centimeters"
            "mm", "millimeter", "millimeters" -> if (number == 1.0) "millimeter" else "millimeters"
            "mi", "mile", "miles" -> if (number == 1.0) "mile" else "miles"
            "yd", "yard", "yards" -> if (number == 1.0) "yard" else "yards"
            "ft", "foot", "feet" -> if (number == 1.0) "feet" else "feet"
            "in", "inch", "inches" -> if (number == 1.0) "inch" else "inches"
            else -> ""
        }

        var medida_hacia: String = when(unit_hacia.toLowerCase()) {
            "kg", "kilogram", "kilograms" -> if (calculo == 1.0) "kilogram" else "kilograms"
            "g", "gram", "grams" -> if (calculo == 1.0) "gram" else "grams"
            "mg", "milligram", "milligrams" -> if (calculo == 1.0) "milligram" else "milligrams"
            "lb", "pound", "pounds" -> if (calculo == 1.0) "pound" else "pounds"
            "oz", "ounce", "ounces" -> if (calculo == 1.0) "ounce" else "ounces"
            "m", "meter", "meters" -> if (calculo == 1.0) "meter" else "meters"
            "km", "kilometer", "kilometers" -> if (calculo == 1.0) "kilometer" else "kilometers"
            "cm", "centimeter", "centimeters" -> if (calculo == 1.0) "centimeter" else "centimeters"
            "mm", "millimeter", "millimeters" -> if (calculo == 1.0) "millimeter" else "millimeters"
            "mi", "mile", "miles" -> if (calculo == 1.0) "mile" else "miles"
            "yd", "yard", "yards" -> if (calculo == 1.0) "yard" else "yards"
            "ft", "foot", "feet" -> if (calculo == 1.0) "feet" else "feet"
            "in", "inch", "inches" -> if (calculo == 1.0) "inch" else "inches"
            else -> ""
        }


        println("$number $medida_desde is $calculo $medida_hacia")
        println()


    }


}

fun main() {
    val scanner = Scanner(System.`in`)
    val calculo = Calculadora()

    do {
        println()
        println("Enter what you want to convert (or exit): ")

        val a = scanner.nextLine()
        if (a.toString() == "exit") break


        calculo.input(a)


    } while (a.toString() != "exit")

}


/*

Let's rewrite our program using enums. The problem with representing measurement units as strings is
that strings may take longer to process, especially since each unit has at least three different
accepted string notations (such as “m”, “meter”, and “meters”).

If you represent each unit by a special enum value, your code becomes cleaner and more readable.
Since comparing enum values is much faster than comparing strings, your code is also processed faster.

The main units of temperature used today are degrees Celsius (CC), degrees Fahrenheit (FF), and Kelvins (KK).

Converting these units is somewhat different from dealing with length or mass. 0 degrees Kelvin is
not equal to 0 degrees Celsius nor 0 degrees Fahrenheit, and neither is 0 degrees Celsius equal to
0 degrees Fahrenheit.

Below are all the formulas for converting one unit of temperature to another. In these, the letter

KK stands for degrees Kelvin,
CC stands for degrees Celsius and
FF means degrees Fahrenheit.

To convert Celsius to Fahrenheit and vice versa, use the following formulas:
C = (F - 32) * 5 / 9C=(F−32)∗5/9
F = C * 9 / 5 + 32F=C∗9/5+32

To convert Kelvins to Celsius or vice versa, use these formulas:
K = C + 273.15K=C+273.15
C = K - 273.15C=K−273.15

To convert between degrees Fahrenheit and Kelvins, use these formulas:
F = K * 9 / 5 - 459.67F=K∗9/5−459.67
K = (F + 459.67) * 5 / 9K=(F+459.67)∗5/9

The program should allow the following notations:

For degrees Celsius, the user can input "degree Celsius", "degrees Celsius", "celsius" "dc", or "c".
For degrees Fahrenheit, the user can input "degree Fahrenheit", "degrees Fahrenheit", "fahrenheit",
"df", or "f".
For Kelvins, the user can input "Kelvin", "Kelvins", or "k".


At this stage, if the user attempts to perform an impossible conversion, such as meters to kilograms,
or if one of the input units is not recognized, the program should output an appropriate error message.

If you cannot determine the unit, output "???" instead (obviously, it would be inside an error message).
Don't forget that in the error message, both measurement types should be written in the plural, not singular.

If the user wants to convert mass from one to another but inputs a negative amount, you should print
Weight shouldn't be negative. The same is true for length, and the message should be Length shouldn't
be negative.

What to do if a query is bad? Handle this! Try to parse the following parts:

<number> +
<(unit name) or (degree + unit name) or (degrees + unit name)> +
<random word like "to" or "in"> +
<(unit name) or (degree + unit name) or (degrees + unit name)>
If there is an error, output Parse error.

Enter what you want to convert (or exit): 1 degree Celsius to Kelvins
1.0 degree Celsius is 274.15 Kelvins
Enter what you want to convert (or exit): -272.15 dc to K
-272.15 degrees Celsius is 1.0 Kelvin
Enter what you want to convert (or exit): 1 kn to feet
Conversion from ??? to feet is impossible
Enter what you want to convert (or exit): 1 km to feet
1.0 kilometer is 3280.839895013123 feet
Enter what you want to convert (or exit): 3 pount to ounces
Conversion from ??? to ounces is impossible
Enter what you want to convert (or exit): 3 pound to ounces
3.0 pounds is 47.99999999999999 ounces
Enter what you want to convert (or exit): 3 kelvins to grams
Conversion from Kelvins to grams is impossible
Enter what you want to convert (or exit): 3 grams to meters
Conversion from grams to meters is impossible
Enter what you want to convert (or exit): exit
Enter what you want to convert (or exit): 1 F in K
1.0 degree Fahrenheit is 255.92777777777778 Kelvins
Enter what you want to convert (or exit): 1 K in F
1.0 Kelvin is -457.87 degrees Fahrenheit
Enter what you want to convert (or exit): 1 C in K
1.0 degree Celsius is 274.15 Kelvins
Enter what you want to convert (or exit): 1 K in C
1.0 Kelvin is -272.15 degrees Celsius
Enter what you want to convert (or exit): 1 F in C
1.0 degree Fahrenheit is -17.22222222222222 degrees Celsius
Enter what you want to convert (or exit): 1 C in F
1.0 degree Celsius is 33.8 degrees Fahrenheit
Enter what you want to convert (or exit): one boa in parrots
Parse error
Enter what you want to convert (or exit): please convert distance to the Moon to steps
Parse error
Enter what you want to convert (or exit): many things to improve!
Parse error
Enter what you want to convert (or exit): exit
Code Editor
IDE

 */
