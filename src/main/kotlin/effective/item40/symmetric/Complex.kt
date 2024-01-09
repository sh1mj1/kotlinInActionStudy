package effective.item40.symmetric

class Complex(val real: Double, val imaginary: Double) {
    override fun equals(other: Any?): Boolean {
        if (other is Double) {
            return imaginary == 0.0 && real == other
        }
        return other is Complex &&
                real == other.real &&
                imaginary == other.imaginary
    }
}