package com.verich.padel.api.domain.port;

import com.verich.padel.common.jpa.port.MkJpaWriterPort;
import com.verich.padel.common.jpa.type.MkJpaObject;

public interface PersisWriterPort<P extends MkJpaObject>
    extends MkJpaWriterPort<P> {}
