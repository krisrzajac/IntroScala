case class TriangleArea(height:Double, width:Double)extends AreaCommand
{
  def execute = 
  {
    (height*width)/2
  }

}