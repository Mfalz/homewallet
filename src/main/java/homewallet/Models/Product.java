package homewallet;

import javax.persistence.*;

// This is the entity class which Hibernate will automatically translate into a table.

@Entity
@Table(
        name="product",
        uniqueConstraints=@UniqueConstraint(columnNames = {"cost", "name"})
)
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double cost;

    public String getName(){
        return this.name;
    }
    public Double getCost(){
        return this.cost;
    }
    public Integer getId(){
        return this.id;
    }

    public void setCost(Double cost){
        this.cost=cost;
    }
    public void setName(String name){
        this.name=name;
    }
}