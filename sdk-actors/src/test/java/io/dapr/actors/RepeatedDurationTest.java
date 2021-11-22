package io.dapr.actors;

import org.junit.Test;

import java.time.Duration;


public class RepeatedDurationTest {

  @Test(expected = IllegalArgumentException.class)
  public void invalidAmountOfRepetitions() {
    new RepeatedDuration(Duration.ZERO, -1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void durationCanNotBeNull() {
    new RepeatedDuration(null);
  }
}