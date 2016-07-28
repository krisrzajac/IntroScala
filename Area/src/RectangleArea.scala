 case class RectangleArea(height:Double, base:Double) extends AreaCommand{
   def execute: Double = 
   {
     height * base
     
   }
}