package Animal;

public abstract class abAnimal implements iAnimal {
	
	public void Shout() { System.out.println("abAnimal Shouts Shouts.."); }
	
	abstract void Run(); // 일반 클래스에서 구현될 예정
	void Walk() { System.out.println("abAnimal Walks Walks.."); } // 일반 클래스에서 오버라이드 예정
	void Jump() { System.out.println("abAnimal Jumps Jumps.."); } // 실행
}
