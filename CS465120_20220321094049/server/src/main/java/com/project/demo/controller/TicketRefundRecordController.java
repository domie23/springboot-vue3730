package com.project.demo.controller;

import com.project.demo.entity.TicketRefundRecord;
import com.project.demo.service.TicketRefundRecordService;
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
 *退票记录：(TicketRefundRecord)表控制层
 *
 */
@RestController
@RequestMapping("/ticket_refund_record")
public class TicketRefundRecordController extends BaseController<TicketRefundRecord,TicketRefundRecordService> {

    /**
     *退票记录对象
     */
    @Autowired
    public TicketRefundRecordController(TicketRefundRecordService service) {
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
