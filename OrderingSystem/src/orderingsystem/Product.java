package orderingsystem;

/**
 *
 * @author thanasis
 */
public class Product {
    private int     product_id;
    private String  product_name;
    private float   product_cost;
    private String  category_name;

    public Product(int product_id, String product_name, float product_cost, 
            String category_name) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.category_name = category_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getProduct_cost() {
        return product_cost;
    }

    public void setProduct_cost(float product_cost) {
        this.product_cost = product_cost;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    
    
}
