package trdung.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import trdung.model.*;
import trdung.repository.accountRepo;
import trdung.repository.cartServiceImpl;
import trdung.repository.productRepo;
import trdung.repository.productServiceImpl;
import trdung.service.cartService;
import trdung.service.productService;

@Controller
public class allController {
	
	@Autowired
	private accountRepo accRepo;
	@Autowired
	private productRepo prdRepo;
	@Autowired 
	productServiceImpl prdService;
	@Autowired
	private cartServiceImpl cartService;
	public account createAcc(account acc) {
		return accRepo.save(acc);
	}
	public List<account> getAllAccount(){
		return accRepo.findAll();
	}
	List<String> namecart = new ArrayList<>();
	List<Double> pricecart = new ArrayList<>();
	
	 @RequestMapping(value="/home", method = RequestMethod.GET)
	    public String home(Model model) {
		 	List<Product> list = prdRepo.findAll();
		 	namecart.clear();
		 	pricecart.clear();
		 	model.addAttribute("list_prd",list);
		 	model.addAttribute("cartService",cartService);
	        return "index";
	    }
	 
	 @RequestMapping(value="/home", method = RequestMethod.POST)
	    public String search(Model model,@RequestParam(required = false,name = "idSearch") String params,@RequestParam(required = false,name = "type") String type,@RequestParam(required = false,name = "idprd") String idprd) {
		 	if(params!=null) {
		 		System.out.println(type);
		 		if(type.equals("1")) {
		 			List<Product> list = prdService.getAllPrdContain(params);
		 			System.out.println("addf");
		 			model.addAttribute("list_prd",list);
		 		}
		 		if(type.equals("2")) {
		 			List<Product> list = prdService.getAllPrdByBrand(params);
		 			model.addAttribute("list_prd",list);
		 		}
		 		if(type.equals("3")) {
		 			List<Product> list = prdService.getAllPrdByColor(params);
		 			model.addAttribute("list_prd",list);
		 		}
		 			model.addAttribute("cartService",cartService);
		 	}else {
		 		List<Product> list = prdRepo.findAll();
		 		model.addAttribute("list_prd",list);
		 		model.addAttribute("cartService",cartService);
		 		Product prd = prdService.FindByName(idprd);
				if(prd !=null) {
					cartItem item = new cartItem();
					item.setPrdid(prd.getId());
					item.setName(prd.getName());
					item.setPrice(prd.getPrice());
					item.setQty(1);
					cartService.add(item);
				}
		 	}
	        return "index";
	    } 
	 @GetMapping("/cart")
	 public String viewCart(Model model) {
			model.addAttribute("cartitem",cartService.getAllItems());
			model.addAttribute("cartService",cartService);
			return "cart";
		}
	 @PostMapping("/cart")
	 public String checkout(Model model) {
			cartService.clear();
			return "redirect:/home";
		}
	 
}