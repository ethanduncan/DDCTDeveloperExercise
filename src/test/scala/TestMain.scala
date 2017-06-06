import org.scalatest.FunSuite

class TestMain extends FunSuite {
  
  test("Bill generated should calculate how much Cola is"){
    assert(main.generateBill("Cola") == 0.5) 
  }
  
  test("Bill generated should calculate how much Coffee is"){
    assert(main.generateBill("Coffee") == 1) 
  }
  
  test("Bill generated should calculate how much a Cheese Sandwich is"){
    assert(main.generateBill("Cheese Sandwich") == 2.2) 
  }
  
  test("Bill generated should calculate how much a Steak Sandwich is"){
    assert(main.generateBill("Steak Sandwich") == 5.4) 
  }
  
  test("Bill generated should calculate the sum of multiple items"){
    assert(main.generateBill("Steak Sandwich", "Cola", "Coffee") == 7.2) 
  }
  
  test("Bill generated should calculate a bill with multiple of the same item"){
    assert(main.generateBill("Coffee","Coffee") == 2) 
  }
  
  test("Bill generated should handle no inputs"){
    assert(main.generateBill() == 0) 
  }
  
  test("Bill generated should handle wrong inputs"){
    assert(main.generateBill("Mars bar") == 0) 
  }
  
  test("Bill generated should apply no service charge to drinks only bill"){
    assert(main.generateBill("Coffee", "Cola") == 1.50) 
  }
  
  test("Bill generated should apply a service charge of 10% to any bill including drinks and cold food"){
    assert(main.generateBill("Cola","Cheese Sandwich") == 2.75) 
  }
  
  test("Bill generated should apply a service charge of 20% to bill including hot food"){
    assert(main.generateBill("Cola","Steak Sandwich") == 6) 
  }
  
}
