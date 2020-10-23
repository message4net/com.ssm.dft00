package cn.ssm.service.impl;
import javax.annotation.Resource;  

import org.springframework.stereotype.Service;  
import cn.ssm.dao.User_tMapper;
import cn.ssm.model.User_t;
import cn.ssm.service.IUserService;
  
@Service  
public class UserServerImpl implements IUserService{
	   @Resource  
	    private User_tMapper user_tMapper;  
	    
	    public User_t getUser_tById(int userId) {  
	        // TODO Auto-generated method stub  
	        return this.user_tMapper.selectByPrimaryKey(userId);  
	    }  
	  
}
