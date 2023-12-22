package io.camunda.example;

import static org.assertj.core.api.Assertions.assertThat;
import io.camunda.connector.test.outbound.OutboundConnectorContextBuilder;
import io.camunda.example.dto.ConcatenationConnectorRequest;
import io.camunda.example.dto.ConcatenationConnectorResult;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConcatenationFunctionTest {

  ObjectMapper objectMapper = new ObjectMapper();

  @Test
  void shouldReturnExpectedResultWhenExecute() throws Exception {
    // given
    var input = new ConcatenationConnectorRequest();
    input.setInput1("my_input1_value");
    input.setInput2("my_input2_value");

    var function = new ConcatenationConnectorFunction();
    var context = OutboundConnectorContextBuilder.create()
      .variables(input)
      .build();
    // when
    var result = function.execute(context);
    // then
    assertThat(result)
      .isInstanceOf(ConcatenationConnectorResult.class)
      .extracting("concatenationResult")
      .isEqualTo("my_input1_value my_input2_value");
  }
}
