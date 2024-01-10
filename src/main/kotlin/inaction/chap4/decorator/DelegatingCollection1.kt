package inaction.chap4.decorator

class DelegatingCollection1<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int = innerList.size
    override fun isEmpty(): Boolean = innerList.isEmpty()
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}