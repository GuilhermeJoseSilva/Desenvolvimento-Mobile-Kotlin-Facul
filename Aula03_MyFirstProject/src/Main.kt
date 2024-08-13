fun main() {
    while (true) {
        print("Digite o preço original do produto (ou um valor menor ou igual a zero para encerrar): ")
        val precoOriginalInput = readLine()
        val precoOriginal = precoOriginalInput?.toDoubleOrNull()

        if (precoOriginal == null || precoOriginal <= 0.0) {
            println("Preço inválido ou menor/igual a zero. Programa encerrado.")
            break
        }

        print("Digite a porcentagem de desconto: ")
        val percentualDescontoInput = readLine()
        val percentualDesconto = percentualDescontoInput?.toDoubleOrNull()

        if (percentualDesconto == null || percentualDesconto < 0.0) {
            println("Porcentagem de desconto inválida. Tente novamente.")
            continue
        }

        val valorDesconto = precoOriginal * (percentualDesconto / 100)

        val precoFinal = precoOriginal - valorDesconto

        println("Preço final após o desconto: R$ %.2f".format(precoFinal))
    }
}
