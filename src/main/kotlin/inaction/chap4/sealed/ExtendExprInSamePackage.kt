package inaction.chap4.sealed

// 같은 패키지에서 Expr 를 확장
class ExtendExprInSamePackage(val someField1: Int) : Expr() {}

// 같은 패키지의 어떤 클래스 내부에서 Expr 를 확장
class SomeClass(val someField2: Int) {
    class ExtendExprInSomeClass(val someField3: Int) : Expr() {

    }
}