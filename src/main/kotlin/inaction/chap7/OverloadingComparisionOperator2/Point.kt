package inaction.chap7.OverloadingComparisionOperator2

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true // 최적화: 파라미터가 this 와 같은 객체인지 확인
        if (other !is Point) return false // 파라미터 타입 검사
        return other.x == x && other.y == y // Point 로 smart cast 해서 x 와 y 프로퍼티에 접근
    }

    override fun hashCode(): Int = x.hashCode() * 31 + y.hashCode()
}

