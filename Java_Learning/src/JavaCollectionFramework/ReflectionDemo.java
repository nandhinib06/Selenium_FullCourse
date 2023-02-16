package JavaCollectionFramework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		ReflectionDemo rd = new ReflectionDemo();
		/*rd.openBrowser();
		rd.lanchURL();
		rd.login();
		rd.takeScreenshot();
		rd.close();
		*/
		Method[] methods = rd.getClass().getMethods();
		for(int i=0; i<methods.length;i++) {
			if(methods[i].getName().equals("lanchURL")) {
				methods[i].invoke(rd, null);
			}
		}

	}
public void openBrowser() {
	System.out.println("Browser opened");
}
public void lanchURL() {
	System.out.println("URL lanched");
}
public void login() {
	System.out.println("login successfully");
}
public void takeScreenshot() {
	System.out.println("Screenshot captured");
}
public void close() {
	System.out.println("Browser closed");
}
}
