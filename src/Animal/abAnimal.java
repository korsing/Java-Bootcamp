package Animal;

public abstract class abAnimal implements iAnimal {
	
	public void Shout() { System.out.println("abAnimal Shouts Shouts.."); }
	
	abstract void Run(); // �Ϲ� Ŭ�������� ������ ����
	void Walk() { System.out.println("abAnimal Walks Walks.."); } // �Ϲ� Ŭ�������� �������̵� ����
	void Jump() { System.out.println("abAnimal Jumps Jumps.."); } // ����
}
