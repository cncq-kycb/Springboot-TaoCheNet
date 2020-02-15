package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBusinessMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.UserFavoriteMapper;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.UserFavorite;
import cn.edu.swjtu.demo.Pojo.UserFavoriteExample;
import cn.edu.swjtu.demo.Service.PostService;

@Component
public class PostServiceImpl implements PostService {

	@Autowired
	CarInfoMapper carInfoMapper;
	@Autowired
	CarBusinessMapper carBusinessMapper;
	@Autowired
	UserFavoriteMapper userFavoriteMapper;

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
	public CarInfoWithBLOBs getPostDetails(String cookieid, Long pid) {
		CarInfoExample example = new CarInfoExample();
		example.or().andPidEqualTo(pid);
		List<CarInfoWithBLOBs> results = carInfoMapper.selectByExampleWithBLOBs(example);
		if (results.size() == 0) {
			return new CarInfoWithBLOBs();
		}
		CarInfoWithBLOBs result = results.get(0);
		UserFavoriteExample userFavoriteExample = new UserFavoriteExample();
		userFavoriteExample.or().andCookieidEqualTo(cookieid).andPidEqualTo(pid);
		List<UserFavorite> userFavorites = userFavoriteMapper.selectByExample(userFavoriteExample);
		// 未收藏
		if (userFavorites.size() == 0) {
			result.setIsFavorite(0);
			return result;
		}
		// 已收藏
		result.setIsFavorite(1);
		return result;
	}

	@Override
	public CarBusiness getSalerInfo(Long pid) {
		CarInfoExample carInfoExample = new CarInfoExample();
		carInfoExample.or().andPidEqualTo(pid);
		List<CarInfoWithBLOBs> carInfoWithBLOBs = carInfoMapper.selectByExampleWithBLOBs(carInfoExample);
		if (carInfoWithBLOBs.size() != 0) {
			Long l_sid = carInfoWithBLOBs.get(0).getSid();
			CarBusinessExample carBusinessExample = new CarBusinessExample();
			carBusinessExample.or().andSidEqualTo(l_sid.intValue());
			List<CarBusiness> carBusinesses = carBusinessMapper.selectByExample(carBusinessExample);
			if (carBusinesses.size() != 0) {
				CarBusiness result = carBusinesses.get(0);
				if (result.getDescribe() == null || result.getDescribe().equals("")) {
					result.setDescribe("无");
				}
				return result;
			}
			return null;
		}
		return null;
	}

}
