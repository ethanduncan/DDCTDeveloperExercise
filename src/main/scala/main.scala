
object main {
    
    //input a list of items and add total price
    def generateBill(strings:String*):Double = {    
      val menuItems = initialiseMenu
      val items = 
      for{
        a<-strings
        b<-menuItems
        if a == b.name
      } yield(b)
           
      val totalBill = {
        val priceWithOutService = items.map(_.price).sum
        val serviceChargeRate:Int = getServiceChargeRate(items)
        val serviceChargeAmount = (priceWithOutService/100)*serviceChargeRate
        if(serviceChargeAmount<=20.00 | serviceChargeAmount == 0)
          priceWithOutService+serviceChargeAmount
        else
          priceWithOutService+20
      }
      BigDecimal(totalBill).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
    //returns service charge
    def getServiceChargeRate(items:Seq[MenuItem]):Int = {
      val foodOrDrink = items.exists(_.foodOrDrink == true)
      val hotOrCold = items.exists(_.hotOrCold == true)
      def checkItemAttributes(foodOrDrink:Boolean,bool2:Boolean):Int = (foodOrDrink, hotOrCold) match {
        case (true,true) => 20
        case (true,_) => 10
        case (_,_) => 0
      }
      checkItemAttributes(foodOrDrink,hotOrCold)
    }   
    //create items and add to list 
    def initialiseMenu = {
      val cola = MenuItem("Cola",0.5,false,false)
      val coffee = MenuItem("Coffee",1,false,true)
      val cheeseSandwich =  MenuItem("Cheese Sandwich",2,true,false)
      val steakSandwich =  MenuItem("Steak Sandwich",4.5,true,true)
      List(cola,coffee,cheeseSandwich,steakSandwich)     
    }
 
}
