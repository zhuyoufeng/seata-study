package top.windope.seatastudy.service;

import top.windope.seatastudy.dto.OrderDTO;

import java.util.List;
import java.util.Map;

public interface OrderService {

    void save(OrderDTO orderDTO);

    List<OrderDTO> findAll();
}
