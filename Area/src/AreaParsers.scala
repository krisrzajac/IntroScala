import scala.util.parsing.combinator._
class AreaParsers extends RegexParsers {

  def command: Parser[AreaCommand] = circle | rectangle | triangle | failure("invalid expression")
  def circle: Parser[AreaCommand] =
    "circle" ~ number ^^
      {
        case "circle" ~ num => CircleArea(num)
      }
  def rectangle: Parser[AreaCommand] = 
   "rectangle" ~ number ~ number ^^
   {
    case "rectangle" ~ height ~ width => RectangleArea(height, width)
    
   }
  def  triangle: Parser[AreaCommand] =
  "triangle" ~ number ~ number ^^
  {
    case "triangle" ~ height ~ base => TriangleArea(height, base)
    
  }
  def number: Parser[Double] = """-?[0-9]+\.?[0-9]*""".r ^^
    {
      case n => n.toDouble

    }
    
}