import java.util.Date;
import java.util.Map;

public class Report {
    private Date startDate;
    private Date endDate;
    private Map<Product, Integer> salesByProduct;

    // construtor
    public Report(Date startDate, Date endDate, Map<Product, Integer> salesByProduct) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.salesByProduct = salesByProduct;
    }

    // getters e setters
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Map<Product, Integer> getSalesByProduct() {
        return salesByProduct;
    }

    public void setSalesByProduct(Map<Product, Integer> salesByProduct) {
        this.salesByProduct = salesByProduct;
    }
}
