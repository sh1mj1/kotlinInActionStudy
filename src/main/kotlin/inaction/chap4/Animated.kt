package inaction.chap4

abstract class Animated { // 추상 클래스 -> 이 클래스의 인스턴스를 만들 수 없다.
    abstract fun animate() // 추상 함수 -> 구현이 없고 하위 클래스에서 반드시 override

    // 추상 클래스의 멤버여도 일반 함수는 기본적으로 final. 원한다면 open 으로 가능
    open fun stopAnimating() {}
    fun animateTwice() {}
}
