package com.spiral.FinantialAnalyser.model;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/accounts")
public class BankAccountController {
	private List<BankAccount>accountList = List.of(
			new BankAccount(1000,"Seylan",20000),
			new BankAccount(1001,"Seylan",20000),
			new BankAccount(1002,"Seylan",20000),
			new BankAccount(1003,"Seylan",20000),
			new BankAccount(1004,"Seylan",20000),
			new BankAccount(1005,"Seylan",20000),
			new BankAccount(1006,"Seylan",20000)
	);
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome to the coffee Shop";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public String listAccounts() {
        String accountsDisplay = "<strong>Product List:</strong> <hr>";
        for(BankAccount acc : accountList) {
        	accountsDisplay+="Accound No: "+acc.getAccNo()+"Bank: "+acc.getBank()+"Balance: "+acc.getBalance()+"$"+"<br>";
        }
        return accountsDisplay;
	}
	
	@RequestMapping("/details/{id}")
	@ResponseBody
	public String getAccountDetailsByID(@PathVariable int id) {
		for(BankAccount acc:accountList) {
			if(acc.getAccNo() ==id) {
				return "<strong>Requested Product Details: </strong> <hr>"
						+ "Account ID: "+acc.getAccNo()+"<br>Bank: "+acc.getBank();
			}
		}
		return "Product not found";
	}
	
	 @RequestMapping("/add")
	    public String showForm(Model model) {
		 	System.out.println("ggggggggggggggggggggggg");
	        model.addAttribute("account", new BankAccount()); // Used by th:object
	        return "addnewaccount";
	    }
	
	@PostMapping("/addNewAccount")
	public String addProduct(@ModelAttribute BankAccount account) {
		accountList.add(account);
		System.out.println(accountList);
		return "redirect:/";
	}
	
	
	
}
