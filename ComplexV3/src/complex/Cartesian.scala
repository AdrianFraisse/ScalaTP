package complex

/**
 * Created by Adrian on 03/04/15.
 */
trait Cartesian {
  def real: Double
  def imag: Double

  def +(c: Complex): Complex =
    Complex(real + c.real, imag + c.imag)

  def oppose() : Complex =
    Complex(real, -imag)

}
