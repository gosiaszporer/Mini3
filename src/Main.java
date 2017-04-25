
public class Main {

	public static void main(String[] args) {
		
		/*Dziedziczenie overlapping oraz dynamic - pracownik moze byc zarowno fotografem i grafikiem
		 *może się przekwalifikować z grafika na fotografa i na odwrot */
		Employee emp1, emp2, emp3;
		try {
			emp1 = new Employee("Bruce", "Wayne", EmployeeType.GRAPHICDESIGNER);
			emp2 = new Employee("Clark", "Kent", EmployeeType.PHOTOGRAPH);
			emp3 = new Employee("Barry", "Allen", EmployeeType.PHOTOGRAPH_GRAPHICDESIGNER); // overlapping
			emp1.stopBeingDesigner();
			emp1.becomePhotograph();
			if(emp2.isDesigner() && emp2.isPhotograph()) {
				System.out.println("Czy to działa - to nie powinno sie wyswitlic");
			}
			emp2.becomeDesigner();
			if(emp1.isPhotograph()){
				System.out.println("Batman przekwalifikowal sie z designera na fotografa");
			}
			if(emp3.isPhotograph() && emp3.isDesigner()) {
				System.out.println("Flash jest szalony i ma dwa zawody");
			}
			if(emp2.isDesigner() && emp2.isPhotograph()) {
				System.out.println("Superman ma drugi zawod - jest designerem!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Dziedziczenie wieloaspektowe
		 * Event <--location-- { OusideLocation, InsideLocation }
		 * Event <--type-- { WeddingEvent, OtherEvent } */
		
		Event event1 = new Event("Star Wars Event", EventLocation.INSIDE);
		Event event2 = new WeddingEvent("Superhero Wedding");
		
		/* Klasa abstrakcyjna - location */
		IOutsideLocation event4 = new OutsideLocation(1500, 400);
		
		/* Wielodziedziczenie - OutsideWedding dziedziczy WeddingEvent i implementuje IOutsidLocation*/
		IOutsideLocation event3 = new OutsideWedding("Bright Night", EventLocation.OUTSIDE);
		event3.setLocationPrice(1300);
		event3.setTentPrice(500);
		
		/* metoda polimorficzna - getPrice() */
		System.out.println(event4.getPrice());
		System.out.println(event3.getPrice());
		
		
		

	}

}
