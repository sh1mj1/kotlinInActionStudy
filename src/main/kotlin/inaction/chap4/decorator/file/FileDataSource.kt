package inaction.chap4.decorator.file

import java.io.File

class FileDataSource(val fileName: String) : DataSource {
    override fun writeData(data: String) = File(fileName).outputStream().use { it.write(data.toByteArray()) }
    override fun readData(): String =
        File(fileName).inputStream().bufferedReader().use { it.readText() }
}