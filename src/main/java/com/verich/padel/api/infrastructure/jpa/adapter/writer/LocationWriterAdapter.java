package com.verich.padel.api.infrastructure.jpa.adapter.writer;

import org.springframework.stereotype.Service;
import com.verich.padel.api.domain.model.Location;
import com.verich.padel.api.domain.port.PersisReaderPort;
import com.verich.padel.api.domain.port.PersisWriterPort;
import com.verich.padel.api.infrastructure.jpa.entity.LocationEntity;
import com.verich.padel.common.jpa.adapter.MkJpaWriterAdapter;

@Service
public class LocationWriterAdapter
    extends MkJpaWriterAdapter<Location, LocationEntity, Long>
    implements PersisWriterPort<Location>, PersisReaderPort<Location> {}
