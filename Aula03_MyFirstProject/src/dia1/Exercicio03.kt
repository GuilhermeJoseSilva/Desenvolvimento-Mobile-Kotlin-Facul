package dia1

fun main(){
    var distancia: Double;
    var cobustivel: Double;
    var mediaConsumo: Double;



    do {
        do {
            distancia = getValor("Digite a distancia percorrida em km:");
        }while (!isNumeroInteiro(distancia));
        if (distancia > 0){
                do {
                    cobustivel = getValor("Digite o valor do combustivel em litros: ")

                }while (!isNumeroInteiro(cobustivel) ||cobustivel<=0)

            mediaConsumo = distancia/cobustivel;
            println("A médiade consumo de combustivel é %.2f km/l".format(mediaConsumo));
        }
    }while (distancia >0)

}


fun getValor(msg: String): Double{
    print(msg);
    val valor = readln()!!.toDouble();
    return valor;
}

fun isNumeroInteiro(numero: Double): Boolean{
    return (numero%1)==0.0;
}