import org.scalatest.FunSuite

class TestMain extends FunSuite {
  
  test("Bill generated should calculate how much Cola is"){
    assert(main.generateBill("Cola") == "(Cola) returns 0.5") 
  }
  
  test("Bill generated should calculate how much Coffee is"){
    assert(main.generateBill("Coffee") == "(Coffee) returns 1.0") 
  }
  
  test("Bill generated should calculate how much a Cheese Sandwich is"){
    assert(main.generateBill("Cheese Sandwich") == "(Cheese Sandwich) returns 2.2") 
  }
  
  test("Bill generated should calculate how much a Steak Sandwich is"){
    assert(main.generateBill("Steak Sandwich") == "(Steak Sandwich) returns 5.4") 
  }
  
  test("Bill generated should calculate the sum of multiple items"){
    assert(main.generateBill("Steak Sandwich", "Cola", "Coffee") == "(Steak Sandwich, Cola, Coffee) returns 7.2") 
  }
  
  test("Bill generated should calculate a bill with multiple of the same item"){
    assert(main.generateBill("Coffee","Coffee") == "(Coffee, Coffee) returns 2.0") 
  }
  
  test("Bill generated should handle no inputs"){
    assert(main.generateBill() == "List() returns 0.0") 
  }
  
  test("Bill generated should handle wrong inputs"){
    assert(main.generateBill("Mars bar") == "(Mars bar) returns 0.0") 
  }
  
  test("Bill generated should apply no service charge to drinks only bill"){
    assert(main.generateBill("Coffee", "Cola") == "(Coffee, Cola) returns 1.5") 
  }
  
  test("Bill generated should apply a service charge of 10% to any bill including drinks and cold food"){
    assert(main.generateBill("Cola","Cheese Sandwich") == "(Cola, Cheese Sandwich) returns 2.75") 
  }
  
  test("Bill generated should apply a service charge of 20% to bill including hot food"){
    assert(main.generateBill("Cola","Steak Sandwich") == "(Cola, Steak Sandwich) returns 6.0") 
  }
  
  test("Bill generated should apply a service charge of a maximum of £20"){
//    hungry customer
    assert(main.generateBill("Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich",
        "Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich",
        "Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich",
        "Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich") 
        =="(Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich, Steak Sandwich) returns 123.5") 
  }
}
