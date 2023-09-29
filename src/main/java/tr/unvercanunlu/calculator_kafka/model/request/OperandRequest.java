package tr.unvercanunlu.calculator_kafka.model.request;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
public class OperandRequest implements Serializable {

    @Positive(message = "First operand should be positive integer.")
    @Digits(integer = 2, fraction = 0, message = "First operand should be integer.")
    @NotNull(message = "First operand cannot be null.")
    @Min(value = 1, message = "First operand should be at least one.")
    @Max(value = 10, message = "First operand should be at most ten.")
    private Integer first;

    @Positive(message = "Second operand should be positive integer.")
    @Digits(integer = 2, fraction = 0, message = "Second operand should be integer.")
    @NotNull(message = "Second operand cannot be null.")
    @Min(value = 1, message = "Second operand should be at least one.")
    @Max(value = 10, message = "Second operand should be at most ten.")
    private Integer second;

}