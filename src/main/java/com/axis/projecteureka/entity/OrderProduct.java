package com.axis.projecteureka.entity;
//package com.axis.projectBackend.entity;
//
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.Transient;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//public class OrderProduct {
//
//    @EmbeddedId
//    @JsonIgnore
//    private OrderProductPK pk;
//
//    @Column(nullable = false)
//	private Integer quantity;
//
//    
//
//    
//    public OrderProduct(Order order, Product product, Integer quantity) {
//        pk = new OrderProductPK();
//        pk.setOrder(order);
//        pk.setProduct(product);
//        this.quantity = quantity;
//    }
//
//    public OrderProduct() {
//		super();
//	}
//
//	@Transient
//    public Product getProduct() {
//        return this.pk.getProduct();
//    }
//
//    @Transient
//    public Double getTotalPrice() {
//        return getProduct().getPrice() * getQuantity();
//    }
//
//	public OrderProductPK getPk() {
//		return pk;
//	}
//
//	public void setPk(OrderProductPK pk) {
//		this.pk = pk;
//	}
//
//	public Integer getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(Integer quantity) {
//		this.quantity = quantity;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(pk);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		OrderProduct other = (OrderProduct) obj;
//		return Objects.equals(pk, other.pk);
//	}
//
//   
//}