package effective.item23

interface Tree
class Birch : Tree
class Spruce : Tree

class Forest<T : Tree> {
    fun addTree(tree: T) {
        // ...
    }
}

class Forest2<T: Tree>{
    fun <ST:T> addTree(tree: ST) {
        // ...
    }
}