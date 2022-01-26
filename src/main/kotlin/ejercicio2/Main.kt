package ejercicio2
/*
 * Fecha: 26/01/2022
 * Version: 1.5
 * Autor: José Flor González
 * Empresa/Entidad: IES Rafael Alberti
 * Proyecto: Act4_T2_JFG
 */

fun generaArray(): Array<Int> {
    return Array<Int>(20) { (1..1000).random() }
}

/**
 * Esta funcion ordena el array por su orden natural e imprime el primer y último valor además de la suma de todos los valores
 */
fun ordenaArray(array: Array<Int>): String {
    val arrayOrdenado = array.sorted()
    return "\nPrimer valor: " + arrayOrdenado.first() + "\nUltimo valor: " + arrayOrdenado.last() + "\nSuma de los valores: "+ arrayOrdenado.sum()
}


/**
 * Función que cambia los valores impares de un array a -1 y devuelve el array sin estos valores.
 * El tamaño del array puede cambiar dependiendo del número de valores impares
 */
fun borraImpares(array: Array<Int>): List<Int> {
    for (i in array.indices) {
        if(array[i]%2 != 0) {
            array[i] = -1
        }
    }
    return array.filter { it%2 == 0 }.sorted()
}


fun main() {
    val array = generaArray()
    print("Numeros Pares: ")
    array.forEach {
        if ((it % 2) == 0) {
            print("$it ")
        }
    }
    println(ordenaArray(array))
    println(borraImpares(array))


}