package iSH_sms_generic_Utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Itransform implements IAnnotationTransformer{

	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(iSH_sms_generic_Utilities.RetryImplementation.class);
		
	}
	
	
	
	
	

}
