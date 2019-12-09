val recetas : MutableList<MutableList<String>> = mutableListOf()


fun main(args : Array<String>) {
    val menu : String = """
        :: Bienvenido a Recipe Make ::
        Seleccione la opcion deseada
        1 -> Hacer una receta
        2 -> Ver mis recetas
        3 -> Salir
    """.trimIndent()


    do {
        //mostrar el menu
        println("$menu")
        val opcionMenu : String? = readLine()
        when(opcionMenu) {
            "1" -> hacerUnaReceta()
            "2" -> println(recetas.toString())
            "3" -> println("Gracias!")
            else -> println("Opcion invalida")
        }
    }while ( opcionMenu != "3" )


}

fun hacerUnaReceta () {
    var mutableList: MutableList<String> = mutableListOf()
    val valores : List<String> = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    val opcionesIngredientes : String = """
       1- Agua
       2-Leche
       3- Carne
       4-Verduras
       4- Frutas
       6-Cereal
       7-Huevos
       8-Aceite
       0-Finalizar
    """.trimIndent()

    do {
        //mostrar el menu
        println("$opcionesIngredientes")
        val opcionMenu : String? = readLine()
        when(opcionMenu) {
            "1","2","3","4","5","6","7","8" ->
                mutableList.add(valores.get(opcionMenu!!.toInt().minus(1)))
            "0" -> println("Gracias!")
            else -> println("Opcion invalida")
        }
    }while ( opcionMenu != "0" )

    recetas.add(mutableList)

}







