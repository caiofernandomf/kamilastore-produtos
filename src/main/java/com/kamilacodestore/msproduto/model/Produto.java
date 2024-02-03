package com.kamilacodestore.msproduto.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "produtos")
public class Produto {


    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String product_id;


    @DynamoDBAttribute
    private Double price;


    @DynamoDBAttribute
    private String description;

    @DynamoDBAttribute
    private Integer quantity;

    public Produto(String product_id, Double price, String description, Integer quantity) {
        this.product_id = product_id;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "product_id='" + product_id + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
