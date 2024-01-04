package inaction.chap4

open class RichButton : Clickable {
    fun disable() {} // final - override 불가
    open fun animate() {} // open - override 가능
    override fun click() {} // 오버라이드 함수 - 기본적으로 override 가능
}