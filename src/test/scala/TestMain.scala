import org.scalatest.FunSuite

class TestMain extends FunSuite {
  
  test("Bill generated should calculate how much Cola is"){
    assert(main.generateBill("Cola") == 0.5) 
  }
}
