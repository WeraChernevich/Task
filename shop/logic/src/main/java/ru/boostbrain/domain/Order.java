package ru.boostbrain.domain;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<ThingInOrder> thingInOrderList;
}
