package de.gedoplan.health;

import de.gedoplan.service.Service2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@ApplicationScoped
@Health
public class HealthCheck2 implements HealthCheck {

  @Inject
  Service2 service2;

  @Override
  public HealthCheckResponse call() {
    return HealthCheckResponse
        .named("Service2")
        .state(this.service2.isOk())
        .build();
  }

}
