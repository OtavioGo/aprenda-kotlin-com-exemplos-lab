// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

data class Usuario(val nome: String,val id: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String,val nivel: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        println (inscritos)
    }
}
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
fun NivelChoice() {
    val formacao: Formacao.nivel
    val message = when (formacao) { 
        Nivel.BASICO -> "É Básico"
        Nivel.INTERMEDIARIO -> "É Intermediario"
        Nivel.AVANCADO -> "É Avançado"
    }
}

fun main() {
    
    val formacao: Formacao("Otavio", "INTERMEDIARIO", "Android")
}