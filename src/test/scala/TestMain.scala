import org.scalatest.FunSuite

class TestMain extends FunSuite {
  
  test("Bill generated should calculate how much Cola is"){
    assert(main.generateBill("Cola") == 0.5) 
  }
  
  test("Bill generated should calculate how much Coffee is"){
    assert(main.generateBill("Coffee") == 1) 
  }
  
  test("Bill generated should calculate how much a Cheese Sandwich is"){
    assert(main.generateBill("Cheese Sandwich") == 2) 
  }
  
  test("Bill generated should calculate how much a Steak Sandwich is"){
    assert(main.generateBill("Steak Sandwich") == 4.5) 
  }
  
  test("Bill generated should calculate the sum of multiple items"){
    assert(main.generateBill("Steak Sandwich", "Cola", "Coffee") == 6) 
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
  
}
