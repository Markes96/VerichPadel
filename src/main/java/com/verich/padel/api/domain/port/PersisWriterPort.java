package com.verich.padel.api.domain.port;

import com.verich.padel.common.domain.port.MkDomainWriterPort;
import com.verich.padel.common.domain.type.MkDomainObject;

public interface PersisWriterPort<P extends MkDomainObject>
    extends MkDomainWriterPort<P> {}
