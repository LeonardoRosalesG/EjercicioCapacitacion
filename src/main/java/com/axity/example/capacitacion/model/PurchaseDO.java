package com.axity.example.capacitacion.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchase")
public class PurchaseDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @ManyToOne
    @JoinColumn(name = "idProducto", referencedColumnName = "id")
    private ProductDO productDO;

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    private ClientDO clientDO;

    @Temporal(TemporalType.DATE)
    @Column(name = "purchaseDate")
    private Date date;


}
