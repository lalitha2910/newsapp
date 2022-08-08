package in.velocity.newsapiservice.dto.search;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class search {
    private String name;
    private List<ArticlesSearch> Result;
}
