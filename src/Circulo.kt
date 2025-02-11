class Circulo(val radio: Double, color: String): Figura(color) {

    override fun obtenerPerimetro(): Double {
        return 2 * Math.PI * radio
    }

    override fun obtenerArea(): Double {
        return Math.PI * (radio * radio)
    }
}