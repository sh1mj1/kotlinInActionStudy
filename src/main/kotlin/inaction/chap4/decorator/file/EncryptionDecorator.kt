package inaction.chap4.decorator.file

import java.util.*

class EncryptionDecorator(dataSource: DataSource) : DataSourceDecorator(dataSource) {
    override fun writeData(data: String) = super.writeData(encode(data))
    override fun readData(): String = decode(super.readData())
    private fun encode(data: String): String {
        val result = data.toByteArray().map { (it + 1).toByte() }.toByteArray()
        return Base64.getEncoder().encodeToString(result)
    }
    private fun decode(data: String): String {
        val result = Base64.getDecoder().decode(data).map { (it - 1).toByte() }.toByteArray()
        return String(result)
    }
}