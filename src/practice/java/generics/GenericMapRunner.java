package practice.java.generics;

public class GenericMapRunner {

	public static void main(String[] args) {
	
		var nationalCanadianParks=new Park[] {
				new Park("Banff","12.2, -12.2"),
				new Park("Jasper","24.4, -24.4"),
				new Park("Gatineau","36.6, -36.6")
		};
		
		Layer<Park> parkLayer=new Layer<>(nationalCanadianParks);
		parkLayer.renderLayer();
		
		var majorCanadianRivers=new River[] {
				new River("Saint-Laurent","12.2, -12.2","48.8,-48.8","3.2,-4.2"),
				new River("Arthbasca","97.16, -97.16","23.2,-23.7","4.5,-45.2"),
		};
		
		Layer<River> riverLayer=new Layer<>(majorCanadianRivers);
		riverLayer.addElements(new River("Saguney","3.0,-3.0","1.2,-1.2"));
		riverLayer.renderLayer();

	}

}
