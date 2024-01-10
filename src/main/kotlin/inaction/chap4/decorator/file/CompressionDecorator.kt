package inaction.chap4.decorator.file

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.*
import java.util.zip.Deflater
import java.util.zip.DeflaterOutputStream
import java.util.zip.InflaterInputStream

class CompressionDecorator(source: DataSource) : DataSourceDecorator(source) {
    private var compLevel = 6
    override fun writeData(data: String) = super.writeData(compress(data))
    override fun readData(): String = decompress(super.readData())
    private fun compress(data: String): String {
        val bos = ByteArrayOutputStream()
        DeflaterOutputStream(bos, Deflater(compLevel)).use { it.write(data.toByteArray()) }
        return Base64.getEncoder().encodeToString(bos.toByteArray())
    }
    private fun decompress(data: String): String {
        val bytes = Base64.getDecoder().decode(data)
        val ios = InflaterInputStream(ByteArrayInputStream(bytes))
        return ios.bufferedReader().use { it.readText() }
    }
}