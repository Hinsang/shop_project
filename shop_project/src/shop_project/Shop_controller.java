package shop_project;

public class Shop_controller {
	
	static Shop_users_model[] userList =  new Shop_users_model[100];
	static Shop_clothes_model[] clothesList =  new Shop_clothes_model[100];
	
	static int con_login(String id, String password) {
		
			for(int i = 0 ; i<userList.length ; i++) {
				if(userList[i].id != null && userList[i].id.equals(id)) {
					return 3; // 존재하는 아이디
				} else if(userList[i].id == null && !userList[i].id.equals(id)) {
				userList[i].id = id;
				userList[i].password = password;
				return 1; // 회원가입 성공
			}
			
		}
		return 0;
	}
	
	static int con_signup(String id, String password) {
		
		Shop_users_model users = new Shop_users_model(id, password);
		
		int result = 0;
		for(int i = 0 ; i<userList.length ; i++) {
			if(userList[i].id != null && userList[i].id.equals(id)) {
				result = 3; // 존재하는 아이디
			} else {
				if(userList[i].id == null) {
					userList[i].id = users.id;
					userList[i].password = users.password;
					result = 1; // 회원가입 성공
					break;
				}
			}
		}
		return result;
		
	}
	
}
