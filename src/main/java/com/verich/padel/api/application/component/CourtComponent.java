package com.verich.padel.api.application.component;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.verich.padel.api.domain.model.Court;
import com.verich.padel.common.domain.port.MkDomainWriterPort;

@Component
public class CourtComponent {

  @Autowired
  MkDomainWriterPort<Court> writer;

  private static final String COURT_DONT_EXIST = "Error, location do not exist -> ";
  private static final String ID = "id: ";

  public Court getById(final Long id) {
    final Court filter = new Court(id);
    final Court court = writer.findOne(filter);
    if (Objects.isNull(court))
      throw new RuntimeException(COURT_DONT_EXIST + ID + id);
    return court;
  }

  public List<Court> getAll() {
    return writer.findAll();
  }

  public void add(final Court court) {
    writer.add(court);
  }

  public void update(final Court court) {
    writer.update(court);
  }

  public void deleteById(final Long id) {
    final Court filter = new Court(id);
    writer.delete(filter);
  }

}
