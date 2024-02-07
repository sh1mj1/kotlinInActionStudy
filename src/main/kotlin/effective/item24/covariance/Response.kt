package effective.item24.covariance

// covariant 사용의 좋은 예
sealed class Response<out R, out E>
class Failure<out E>(val error: E) : Response<Nothing, E>()
class Success<out R>(val value: R) : Response<R, Nothing>()