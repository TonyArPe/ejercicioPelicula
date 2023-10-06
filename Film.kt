class Pelicula(
    val codigo: Int,
    var titulo: String,
    var director: String,
    var anio: Int
) {
    constructor(codigo: Int, titulo: String) : this(codigo, titulo, "", 0)

    override fun toString(): String {
        return "Código: $codigo\nTítulo: $titulo\nDirector: $director\nAño: $anio"
    }
}

    fun main() {
        val peliculas = mutableMapOf<Int, Pelicula>()
        var codigoCounter = 1
    
        while (true) {
            println("\nMenú:")
            println("1. Insertar nueva película")
            println("2. Mostrar película por código")
            println("3. Buscar película por código")
            println("4. Borrar película por código")
            println("5. Editar película")
            println("6. Salir")
            print("Seleccione una opción: ")
    
            val opcion = readLine()?.toIntOrNull()
    
            when (opcion) {
                1 -> {
                    print("Ingrese el título de la película: ")
                    val titulo = readLine() ?: ""
                    val pelicula = Pelicula(codigoCounter, titulo)
                    peliculas[codigoCounter] = pelicula
                    codigoCounter++
                    println("Película agregada con éxito.")
                }
                2 -> {
                    print("Ingrese el código de la película: ")
                    val codigo = readLine()?.toIntOrNull() ?: 0
                    val pelicula = peliculas[codigo]
                    if (pelicula != null) {
                        println(pelicula)
                    } else {
                        println("Película no encontrada.")
                    }
                }
                3 -> {
                    print("Ingrese el código de la película: ")
                    val codigo = readLine()?.toIntOrNull() ?: 0
                    val pelicula = peliculas[codigo]
                    if (pelicula != null) {
                        println("Película encontrada:\n${pelicula}")
                    } else {
                        println("Película no encontrada.")
                    }
                }
                4 -> {
                    print("Ingrese el código de la película a borrar: ")
                    val codigo = readLine()?.toIntOrNull() ?: 0
                    if (peliculas.remove(codigo) != null) {
                        println("Película eliminada con éxito.")
                    } else {
                        println("Película no encontrada.")
                    }
                }
                5 -> {
                    print("Ingrese el código de la película a editar: ")
                    val codigo = readLine()?.toIntOrNull() ?: 0
                    val pelicula = peliculas[codigo]
                    if (pelicula != null) {
                        print("Nuevo título (Enter para mantener el actual): ")
                        val nuevoTitulo = readLine() ?: pelicula.titulo
                        print("Nuevo director (Enter para mantener el actual): ")
                        val nuevoDirector = readLine() ?: pelicula.director
                        print("Nuevo año (Enter para mantener el actual): ")
                        val nuevoAnio = readLine()?.toIntOrNull() ?: pelicula.anio
    
                        peliculas[codigo] = Pelicula(codigo, nuevoTitulo, nuevoDirector, nuevoAnio)
                        println("Película editada con éxito.")
                    } else {
                        println("Película no encontrada.")
                    }
                }
                6 -> {
                    println("¡Hasta luego!")
                    return
                }
                else -> {
                    println("Opción no válida. Por favor, elija una opción del menú.")
                }
            }
        }
    }
    