package com.project.demo.controller;

import com.project.demo.entity.TicketCenter;
import com.project.demo.service.TicketCenterService;
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
 *车票中心：(TicketCenter)表控制层
 *
 */
@RestController
@RequestMapping("/ticket_center")
public class TicketCenterController extends BaseController<TicketCenter,TicketCenterService> {

    /**
     *车票中心对象
     */
    @Autowired
    public TicketCenterController(TicketCenterService service) {
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
