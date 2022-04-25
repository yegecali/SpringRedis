package com.yegecali.examplerediscache;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@Document
public class Person implements Serializable {
    private static final long serialVersionUID = -4439114469417994311L;
    private String id;
    private String name;
    private String lastName;
}
