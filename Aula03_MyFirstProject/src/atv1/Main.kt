package atv1

fun Main(){
    val biblioteca = Biblioteca()
    var continuar = true

    println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca!")

    while (continuar) {
        println("Digite o comando desejado:")
        println("1. Adicionar um novo livro")
        println("2. Exibir todos os livros")
        println("3. Remover um livro pelo título")
        println("4. Mostrar o total de livros disponíveis")
        println("5. Sair")
        print("Escolha uma opção: ")

        when (readLine()) {
            "1" -> {
                print("Digite o título do livro: ")
                val titulo = readLine()!!
                print("Digite o autor do livro: ")
                val autor = readLine()!!
                print("Digite o ano de publicação: ")
                val anoPublicacao = readLine()!!.toInt()
                biblioteca.adicionarLivro(titulo, autor, anoPublicacao)
            }
            "2" -> biblioteca.exibirTodos()
            "3" -> {
                print("Digite o título do livro a ser removido: ")
                val titulo = readLine()!!
                biblioteca.removerLivroTitulo(titulo)
            }
            "4" -> biblioteca.mostrarTotalLivros()
            "5" -> {
                println("Encerrando o programa...")
                continuar = false
            }
            else -> println("Opção inválida. Tente novamente.")
        }

        println("-----------------------------------------------")
    }

}


data class Livro(val titulo:String, val autor:String, val anoPubli:Int){
    fun exibirInformacoes(){
        println("Titulo: $titulo, Autor:$autor, Ano de Publicação: $anoPubli")
    }
}

class Biblioteca{
    private val acervo = mutableListOf<Livro>()

    fun adicionarLivro(titulo: String,autor: String,anoPubli: Int){
        val livro = Livro(titulo, autor, anoPubli)
        acervo.add(livro)
        println("livro adicionado com sucesso!")
    }

    fun exibirTodos(){
        if(acervo.isEmpty()){
            println("Nenhum livro cadastrado....")
        }else{
            acervo.forEach {livro ->
                livro.exibirInformacoes()
            }
        }
    }

    fun removerLivroTitulo(titulo: String){
       val livroRemovido = acervo.removeIf {it.titulo.equals(titulo, ignoreCase = true)}
            if (livroRemovido){
                println("Livro removido com sucesso!")
            }else{
                println("Livro com titulo: $titulo não existe...")
            }
    }

    fun mostrarTotalLivros(){
        println("Total de livros disponíveis: ${acervo.size}")
    }



}