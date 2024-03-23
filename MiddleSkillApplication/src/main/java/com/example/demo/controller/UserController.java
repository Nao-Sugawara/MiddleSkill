package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;

/**
* ユーザー情報 Controller
*/
@Controller
public class UserController {

	/**
	* ユーザー情報 Service
	*/
	@Autowired
	private UserService userService;

	/**
	* ユーザー情報一覧画面を表示
	* @param model Model
	* @return ユーザー情報一覧画面のHTML
	*/
	@RequestMapping("/user/list")
	public String displayList(Model model) {
		// ユーザー情報の一覧を取得
		List<UserEntity> userList = userService.searchAll();

		// モデルにユーザー情報一覧をセット
		model.addAttribute("userList", userList);

		// ユーザー情報一覧画面のHTMLを返す
		return "user/list";
	}

	/**
	 * ユーザー新規登録
	 * @param  userRequest リクエストデータ
	 * @param  model Model
	 * @return  ユーザー情報一覧画面
	 */
	@RequestMapping("/user/add")
	public String create(@Valid @ModelAttribute UserRequest userRequest,
			Model model, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "/user/add";
		}
		// 入力判定
		//		if (userRequest.getName() == null || userRequest.getName().isEmpty() ||
		//				userRequest.getAddress() == null || userRequest.getAddress().isEmpty() ||
		//				userRequest.getPhone() == null || userRequest.getPhone().isEmpty()) {
		//			// 入力チェックエラーの場合
		//			model.addAttribute("error", "入力が不完全です。すべての項目を入力してください。");
		//			return "user/add"; // エラーページのビュー名を指定

		// ユーザー情報の登録
		userService.create(userRequest);
		// 登録後の画面遷移
		return "redirect:/user/list"; // ユーザー情報一覧画面へのリダイレクト
	}

	/**
	 * ユーザー情報詳細画面を表示
	 * @param  id 表示するユーザーID
	 * @param  model Model
	 * @return  ユーザー情報詳細画面
	 */
	@RequestMapping("/user/{id}")
	public String displayView(@PathVariable Integer id, Model model) {
		return "user/view";

	}
}
