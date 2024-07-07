package org.example.azcosmos.repo;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.example.azcosmos.entity.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends CosmosRepository<User, UUID> {
}
