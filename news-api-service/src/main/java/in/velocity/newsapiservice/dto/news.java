package in.velocity.newsapiservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class news {
    @JsonProperty("status")
    private String status;

    private Integer totalResults;

    @JsonProperty("articales")
    private List<Articles> articles;

}
