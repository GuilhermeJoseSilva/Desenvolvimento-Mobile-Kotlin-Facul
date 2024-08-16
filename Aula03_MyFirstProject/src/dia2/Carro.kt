package dia2

class Carro(marca: String, ano:Int, val numPortas:Int) : Veiculo(marca,ano){
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        print("Numero de portas: $numPortas")
    }
}
