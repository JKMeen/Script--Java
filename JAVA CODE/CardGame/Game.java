import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		play p = new play();
		int pHP=50, cHP=100;
		int num =0;
		CardList card[] = new CardList[3];
		
		p.SetHP(pHP, cHP); // ü�� ����
		p.display();

		while(true){
		
			System.out.print(">> �÷��̾� ī�� : ");
			for(int i=0; i<3; i++)
			{
				int play = rand.nextInt(5)+1;
				switch(play){
				case 1 : card[i] = new CardList("����",1); break;
				case 2 : card[i] = new CardList("��Ÿ",2); break;
				case 3 : card[i] = new CardList("ȸ��",3); break;
				case 4 : card[i] = new CardList("���",4); break;
				case 5 : card[i] = new CardList("���ݹݻ�",5); break;
				} // ī�� ����Ʈ�� ����	
				card[i].display();
			}
			System.out.println("");
			
			////////////////////////////////////////////////////////////////
			System.out.println("(1)���� , (2)��Ÿ, (3)ȸ�� , (4)���, (5)���ݹݻ�");
			
			for(int i=0; i<3; i++)
			{
				System.out.println("");
				System.out.println("<<�÷��̾� ��! ����� ī���� ��ȣ�� �Է��Ͻÿ�.>>");
				
			    num = scan.nextInt(); // �Է¹��� ī�� ��ȣ
			    
			    if (num == card[0].getNum() || num == card[1].getNum()|| num == card[2].getNum())                                   
			    { 
			    	//�÷��̾� ��
			    	p.choice(num); // �÷��̾� ī�� ���� �־���	
			    	
			    }
			    
				else { System.out.println("�߸��� ī���ȣ�� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���."); i--; }
			}
			
			//���� ��
			int com = rand.nextInt(7)+1; 
		    
			p.comchoice(com, num ); // ��ǻ�� ī�� ���� �־���
			
			 if(p.pHP <= 0) {
					System.out.println("");
					System.out.println("***********************************");
					System.out.println("**********    ���� ��!!    **********");
					System.out.println("***********************************");
					break;
			}else if(p.cHP <= 0) {
					System.out.println("");
					System.out.println("***********************************");
					System.out.println("**********   �÷��̾� ��!!   **********");
					System.out.println("***********************************");
					break;
			}else{
					System.out.println("    <<���� ����!>>    "); System.out.println(""); continue;
			}
			
		}
	}
}