class Rectangulo(val base: Double, val altura: Double, color: String): Figura(color) {

    override fun obtenerPerimetro(): Double {
        return (2 * base) + (2 * altura)
    }

    override fun obtenerArea(): Double {
        return base * altura
    }
}