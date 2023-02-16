package TestNG;

import org.testng.annotations.Test;

public class Grouping_Testng {
	
	@Test(groups = {"fruits"})
	public void fruits(){
		
	 System.out.println("FRUITS");
	 
	}
	@Test(groups = {"Nuts"})
	public void Nuts(){
		
		 System.out.println("NUTS");
		 
		}
	@Test(groups = {"Seeds"})
	public void Seeds(){
		
		 System.out.println("SEEDS");
		 
		}
	
	@Test(groups = {"Mojito"})
	public void mojito(){
		
		 System.out.println("Mojito");
		 
		}
   @Test(groups = {"pizza"})
	public void pizza(){
		
		 System.out.println("pizza");
		 
		}
   
   @Test(groups = {"fruits"})
	public void fruits2(){
		
		 System.out.println("FRUITS2");
		 
		}
	@Test(groups = {"Nuts"})
	public void Nuts2(){
		
		 System.out.println("NUTS2");
		 
		}
	
	@Test(groups = {"Seeds"})
	public void Seeds2(){
		
		 System.out.println("SEEDS2");
		 
		}
}
