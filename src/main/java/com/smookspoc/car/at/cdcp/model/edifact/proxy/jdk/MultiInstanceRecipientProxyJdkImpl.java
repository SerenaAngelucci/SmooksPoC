/**
 * 
 */
package com.smookspoc.car.at.cdcp.model.edifact.proxy.jdk;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.smookspoc.car.at.cdcp.model.edifact.proxy.MultiInstanceRecipient99;

/**
 * @author c012426
 * Proxy for multi instance objects
 */
public class MultiInstanceRecipientProxyJdkImpl implements InvocationHandler {
	
	private static final String NUMBERS_ONLY_REGEX = "\\d+"; 
	private static Pattern pattern;
	

	static{
		pattern = Pattern.compile(NUMBERS_ONLY_REGEX);
	}
	
	public MultiInstanceRecipientProxyJdkImpl() {}
	
	private List<Object> list = new ArrayList<Object>();
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		String methodName = method.getName().toString();
		Object returned = null;
		
		if(methodName.equals("getFromList")){
			returned = this.list.get((int)args[0]);
			
		}else if(methodName.equals("addToList")){
			        this.list.add((int) args[0], args[1]);
			        
		}else if(methodName.equals("getListSize")){
				    returned = this.list.size();
				    
		}else if(methodName.equals("appendToList")){
		    		returned = this.list.add(args[0]);
		    				
		}else if( (methodName.startsWith("setObject")) && (list !=null) ) {
			
					 int position = extractPosition(methodName);
					 list.add(position, args[0]);
					 
		}else if( (methodName.startsWith("getObject") && (list !=null)) ) {
			
					  int position = extractPosition(methodName);
					   
					  if(position < list.size()) {
						  returned = list.get(position);
					  }
			        
		}else{
				  throw new IllegalArgumentException("Method unknown to proxy implementation: [" + methodName + "], cannot handle");
		}
		
		return returned;
	}

	private static int extractPosition(String methodName) throws IllegalArgumentException {
		
		int position;
		
		 Matcher matcher = pattern.matcher(methodName);
		
		 if(!matcher.find()) {
			 throw new IllegalArgumentException("Invalid getter or setter method name: " + methodName);
		 }
		 
		 String numberValue = matcher.group(0);
		 
		position = Integer.parseInt(numberValue ) - 1;
		
		return position;
	}
	
	public  static class Factory {
		
		
		@SuppressWarnings("rawtypes")
		public static final MultiInstanceRecipient99 createInstance() {
			
			Class[] interfaces  = new Class[]{Serializable.class, MultiInstanceRecipient99.class};
			
			MultiInstanceRecipientProxyJdkImpl multipleItemInstancesProxy = new MultiInstanceRecipientProxyJdkImpl();
			
			ClassLoader classLoader = multipleItemInstancesProxy.getClass().getClassLoader();
			
			MultiInstanceRecipient99 multiInstanceRecipient99 = (MultiInstanceRecipient99) Proxy.newProxyInstance(classLoader, interfaces, multipleItemInstancesProxy);
			
			return multiInstanceRecipient99;
		}
		
	}
}
