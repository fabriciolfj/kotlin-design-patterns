import java.net.URL

//proxy é quando vc espera que ele faça algum, mas faz algum diferente provendo o mesmo resultado
fun main() {
    val cat = CatImage(
        "https://i.chzbgr.com/full/9026714368/hBB09ABBE/i-will-has-attention",
        "https://i.chzbgr.com/full/9026714368/hBB09ABBE/i-will-has-attention"
    )

    println(cat.image.size)
    println(cat.image.size)
}

//no caso acho que o proxy vai bater calcular o tamanho da url, no primeiro momento sim, ja no segundo ele pega na memoria (cache)
data class CatImage(
    val thumbnailUrl: String,
    val url: String
) {
    val image: ByteArray by lazy {
        println("Fetching image, please wait")
        // Read image as bytes
        URL(url).readBytes()
    }
}