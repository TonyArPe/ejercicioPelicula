class Pelicula(val codigo: Int, val nombre: String, val anno: Int) : this(){
    this.codigo = codigo
    this.nombre = nombre
    this.anno = anno

    override fun toString(): String{
        return "CODIGO: $codigo, NOMBRE: $nombre, AÑO: $anno"
    }
}

fun main()class Pelicula(val codigo: Int, val nombre: String, val anno: Int) {
    override fun toString(): String {
        return "CODIGO: $codigo, NOMBRE: $nombre, AÑO: $anno"
    }
}

fun main() {
    val mapeoPeliculas = mutableMapOf<Int, Pelicula>()
    var siguienteCodigo = 1

    while (true) {
        println("\nMENU:")
        println("1. Insertar una nueva película")
        println("2. Mostrar una película por su código")
        println("3. Buscar una película por su código")
        println("4. Borrar una película por su código")
        println("5. Editar una película")
        println("6. Mostrar listado de películas")
        println("7. Salir")
        print("Seleccione una opción: ")

        val eleccion = readLine()?.toIntOrNull() ?: 0

        when (elección) {
            1 -> {
                println("Inserte los datos de la película:")
                print("Nombre: ")
                val nombre = readLine() ?: ""
                print("Codigo: ")
                val codigo = readLine()?.toIntOrNull() ?: 0
                print("Año: ")
                val año = readLine()?.toIntOrNull() ?: 0

                val pelicula = Pelicula(codigo, nombre, año)
                mapeoPeliculas[siguienteCodigo] = pelicula
                siguienteCodigo++
                println("Película insertada con éxito.")
            }

            2 -> {
                print("Ingrese el código de la película: ")
                val codigo = readLine()?.toIntOrNull() ?: 0

                val pelicula = mapeoPeliculas[codigo]
                if (pelicula != null) {
                    println("Película encontrada:")
                    println(pelicula)
                } else {
                    println("Película no encontrada.")
                }
            }

            3 -> {
                print("Ingrese el código de la película a buscar: ")
                val codigo = readLine()?.toIntOrNull() ?: 0

                val pelicula = mapeoPeliculas[codigo]
                if (pelicula != null) {
                    println("Película encontrada:")
                    println(pelicula)
                } else {
                    println("Película no encontrada.")
                }
            }

            4 -> {
                print("Ingrese el código de la película a borrar: ")
                val codigo = readLine()?.toIntOrNull() ?: 0

                val pelicula = mapeoPeliculas.remove(codigo)
                if (pelicula != null) {
                    println("Película eliminada:")
                    println(pelicula)
                } else {
                    println("Película no encontrada.")
                }
            }

            5 -> {
                print("Ingrese el código de la película a actualizar: ")
                val codigo = readLine()?.toIntOrNull() ?: 0

                val pelicula = mapeoPeliculas[codigo]
                if (pelicula != null) {
                    println("Editar película:")
                    print("Nuevo título (${pelicula.nombre}): ")
                    val nuevoNombre = readLine() ?: pelicula.nombre
                    print("Nuevo Año (${pelicula.anno}): ")
                    val nuevoAnno = readLine()?.toIntOrNull() ?: pelicula.anno

                    val peliculaActualizada = Pelicula(codigo, nuevoNombre, nuevoAnno)
                    mapeoPeliculas[codigo] = peliculaActualizada
                    println("Película actualizada con éxito.")
                } else {
                    println("Película no encontrada.")
                }
            }

            6 -> {
                println("Listado de películas:")
                mapeoPeliculas.forEach { (codigo, pelicula) ->
                    println("$codigo: $pelicula")
                }
            }

            7 -> {
                println("Saliendo del programa. ¡Hasta luego!")
                return
            }

            else -> println("Opción no válida. Por favor, seleccione una opción válida.")
        }
    }
}



