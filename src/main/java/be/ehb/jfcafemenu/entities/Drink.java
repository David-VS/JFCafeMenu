package be.ehb.jfcafemenu.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @DecimalMin(value = "0.5")
    private Double price;

    @OneToMany(mappedBy = "drink")
    List<TastingNote> tastingNotes = new ArrayList<>();

    public Drink() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<TastingNote> getTastingNotes() {
        return tastingNotes;
    }

    public void setTastingNotes(List<TastingNote> tastingNotes) {
        this.tastingNotes = tastingNotes;
    }
}
