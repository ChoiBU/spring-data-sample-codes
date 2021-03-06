package spring.data.jdbc.comment;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
@Builder
public class CommentContent {
    @NotNull
    String body;

    @NotBlank
    @Size(max = 20)
    String mimeType;
}
