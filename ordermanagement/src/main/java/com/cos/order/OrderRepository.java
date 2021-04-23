package com.cos.order;
import org.springframework.data.repository.CrudRepository;
//import com.cos.order.Order;

public interface OrderRepository extends CrudRepository<Order,Integer> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean called orderRepository
		//with all Create, update, Delete operations
}
