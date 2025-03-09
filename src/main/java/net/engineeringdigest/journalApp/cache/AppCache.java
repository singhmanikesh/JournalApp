package net.engineeringdigest.journalApp.cache;

import net.engineeringdigest.journalApp.entity.ConfigEntiry;
import net.engineeringdigest.journalApp.repository.ConfigJournalApp;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {
    public Map<String, String> APP_CACHE = new HashMap<>();

    @Autowired
    private ConfigJournalApp configJournalApp;

    @PostConstruct  //as soon as the bean is created, it will automatically call the init method due to postconstruct
    public void init(){
        List<ConfigEntiry> all = configJournalApp.findAll();
        for(ConfigEntiry configEntiry : all){
            APP_CACHE.put(configEntiry.getKey(), configEntiry.getValue());

        }

    }
}
