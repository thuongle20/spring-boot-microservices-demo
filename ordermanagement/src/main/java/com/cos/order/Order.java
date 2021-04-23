package com.cos.order;
//import java.time.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Order_tbl")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String customername;
	//private LocalDateTime datetime;
	private String productname;
	private int quantity;
	private double totalpayment;
	
	public void setId(Integer id)
	{
		this.id=id;
	}
	public void setcustomername(String customername) {
		this.customername=customername;
	}
	/*public void setDateTime(LocalDateTime datetime) {
		this.datetime=datetime;
	}*/
	public void setproductname(String productname) {
		this.productname=productname;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public void setTotalPayment(double total) {
		this.totalpayment=total;
	}
	public Integer getId() {
		return this.id;
	}
	public String getCustomerName()
	{
		return customername;
	}
	/*public LocalDateTime getDateTime()
	{
		return datetime; 
	}*/
	public String getProductName() {
		return productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotalPayment() {
		return totalpayment;
	}

}
