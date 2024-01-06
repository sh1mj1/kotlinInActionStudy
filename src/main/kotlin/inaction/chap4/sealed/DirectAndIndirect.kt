package inaction.chap4.sealed

sealed interface Error

sealed class IOError(): Error // 같은 모듈, 패키지에서 확장 가능
open class CustomError(): Error // 어디든 확장 가능
