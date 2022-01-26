package ejercicio1
/*
 * Fecha: 26/01/2022
 * Version: 1.5
 * Autor: José Flor González
 * Empresa/Entidad: IES Rafael Alberti
 * Proyecto: Act4_T2_JFG
 */

/**
 * Devuelve suspenso si el valor es <5
 *          aprobado si el valor está entre 5 y 7
 *          notable si el valor está entre 7 y 9
 *          sobresaliente si el valor está entre 9 y 10
 */

fun calification(nota: Float): String {
    return when {
        nota < 5.0F -> { "Suspenso" }
        (nota >= 5.0F && nota < 7.0F) -> { "Aprobado" }
        (nota >= 7.0F && nota < 9.0F)-> { "Notable" }
        (nota in 9.0F..10.0F) -> { "Sobresaliente" }
        else -> { "El valor introducido no es correcto" }
    }
}

fun main() {
    println(calification(2.0F))
    println(calification(5.0F))
    println(calification(7.0F))
    println(calification(8.0F))
    println(calification(9.0F))
    println(calification(10.0F))
    println(calification(25.0F))

}