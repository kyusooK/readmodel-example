package contracttest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceorderCommand {

    private String userId;
    private String productId;
    private String productName;
    private Integer qty;
}
