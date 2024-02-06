package com.verich.padel.api.infrastructure.http.server.status.cdo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AllOKServerStatusCDO {

  public final String message = "Hi, I'm the Verich Padel Service";
  public final String serverStatus = "All OK";
  public final String autor = "Andrés Bel";

  @Autowired
  public ContactInfoCDO contactInfo;

}
