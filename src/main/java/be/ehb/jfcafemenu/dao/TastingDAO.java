package be.ehb.jfcafemenu.dao;

import be.ehb.jfcafemenu.entities.TastingNote;
import org.springframework.data.repository.CrudRepository;

public interface TastingDAO extends CrudRepository<TastingNote, Integer> {
}
