/*
Ejemplo de clase Alumno, con una lista de objetos.
*/
private fun PruebaClasesIniciales() {
    var myAlum = Alumno()
    var myAlum2 = Alumno("1234", "Santi", 40, "953 45 76 56")
    var listAlum: MutableList<Alumno> = mutableListOf()
    listAlum.add(myAlum)
    listAlum.add(myAlum2)
    listAlum.add(Alumno("2222", "paco", 30, "953 55 33 22"))
    listAlum.add(Alumno("3222", "lucia", 30, "953 66 33 22"))
    listAlum.add(Alumno("4222", "antonio", 30, "953 77 33 22"))
    listAlum.add(Alumno("5222", "jose", 30, "953 44 88 22"))
    listAlum.forEach() {
        println("Alumno: $it")
    }
}