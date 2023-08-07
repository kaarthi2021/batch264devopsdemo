package devopssample;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Test1 {

	@Test
	public void method1()
	{
		System.out.println("first java program to push in github");
		Reporter.log("hi am using for the first time reporter");
		System.out.println("changed code in master branch");
		System.out.println("code changed in github master branch");
		System.out.println("this is aswani Changed code as collaborator ");
	}
}
