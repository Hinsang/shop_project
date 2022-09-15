package shop_project;

import java.util.Scanner;

public class Shop_view {
		
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		start();
		
	}

	static void start() {
		while(true) {
			
			System.out.println("======☆의류 쇼핑몰입니다☆======");
			System.out.println("1.로그인 2.회원가입");
			
			
			int btn = scanner.nextInt();
			
			if(btn == 1) {
				login();
			}
			else if (btn == 2) {
				signup();
			}
			
			break;
			
		}
	}
	
	static void login() {
		System.out.println("아이디 : ");
		String id = scanner.next();
		System.out.println("비밀번호 : ");
		String password = scanner.next();
		
		int result = Shop_controller.con_login(id, password);
		
		if(result == 1) { // 로그인 성공
			System.out.println("로그인 성공!!");
		} else if (result == 2) { // admin 아이디
			System.out.println("admin 아이디는 만들 수 없습니다.");
		} else if (result == 3) { // 존재하는 아이디
			System.out.println("이미 존재하는 id입니다.");
		} else {
			System.out.println("예기치 못한 에러");
		}
		
	}
	
	static void signup() {
		System.out.println("아이디 : ");
		String id = scanner.next();
		System.out.println("비밀번호 : ");
		String password = scanner.next();
		
		int result = Shop_controller.con_signup(id, password);
		
		if(result == 1) { // 회원가입 성공
			System.out.println("회원가입 성공!!");
		} else if (result == 2) { // admin 아이디
			System.out.println("admin 아이디는 만들 수 없습니다.");
		} else if (result == 3) { // 존재하는 아이디
			System.out.println("이미 존재하는 id입니다.");
		} else {
			System.out.println("예기치 못한 에러");
		}
		
	}
	
}