package practice.java.oop.abstractionandinterfaces.mappableandgeojason;

enum UtilityType{
	ELECTRICAL,FIBER_OPTIC,GAS,WATER
}

public class UtilityLine implements Mappable{

	private String name;
	private UtilityType usageType;
	
	public UtilityLine(String name, UtilityType usageType) {
		super();
		this.name = name;
		this.usageType = usageType;
	}

	@Override
	public String getLabel() {
		return name + " (" +usageType + ")";
	}

	@Override
	public Geometry getShape() {
		return Geometry.LINE;
	}

	@Override
	public String getMarker() {
		return switch(usageType) {
		case ELECTRICAL -> Color.GREEN+ " " + LineMarker.DASHED;
		case FIBER_OPTIC -> Color.RED+ " " + LineMarker.DOTTED;
		case GAS -> Color.BLUE+ " " + LineMarker.SOLID;
		case WATER -> Color.ORANGE+ " " + LineMarker.SOLID;
		default -> Color.BLACK+ " " + LineMarker.SOLID;
		};
	}
	
	public String toJason() {
		return Mappable.super.toJason()+"""
				"name": "%s", "utility": "%s" """.formatted(name,usageType);
	}


}
