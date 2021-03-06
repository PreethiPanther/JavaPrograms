import java.io.Serializable;

public class Order implements Serializable {
	int id;
    String productName;
    transient String CustomerName;
	public Order(int id, String productName, String customerName) {
		super();
		this.id = id;
		this.productName = productName;
		CustomerName = customerName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", CustomerName=" + CustomerName + "]";
	}
}
