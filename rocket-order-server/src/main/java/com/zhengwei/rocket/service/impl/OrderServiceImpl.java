package com.zhengwei.rocket.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengwei.rocket.entity.Orders;
import com.zhengwei.rocket.mapper.OrdersMapper;
import com.zhengwei.rocket.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1514:17
 **/
@Service
public class OrderServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrderService {
}
