package com.verich.padel.api.infrastructure.jpa.adapter.writer;

import org.springframework.stereotype.Service;
import com.verich.padel.api.domain.model.User;
import com.verich.padel.api.domain.port.PersisReaderPort;
import com.verich.padel.api.domain.port.PersisWriterPort;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;
import com.verich.padel.common.jpa.adapter.MkJpaWriterAdapter;

@Service
public class UserWriterAdapter
    extends MkJpaWriterAdapter<User, UserEntity, String>
    implements PersisWriterPort<User>, PersisReaderPort<User> {}
