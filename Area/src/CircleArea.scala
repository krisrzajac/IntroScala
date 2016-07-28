case class CircleArea(radius:Double) extends AreaCommand{
  def execute() : Double = 
  {
    2*radius * math.Pi 
  }
}