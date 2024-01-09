package effective.item41

class Terrible(val name: String) {
    override fun equals(other: Any?): Boolean {
        equalsCounter++
        return other is Terrible && name == other.name
    }
    override fun hashCode(): Int = 0 // BAD CODE
    companion object {
        var equalsCounter = 0 // equals 가 호출되는 횟수 확인하기
    }
}