import IntWrapper._


object Main extends App {
  val v:Vehicle=Vehicle.apply(500, "Ab", x=> x/100*10)
  val s:SeasonalVehicle=Vehicle.apply(500, "BC", 4,1 , (x,y)=> x/100*2+y)
  println(v+10)
  println(10+v)
  println(v.getKfzSteuer())
  println(s)
  println(s.getKfzSteuer())
}
