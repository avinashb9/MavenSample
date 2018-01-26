package modules;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test1 {
	@Test
	  public void ADD() {
		  System.out.println("ADD");
		  int a = 60;
		  int b = 70;
		  Assert.assertEquals(130,a+b);
	  }
	  
	  @Test
	  public void SUB() {
		  System.out.println("SUB");
		  int a = 70;
		  int b = 60;
		  Assert.assertEquals(10,a-b);
	  }
	  
	  @Test
	  public void MUL() {
		  System.out.println("SUB");
		  int a = 70;
		  int b = 60;
		  Assert.assertEquals(4200,a*b);
	  }
	  
	  @Test
	  public void DIV() {
		  System.out.println("SUB");
		  int a = 70;
		  int b = 60;
		  Assert.assertEquals(10,a-b);
	  }
}
