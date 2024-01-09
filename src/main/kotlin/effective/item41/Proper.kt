package effective.item41

class Proper(val name: String) {
    override fun equals(other: Any?): Boolean {
        equalsCounter++
        return other is Proper && name == other.name
    }
    override fun hashCode(): Int {
        return name.hashCode()
    }
    companion object {
        var equalsCounter = 0 // equals 가 호출되는 횟수 확인하기
    }
}

