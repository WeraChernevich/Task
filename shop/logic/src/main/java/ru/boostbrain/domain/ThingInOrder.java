package ru.boostbrain.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ThingInOrder {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private Thing thing;
private Order order;


}

