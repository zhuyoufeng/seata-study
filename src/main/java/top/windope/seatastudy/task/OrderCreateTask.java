package top.windope.seatastudy.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import top.windope.seatastudy.dto.OrderDTO;
import top.windope.seatastudy.service.OrderService;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Slf4j
@Component
public class OrderCreateTask {

    @Resource
    private OrderService orderService;
    @Resource
    private TransactionManager transactionManager;

    @Scheduled(fixedDelay = 10000)
    public void run() {
        log.info("Start to create order...");
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderCode("0000001");
        orderDTO.setProductName("MP4");
        orderDTO.setPrice(BigDecimal.TEN);
        orderService.save(orderDTO);

        log.info("Current record size: {} with transaction manager {}", orderService.findAll().size(), transactionManager.getClass());
    }

}
