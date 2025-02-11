class Triangulo(val lado1: Double, val lado2: Double, val lado3: Double, color: String): Figura(color) {

    override fun obtenerPerimetro(): Double {
        return lado1 + lado2 + lado3
    }

    override fun obtenerArea(): Double {
        return (1/4) * (Math.sqrt((4*(lado1 * lado1) * (lado2 * lado2))-((lado1*lado1)+(lado2*lado2)-(lado3*lado3))))
    }
}