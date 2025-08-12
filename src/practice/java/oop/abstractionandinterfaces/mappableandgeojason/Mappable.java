package practice.java.oop.abstractionandinterfaces.mappableandgeojason;

public interface Mappable {
	
	String JSON_PROPERTY="""
			"properties":{%s}
			""";
	
	String getLabel();
	Geometry getShape();
	String getMarker();
	
	 default String toJason(){
		return """
				"Type" : "%s", "label" : "%s", "marker" : "%s"
				""".formatted(getShape(),getLabel(),getMarker());
		
	}
	 
	 static void printProperties(Mappable instance) {
			System.out.printf(JSON_PROPERTY.formatted(instance.toJason()));
	 }

}
