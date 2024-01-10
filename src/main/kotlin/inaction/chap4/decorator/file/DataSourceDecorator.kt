package inaction.chap4.decorator.file

open class DataSourceDecorator(
    val dataSource: DataSource,
) : DataSource by dataSource