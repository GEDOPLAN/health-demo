package de.gedoplan.service;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Service2 {

  private AtomicBoolean ok = new AtomicBoolean(true);

  public boolean isOk() {
    boolean ok2 = this.ok.get();
    return ok2;
  }

  public void setOk(boolean ok) {
    this.ok.set(ok);
  }

}
