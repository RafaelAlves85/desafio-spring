package DesafioNextSeguros2023.DesafioNextSeguros2023.entities;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@RequestMapping


public class House {

    @Id

    private String ownershipStatus;
    private String location;
    private String zipcode;


    
}
