/* De esta forma, estamos sobreescribiendo los getters y setters.
1.- Cuando
* definimos el constructor por defecto, no se llaman los setters. Se utilizan
* la inicialización de var name : String?null y la de var edad : Int = 0
2.-
* Cuando definimos el constructor secundario, recibimos los dos parámetros. Se
* debe
delegar con this al constructor por defecto, los parámetros que
* queramos. Al delegar al this, nos
damos cuenta que primero actúa la
* inicialización del constructor por defecto y después la del
secundario con la
* actuación de los setters.
*/

public class PersonaGetSet() {
    // define ya su constructor por defecto con los ()
    // ----------------------------propiedad
    // nombre------------------------------------
    var name: String ?= null //para el constructor por defecto. Sin parámetros.
    set(value) { //setters
        if (value != null) {
            if (value.isEmpty()) {
                println("El valor debe contener texto")
            } else {
                field = value
            }
        } else {
            println("Has pasado un null al nombre y no esta permitido")
        }
    }
    get() {
        field
            ?.let {return field}?
        : run {
            return "<Sin nombre>"
        }
    } //getter
//----------------------------propiedad edad------------------------------------
var age: Int = 0 //para el constructor por defecto. Sin parámetros.
set(value) {
    if (value >= 18) 
        field = value
    else 
        field = 0
}
get() = field constructor(_name : String?, _age: Int): this() {
    /* Cuando se modifican los parámetros, se llaman directamente a los setters. */
    name = _name
    age = _age
}
}