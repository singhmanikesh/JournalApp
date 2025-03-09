/*
package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }



    @PostMapping
    public String CreateEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return myEntry.toString() ;

    }

    @GetMapping("/id/{myid}")
    public JournalEntry GetId(@PathVariable Long myid){
        return journalEntries.get(myid);
    }

    @DeleteMapping("/id/{myid}")
    public JournalEntry DelId(@PathVariable Long myid){
        return journalEntries.remove(myid);
    }

    @PutMapping("/id/{myid}")
    public JournalEntry UpdateEntry(@PathVariable Long myid,@RequestBody JournalEntry myEntry ){
        return journalEntries.put(myid,myEntry);
    }

}

*/
