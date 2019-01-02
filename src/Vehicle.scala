 class Vehicle private(val hubraum: Int, val kennzeichen: String, SteuerF: (Int) => Int) {
  require(hubraum >0 && kennzeichen !=null &&kennzeichen!="")

  def this(hubraum: Int, kennzeichen: String)={
    this(hubraum, kennzeichen, x => x/100*5)
  }

  def getKfzSteuer() : Int ={
    SteuerF(hubraum)
  }

  override def  toString():String={

    "Das Auto mit dem Kennzeichen "+ kennzeichen + " besitzt "+ hubraum+ " ccm"
  }

  def+(v:Int) =new Vehicle(hubraum+v, kennzeichen, SteuerF)
   def+:(v:Int)=new Vehicle(hubraum+v, kennzeichen, SteuerF)

}
object Vehicle{
  def apply (h:Int, k:String, s:(Int)=>Int)=new Vehicle (h,k,s)
  def apply (h:Int, k:String) = new Vehicle (h,k)
  def apply (h:Int, k:String, start:Int, end:Int ,s:(Int, Int)=>Int)=new SeasonalVehicle(h,k,start,end,s)
  def apply (h:Int, k:String, start:Int, end:Int)=new SeasonalVehicle(h,k,start,end)
}

