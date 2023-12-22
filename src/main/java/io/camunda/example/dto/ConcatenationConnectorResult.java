package io.camunda.example.dto;

import java.util.Objects;

public class ConcatenationConnectorResult {

  private String concatenationResult;

  public String getConcatenationResult() {
    return concatenationResult;
  }

  public void setConcatenationResult(String concatenationResult) {
    this.concatenationResult = concatenationResult;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ConcatenationConnectorResult that = (ConcatenationConnectorResult) o;
    return Objects.equals(concatenationResult, that.concatenationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concatenationResult);
  }

  @Override
  public String toString() {
    return concatenationResult;
  }

}