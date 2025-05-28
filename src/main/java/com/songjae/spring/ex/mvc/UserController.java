package com.songjae.spring.ex.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.songjae.spring.ex.database.controller.UsedGoodsController;
import com.songjae.spring.ex.database.service.UsedGoodsService;
import com.songjae.spring.ex.mvc.domain.User;
import com.songjae.spring.ex.mvc.service.UserService;


@Controller
@RequestMapping("/mvc/user")
public class UserController {

    private final UsedGoodsService usedGoodsService;

    private final UsedGoodsController usedGoodsController;

	@Autowired
	private UserService userService;

    UserController(UsedGoodsController usedGoodsController, UsedGoodsService usedGoodsService) {
        this.usedGoodsController = usedGoodsController;
        this.usedGoodsService = usedGoodsService;
    }
	
	// 가장 최근 등록한 사용자 정보를 html로 response에 담는다
	@RequestMapping("/mvc/user/info")
	public String userInfo(Model model) {		// 매개변수를 Model타입으로 해 model객첼를 얻어온다
		// 가장 최근에 등록한 사용자 정보 얻어오기
		User user = userService.getLastUser();
		model.addAttribute("title", "가장 최근 등록 사용자");	// model객체에 값을 담는다 이제 mvc/userInfo에서 model객체에 담긴 값을 사용할수있다
		model.addAttribute("result", user);
		
		return "mvc/userInfo";
	}
	
	@PostMapping("/create")
	public String createUser(
			@RequestParam("name") String name
			,@RequestParam("birthday") String birthday
			,@RequestParam("email") String email
			,@RequestParam(value="introduce", required=false) String introduce
			, Model model) {
		
		// 객체를 통해 4개의 값을 넘겨주고 id값까지 5개의 값을 얻어온다
		User user = new User();		// 이객체에는 시작할때는 4개의 값이 있지만 xml까지 실행되면 id까지 이 객체 저장해준다
		user.setName(name);
		user.setYyyymmdd(birthday);
		user.setEmail(email);
		user.setIntroducce(introduce);
		int coutn = userService.addUser(user);
		
		model.addAttribute("title", "가장 최근에 추가된 사용자");
		model.addAttribute("user", user);
		
		return "mvc/userInfo";
	}
	
	// 입력화면 접속
	@GetMapping("/input")
	public String usreInput() {
		return "mvc/userInput";
	}

	
}
