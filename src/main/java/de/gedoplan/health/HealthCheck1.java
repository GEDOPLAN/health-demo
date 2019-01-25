package de.gedoplan.health;

import de.gedoplan.service.Service1;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@ApplicationScoped
@Health
public class HealthCheck1 implements HealthCheck {

  @Inject
  Service1 service1;

  @Override
  public HealthCheckResponse call() {
    return HealthCheckResponse
        .named("Service1")
        .state(this.service1.isOk())
        .withData("memory", Runtime.getRuntime().freeMemory())
        .build();
  }

}
