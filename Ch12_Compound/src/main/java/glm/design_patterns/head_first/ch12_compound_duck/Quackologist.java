package glm.design_patterns.head_first.ch12_compound_duck;

public class Quackologist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: "+duck+" just quacked. ");
	}
  
}