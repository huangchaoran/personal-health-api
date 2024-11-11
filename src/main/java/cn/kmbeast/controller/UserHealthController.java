package cn.kmbeast.controller;

import cn.kmbeast.aop.Pager;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.UserHealthQueryDto;
import cn.kmbeast.pojo.entity.UserHealth;
import cn.kmbeast.pojo.vo.UserHealthVO;
import cn.kmbeast.service.UserHealthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/userHealth")

public class UserHealthController {
    @Resource
   private UserHealthService userHealthService;
   @PostMapping(value = "/save")

    public Result<Void> save(@RequestBody UserHealth userHealth) {
       userHealth.setCreateTime(LocalDateTime.now());
       return userHealthService.save(userHealth);
    }
    @PutMapping(value = "/update")
    public Result<Void> upadte(@RequestBody UserHealth userHealth) {
       return userHealthService.update(userHealth);
    }
    @PostMapping(value = "/batchDelete")
    public Result<Void> batchDelete(@RequestBody List<Long> ids) {
       return userHealthService.batchDelete(ids);
    }
    @Pager
    @PostMapping("/query")
    public Result<List<UserHealthVO>> query(@RequestBody UserHealthQueryDto userHealthQueryDto){
       return userHealthService.query(userHealthQueryDto);
    }

}
