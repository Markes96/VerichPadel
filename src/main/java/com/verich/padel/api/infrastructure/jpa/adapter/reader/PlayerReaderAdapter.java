package com.verich.padel.api.infrastructure.jpa.adapter.reader;

import org.springframework.stereotype.Service;
import com.verich.padel.api.domain.model.Player;
import com.verich.padel.api.domain.port.PersisReaderPort;
import com.verich.padel.api.infrastructure.jpa.entity.UserEntity;
import com.verich.padel.common.jpa.adapter.MkJpaReaderAdapter;

@Service
public class PlayerReaderAdapter
    extends MkJpaReaderAdapter<Player, UserEntity, String>
    implements PersisReaderPort<Player> {}
