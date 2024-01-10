package inaction.chap4.decorator.file

import org.junit.jupiter.api.Test

class DataSourceTest {
    @Test
    fun testDataSource() {
        val salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000"

        val encoded = CompressionDecorator(EncryptionDecorator(FileDataSource("out/OutputDemo.txt")))
        encoded.writeData(salaryRecords)
        val plain = FileDataSource("out/OutputDemo.txt")

        println("- Input ----------------")
        println(salaryRecords)
        println()

        println("- Encoded --------------")
        println(plain.readData())
        println()

        println("- Decoded --------------")
        println(encoded.readData())
    }
}