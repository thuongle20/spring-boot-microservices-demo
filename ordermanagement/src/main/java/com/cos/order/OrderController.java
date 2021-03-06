package com.cos.order;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;




@Controller // This means that this class is a Controller
@RequestMapping(path="/ordermanagement") // This means URL's start with /mystore (after Application path)
public class OrderController {
@Autowired
private OrderRepository orderRepository;
@Autowired
private RestTemplate restTemplate;
//This means to get the bean called orderRepository
// Which is auto-generated by Spring, we will use it to handle the data
@PutMapping(path="/order") // Map ONLY POST Requests
public @ResponseBody String addNewOrder (@RequestBody Order o) {
  // @ResponseBody means the returned String is the response, not a view name
  // @RequestParam means it is a parameter from the GET or POST request

//  Product p = new Product();
//  p.setProductName(productName);
//  p.setBrand(brand);
//  p.setPrice(price);
  orderRepository.save(o);
  return "Saved Successully";
}

@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {
	return builder.build();
}

@PostMapping(path="/order") // Map ONLY POST Requests
public @ResponseBody String updateOrder (@RequestBody Order o) {
	
	Product p = restTemplate.getForObject("http://localhost:8081/mystore/product?id=4"
			, Product.class);
	o.setproductname(p.getProductName());
  // @ResponseBody means the returned String is the response, not a view name
  // @RequestParam means it is a parameter from the GET or POST request

//  Product p = new Product();
//  p.setProductName(productName);
//  p.setBrand(brand);
//  p.setPrice(price);
  orderRepository.save(o);
  return "update Successully";
}

@GetMapping(path="/orders", produces = "application/json")
public @ResponseBody Iterable<Order> getAllOrders() {
  // This returns a JSON or XML with the product
	  Iterable<Order> lst = orderRepository.findAll();
  return lst;
}

}
