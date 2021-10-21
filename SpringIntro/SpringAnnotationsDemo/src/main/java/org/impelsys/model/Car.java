package org.impelsys.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;


/*@Component
@PropertySource("classpath:car.properties")*/
public class Car {
	//@Value("type1)")
	String type;
	
	//@Value("model1")
	String model;
	

	Engine mustangEngine;
	
	Car(){
	
	}
	/*//@Autowired
	  Car(Engine e){
		System.out.println("in constructor");
		mustangEngine= e;
	}*/
	 
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	@Required
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine(){
		return mustangEngine;
	}
	
	public void setEngine(Engine mustangEngine) {
		this.mustangEngine=mustangEngine;
	}
	

}
