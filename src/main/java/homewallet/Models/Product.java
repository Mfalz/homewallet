package homewallet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// This is the entity class which Hibernate will automatically translate into a table.

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String cost;

    public String getName(){
        return this.name;
    }
    public String getCost(){
        return this.cost;
    }
    public Integer getId(){
        return this.id;
    }

    public void setCost(String cost){
        this.cost=cost;
    }
    public void setName(String name){
        this.name=name;
    }
}