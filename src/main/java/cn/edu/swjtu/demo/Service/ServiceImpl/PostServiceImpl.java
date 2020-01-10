package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Service.PostService;

@Component
public class PostServiceImpl implements PostService {

	@Autowired
	CarInfoMapper carInfoMapper;

	@Override
	public CarInfo getPostDetails(Long pid) {
		CarInfoExample example = new CarInfoExample();
		example.or().andPidEqualTo(pid);
		List<CarInfo> result = carInfoMapper.selectByExample(example);
		if (result.size() != 0) {
			return result.get(0);
		}
		return new CarInfo();
	}

}
