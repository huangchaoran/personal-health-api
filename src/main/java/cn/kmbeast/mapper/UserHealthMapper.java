package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.UserHealthQueryDto;
import cn.kmbeast.pojo.entity.UserHealth;
import cn.kmbeast.pojo.vo.UserHealthVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserHealthMapper {
  void save(UserHealth userHealth);
  void update(UserHealth userHealth);
  void batchDelete(@Param(value = "ids") List<Long> ids);
  List<UserHealthVO> query(UserHealthQueryDto userHealthQueryDto);
  Integer queryCount(UserHealthQueryDto userHealthQueryDto);
}
