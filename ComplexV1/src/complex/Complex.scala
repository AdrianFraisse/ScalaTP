package complex

/**
 * Created by Adrian on 03/04/15.
 */
trait Complex extends CartesianPolar with ComplexField {
  def create(real: Double, imag: Double): Complex
  def create(radius: Double, azimuth: Angle): Complex
}
