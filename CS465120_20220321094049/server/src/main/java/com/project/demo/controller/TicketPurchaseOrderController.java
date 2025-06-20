package com.project.demo.controller;

import com.project.demo.entity.TicketPurchaseOrder;
import com.project.demo.service.TicketPurchaseOrderService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *购票订单：(TicketPurchaseOrder)表控制层
 *
 */
@RestController
@RequestMapping("/ticket_purchase_order")
public class TicketPurchaseOrderController extends BaseController<TicketPurchaseOrder,TicketPurchaseOrderService> {

    /**
     *购票订单对象
     */
    @Autowired
    public TicketPurchaseOrderController(TicketPurchaseOrderService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
