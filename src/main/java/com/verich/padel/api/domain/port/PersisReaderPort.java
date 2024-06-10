package com.verich.padel.api.domain.port;

import com.verich.padel.common.domain.port.MkDomainReaderPort;
import com.verich.padel.common.domain.type.MkDomainObject;

public interface PersisReaderPort<P extends MkDomainObject>
    extends MkDomainReaderPort<P> {}
