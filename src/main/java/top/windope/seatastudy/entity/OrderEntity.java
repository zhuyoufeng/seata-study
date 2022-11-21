package top.windope.seatastudy.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Table(name = "tb_order")
@Entity
public class OrderEntity {

    @Id
    @SequenceGenerator(name = "order_seq", sequenceName = "order_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_answer_id")
    private Long id;

    private String orderCode;

    private String productName;

    private BigDecimal price;

}
