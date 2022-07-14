package com.revature.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;

@Log4j2 @Getter @Setter @SuperBuilder @EqualsAndHashCode(callSuper = true) @Accessors(chain = true, fluent = true)
@ToString(includeFieldNames = false, callSuper= true) @NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
@Builder(builderClassName = "BuildaBox",
	builderMethodName = "execute", buildMethodName = "aBox", setterPrefix = "set")
public class Boxes extends Items {
	
	//@Singular is for a List<String>"ish" example type, where it adds an ID, then an object/s 
	//It also adds two method builder.clearBoxes(); and builder.addBoxes(List.of("etc", "etc"));
	
	@NonNull 
	@EqualsAndHashCode.Include
	@Getter(AccessLevel.PRIVATE)
	private String size;
	
	//example of Equals and HashCode with current EqualsAndHashCode annotation:
	//	new Items(1, "Box" 4, "Storage unit for moving", "10 x 10"
	//	.equals(new Items(2, "Box" 3, "Explanation 2", "10 x 10"));
	
	//@Data annotation gives you @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConsrtuctor
	
	//@Superbuilder lets you extend classes and build using this. It's very limited, and you must have 
	//	@NoArgsConstructor in the Parent Class
	
	public static void logLogging() {
		try {
//			Logger.debug("Test debug");
//			Logger.info("Adding another level");
		} catch (Exception exception) {
//			Logger.error("This is an exception log in Boxes: "+ exception);
		}
	}
	
}
