package com.verich.padel.api.infrastructure.jpa.adapter.writer;

import org.springframework.stereotype.Service;
import com.verich.padel.api.domain.model.Court;
import com.verich.padel.api.domain.port.PersisReaderPort;
import com.verich.padel.api.domain.port.PersisWriterPort;
import com.verich.padel.api.infrastructure.jpa.entity.CourtEntity;
import com.verich.padel.common.jpa.adapter.MkJpaWriterAdapter;

@Service
public class CourtWriterAdapter
    extends MkJpaWriterAdapter<Court, CourtEntity, Long>
    implements PersisWriterPort<Court>, PersisReaderPort<Court> {}
