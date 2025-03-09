package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.ConfigEntiry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalApp extends MongoRepository<ConfigEntiry, ObjectId> {

}
