package co.zorrillo.zorrillo.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.zorrillo.zorrillo.model.Fragance;

public interface FraganceCrudRepository extends MongoRepository<Fragance, String>{
    
}
