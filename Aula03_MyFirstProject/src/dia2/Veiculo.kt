package dia2

open class Veiculo(val marca:String, val ano:Int) {
    open fun exibirInformacoes(){
        println("Marca: $marca\nAno:$ano")
    }
}