
public class UserController {
	private static final long serialVersionUID = 1L;
	
	//서비스 인터페이스 타입의 변수를 선언해서
	//요청이 무엇이냐에 따라 하나의 변수로 여러 종류의 객체를 대입.
	private IUserService sv;
	
	public UserController() {
		super();
		
	}
	
	protected void service(HttpServletRequest request, HttpservletResponse response)
	
	
	switch (uri) {
	case "joinPage" :
		System.out.println("회원 가입 페이지로 이동 요청!");
		response.sendRedirect("user/user")
	
	break;
	
	case "join":
			System.out.println("회원 가입 요청이 들어옴!");
			String id = request.getParameter("id");
			UserDAO dao = UserDAO.getInstance();
			boolean flag = dao.confirmId(id);
			
			if(flag) {
				System.out.println("아이디가 중복되었습니다.");
				
			} else {
				System.out.println("회원가입 계속 진행 가능!");
			}
			UserVO vo = new UserVO(
					
					);
			break;
			
			}
	
	
}
