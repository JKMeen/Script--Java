interface Choice { // ī�� ��ȣ �Է� ����
	void choice(int num); 
}

interface ComChoice { // ī�� ��ȣ �Է� ����
	void comchoice(int com, int com2); 
}

class play implements Choice, ComChoice{
	public int pHP, cHP;
	public int com, num;
	
	public void SetHP(int pHP, int cHP) 
	{ 
		this.pHP = pHP; this.cHP = cHP;
	}
	
	public void choice(int num) // 
	{
		switch (num){
			case 1 : cHP--; System.out.println("->���� ����! HP-1"); break;
			case 2 : cHP-=3; System.out.println("->���� ��Ÿ! HP-3"); break;
			case 3 : pHP+=4; System.out.println("+>�÷��̾�ü�� ȸ��! HP+4"); break;
			case 4 : System.out.println("���� ���� ���! (���� �� ����)"); break;
			case 5 : System.out.println("���� ���� �ݻ�! (���� �� ����)"); break;
		}

		System.out.println("( �÷��̾� ü�� : " + pHP + " ) ( ���� ü�� : " + cHP + " )"); 
	}
		
	public void comchoice(int com, int num)
	{
		this.com = com;
		this.num = num;
		
		System.out.println(""); System.out.println("-------------------"); 
		System.out.println("    <<���� ��!>>    ");
		
		switch (com){
			case 1 : 
				if(num == 4) {
					System.out.println("�����̾� ����!");
					System.out.println("�÷��̾�: ���� ���!");break;
				}
				else if(num == 5) {
					cHP-=10; System.out.println("�÷��̾�: ���� �ݻ�! cHP-10");break;
				}
				else if(num != 4 && num !=5) {pHP-=10; System.out.println("->�÷��̾� ����! HP-10");}break;
			
			case 2 : 
				if(num == 4) {
					System.out.println("->�����̾� ��Ÿ!");
					System.out.println("+>�÷��̾�: ���� ���!");break;
				}
				else if(num == 5) {
					cHP-=20; System.out.println("->�÷��̾�: ���� �ݻ�! cHP-20");break;
				}
				else if(num != 4 && num !=5) {pHP-=20; System.out.println("->�÷��̾� ��Ÿ! HP-20");}break;
			
			case 3 : cHP+=20; System.out.println("+>����ü�� ȸ��! HP+20"); break;
			
			case 4 : 
				if(num == 4) {
					System.out.println("+>�÷��̾�: ���� ���!");break;
				}
				else if(num == 5) {
					System.out.println("->���� ������� ���!");
					cHP-=40; System.out.println("->�÷��̾�: ���� �ݻ�! cHP-40");break;
				}
				else if(num != 4 && num !=5) {cHP-=40; pHP-=40; System.out.println("+>���� ������� ���! �÷��̾�, ����  HP-40!");}break;
				
			default : System.out.println("** ���� ����! **"); break;
			
		}
		System.out.println("( �÷��̾� ü�� : " + pHP + " ) ( ���� ü�� : " + cHP + " )");
		System.out.println(""); System.out.println("");
	}
	
	public int PlayHP() 
	{return pHP;}
	public int ComHP() 
	{return cHP;}
	
	public void display() {
		System.out.println("( �÷��̾� ü�� : " + pHP + " ) ( ���� ü�� : " + cHP + " )");
	}
}