package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//Journalentry is the entity and String is the id of the data type
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {



}
