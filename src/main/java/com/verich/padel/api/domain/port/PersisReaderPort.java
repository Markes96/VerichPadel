package com.verich.padel.api.domain.port;

import com.verich.padel.common.jpa.port.MkJpaReaderPort;
import com.verich.padel.common.jpa.type.MkJpaObject;

public interface PersisReaderPort<P extends MkJpaObject>
    extends MkJpaReaderPort<P> {}
