package service;

import model.User;
import utils.Pager;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	public int count();
	
	public List<User> all(@Param("pager") Pager pager);

    public User getUserById(Integer id);
    
    public void insert(User user);
    
    public void update(@Param("id") Integer id, @Param("user") User user);
    
    public int delete(Integer id);
}
