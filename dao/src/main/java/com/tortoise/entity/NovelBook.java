import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Version;

/**
 * @author pengli
 * @create 2021-08-05 17:13
 */
@Getter
@Setter
@ToString()
public class NovelBook {

    @Version    //乐观锁机制装配
    private Integer version;
}
