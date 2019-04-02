package ch.gomes.ramos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetail  implements Serializable{

    private static final long serialVersionUID = 7550745928843183535L;
    
    @Id
    @Column(name = "id")
    private String id;
    
    @ManyToOne
    @JoinColumn(name = "order_id",
    foreignKey = @ForeignKey(name = "order_detail_ord_fk"))
    private Order order;
    
    @ManyToOne
    @JoinColumn(name = "product_id",
    foreignKey = @ForeignKey(name = "order_detail_prod_fk"))
    private Product product;
    
    @Column(name = "quanity")
    private Integer quanity; 
    
    @Column(name = "price")
    private Double price;
    
    @Column(name = "amount")
    private Double amount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuanity() {
		return quanity;
	}

	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
