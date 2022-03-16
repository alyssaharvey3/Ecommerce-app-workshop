package com.datastax.tutorials.service.order;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;

import com.datastax.tutorials.service.user.AddressEntity;

@Table("order_by_id")
public class OrderEntity implements Serializable {

	private static final long serialVersionUID = 5140291715224864748L;

	@PrimaryKey
	private OrderPrimaryKey key;
	
	@Column("product_qty")
	@CassandraType(type = Name.INT)
	private int productQty;

	@Column("product_price")
	@CassandraType(type = Name.DECIMAL)
	private BigDecimal productPrice;

	@Column("order_status")
	@CassandraType(type = Name.TEXT)
	private String orderStatus;
	
	@Column("order_subtotal")
	@CassandraType(type = Name.DECIMAL)
	private BigDecimal orderSubtotal;
	
	@Column("order_shipping_handling")
	@CassandraType(type = Name.DECIMAL)
	private BigDecimal orderShippingHandling;
	
	@Column("order_tax")
	@CassandraType(type = Name.DECIMAL)
	private BigDecimal orderTax;
	
	@Column("order_total")
	@CassandraType(type = Name.DECIMAL)
	private BigDecimal orderTotal;
	
	@Column("payment_method")
	@CassandraType(type = Name.TEXT)
	private String paymentMethod;
	
	@Column("shipping_address")
	//@CassandraType(type = CassandraType.Name.UDT, userTypeName = "address")
	private AddressEntity shippingAddress;

	public OrderPrimaryKey getKey() {
		return this.key;
	}
	
	public void setKey(OrderPrimaryKey key) {
		this.key = key;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getOrderSubtotal() {
		return orderSubtotal;
	}

	public void setOrderSubtotal(BigDecimal orderSubtotal) {
		this.orderSubtotal = orderSubtotal;
	}

	public BigDecimal getOrderShippingHandling() {
		return orderShippingHandling;
	}

	public void setOrderShippingHandling(BigDecimal orderShippingHandling) {
		this.orderShippingHandling = orderShippingHandling;
	}

	public BigDecimal getOrderTax() {
		return orderTax;
	}

	public void setOrderTax(BigDecimal orderTax) {
		this.orderTax = orderTax;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public AddressEntity getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressEntity shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
