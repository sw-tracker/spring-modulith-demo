package example.order;

import example.order.spi.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.of(Optional.of(Collections.emptyList()));
    }
}
