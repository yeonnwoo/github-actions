package prac.githubactions;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequiredArgsConstructor
@RestController
public class WebtoonController {

    private final ReviewRepository reviewRepository;

    @GetMapping("/review/{id}")
    public String getWebtoon(@PathVariable Long id)
    {
        return reviewRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("id없음")
        ).getReviewContent();

    }
}
