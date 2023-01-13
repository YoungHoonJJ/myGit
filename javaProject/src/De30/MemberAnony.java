package De30;

class MemberData{
	
	private int no=2; //개인 정보는 private 해야할듯합니다
	private String name = "김길동";
	private String email = "kim@gmail.com";
	
	//private 이기때문에 get/set 사용 
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

public class MemberAnony extends MemberData  {

	public static void main(String[] args) {
		
		MemberData md = new MemberData();
		
		
		Member mb = new Member() {
			
			
			@Override
			public void no() {
				
				System.out.println("고객번호 : "+md.getNo());
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void name() {
				
				System.out.println("이름 : "+md.getName());
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mail() {
				
				System.out.println("이메일 : "+md.getEmail());
				// TODO Auto-generated method stub
				
			}
			
		};
		System.out.println("===========================");
		mb.no();
		mb.name();
		mb.mail();
		System.out.println("===========================");
	}
	

}
