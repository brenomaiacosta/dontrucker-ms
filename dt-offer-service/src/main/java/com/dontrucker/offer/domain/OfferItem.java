package com.dontrucker.offer.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class OfferItem {
    @Id
    @Field("_id")
    private String id;
    private String name;
}
