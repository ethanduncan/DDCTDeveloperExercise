
object main {
    
    //input a list of items and add total price
    def generateBill(strings:String*) = {    
      val menuItems = initialiseMenu
      val items = 
      for{
        a<-strings
        b<-menuItems
        if a == b.name
      } yield(b price)
      
      items.sum
    }
   
    // create items and add to list 
    def initialiseMenu = {
      val cola = MenuItem("Cola",0.5)
      val coffee = MenuItem("Coffee",1)
      val cheeseSandwich =  MenuItem("Cheese Sandwich",2)
      val steakSandwich =  MenuItem("Steak Sandwich",4.5)
      List(cola,coffee,cheeseSandwich,steakSandwich)     
    }
}
