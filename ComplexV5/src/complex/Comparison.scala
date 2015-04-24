package complex

/**
 * Created by Adrian on 03/04/15.
 */
object Comparison {
  val precision: Double = 1E-15

  def isEqual(x: Double, y: Double): Boolean =
    Math.abs(x - y) < precision
}
