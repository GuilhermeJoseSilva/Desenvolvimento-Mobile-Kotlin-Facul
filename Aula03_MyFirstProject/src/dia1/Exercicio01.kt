package dia1
    fun main() {
        var precoOriginal: Double = 0.00;
        var porcentagem: Double = 0.00;
        var desconto: Double;
        var precoFinal: Double;

        val pessoa = Pessoa("vasco", 20);
        pessoa.apresentar();
/*
        do {
            print("Digite o preço do produto (0 para finalizar)");
            precoOriginal = readLine()!!.toDouble();

            if (precoOriginal > 0) {
                print("Digite a porcentagem de desconto: ");
                porcentagem = readLine()!!.toDouble();
                desconto = precoOriginal * (porcentagem / 100);
                precoFinal = precoOriginal - desconto;
                println("Preço com desconto: $precoFinal");
                println("Preço sem desconto: $precoOriginal");
            }
        } while (precoOriginal > 0);
    }

*/
    }
