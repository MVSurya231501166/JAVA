import java.sql.Date;

public class Expense {
    private int id;
    private int userId;
    private double amount;
    private String category;
    private String description;
    private Date date;
    
    public Expense(int userId, double amount, String category, String description, Date date) {
        this.userId = userId;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }
    
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public Date getDate() { return date; }
}