package top.windope.seatastudy.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDTO {

    private Long id;

    private String orderCode;

    private String productName;

    private BigDecimal price;

}
