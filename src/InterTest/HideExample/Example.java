package InterTest.HideExample;

public class Example {
	  private class InsideClass implements InterfaceTest

	    {
	         public void test()
	         {
	             System.out.println("����һ������");
	         }
	    }

	    public InterfaceTest getIn()
	    {
	        return new InsideClass();
	    }
}
