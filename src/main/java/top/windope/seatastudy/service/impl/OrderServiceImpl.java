package top.windope.seatastudy.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.windope.seatastudy.dto.OrderDTO;
import top.windope.seatastudy.entity.OrderEntity;
import top.windope.seatastudy.repository.OrderRepository;
import top.windope.seatastudy.service.OrderService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save(OrderDTO orderDTO) {
        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(orderDTO, orderEntity);
        orderRepository.save(orderEntity);
    }

    @Override
    public List<OrderDTO> findAll() {
        return orderRepository.findAll()
                .stream()
                .map(orderEntity -> {
                    OrderDTO orderDTO = new OrderDTO();
                    BeanUtils.copyProperties(orderEntity, orderDTO);
                    return orderDTO;
                })
                .collect(Collectors.toList());
    }

}
