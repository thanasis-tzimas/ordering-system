package orderingsystem;
import java.util.List;
/**
 *
 * @author thanasis
 */
public class Order {
    private int order_id;
    private List<Product> product_list;
    private float total_cost;
    private String category_name;

    public Order(int order_id, List<Product> product_list, String category_name) {
        this.order_id = order_id;
        this.product_list = product_list;
        this.total_cost = calculate_total_cost();
        this.category_name = category_name;
    }

    private float calculate_total_cost() {
        float t = 0;
        for(Product product : this.product_list) {
            t += product.getProduct_cost();
        }
        return t;
    }
    
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Product> getProduct_list() {
        return product_list;
    }

    public void setProduct_list(List<Product> product_list) {
        this.product_list = product_list;
    }

    public float getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(float total_cost) {
        this.total_cost = total_cost;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    
    
}
