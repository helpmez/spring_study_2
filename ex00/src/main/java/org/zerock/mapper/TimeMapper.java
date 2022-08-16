package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface TimeMapper {
	@Select("Select sysdate from dual")
	public String getTime1();
	
	public String getTime2();
}
