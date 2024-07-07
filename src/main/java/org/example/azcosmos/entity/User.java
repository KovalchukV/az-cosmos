package org.example.azcosmos.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.util.UUID;

//@Container(containerName = "users")
public class User {

    @Id
    private UUID id;

    @PartitionKey
    private String role;

    private String name;
}
