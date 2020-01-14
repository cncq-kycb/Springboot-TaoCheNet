package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBusinessMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Service.PostService;

@Component
public class PostServiceImpl implements PostService {

	@Autowired
	CarInfoMapper carInfoMapper;
	@Autowired
	CarBusinessMapper carBusinessMapper;

	@Override
	public CarInfoWithBLOBs getPostDetails(Long pid) {
		CarInfoExample example = new CarInfoExample();
		example.or().andPidEqualTo(pid);
		List<CarInfoWithBLOBs> result = carInfoMapper.selectByExampleWithBLOBs(example);
		if (result.size() != 0) {
			return result.get(0);
		}
		return new CarInfoWithBLOBs();
	}

	@Override
	public CarBusiness getSalerInfo(Long pid) {
		CarInfoExample carInfoExample = new CarInfoExample();
		carInfoExample.or().andPidEqualTo(pid);
		List<CarInfoWithBLOBs> result = carInfoMapper.selectByExampleWithBLOBs(carInfoExample);
		if (result.size() != 0) {
			Long l_sid = result.get(0).getSid();
			CarBusinessExample carBusinessExample = new CarBusinessExample();
			carBusinessExample.or().andSidEqualTo(l_sid.intValue());
			List<CarBusiness> carBusinesses = carBusinessMapper.selectByExample(carBusinessExample);
			if (carBusinesses.size() != 0) {
				return carBusinesses.get(0);
			}
			return null;
		}
		return null;
	}

}
