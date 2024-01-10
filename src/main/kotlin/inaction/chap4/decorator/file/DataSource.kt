package inaction.chap4.decorator.file

interface DataSource {
    fun writeData(data: String)
    fun readData(): String
}