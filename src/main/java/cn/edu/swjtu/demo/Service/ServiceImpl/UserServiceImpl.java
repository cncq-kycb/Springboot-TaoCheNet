package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBrandMapper;
import cn.edu.swjtu.demo.Dao.CarClassifyMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.CarPictureMapper;
import cn.edu.swjtu.demo.Dao.CarSeriesMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserInquirePostMapper;
import cn.edu.swjtu.demo.Dao.UserSearchPostMapper;
import cn.edu.swjtu.demo.Dao.UserViewPostMapper;
import cn.edu.swjtu.demo.Pojo.CarBrand;
import cn.edu.swjtu.demo.Pojo.CarBrandExample;
import cn.edu.swjtu.demo.Pojo.CarClassify;
import cn.edu.swjtu.demo.Pojo.CarClassifyExample;
import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoExample.Criteria;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.CarPicture;
import cn.edu.swjtu.demo.Pojo.CarPictureExample;
import cn.edu.swjtu.demo.Pojo.CarSeries;
import cn.edu.swjtu.demo.Pojo.CarSeriesExample;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserInquirePost;
import cn.edu.swjtu.demo.Pojo.UserSearchPost;
import cn.edu.swjtu.demo.Pojo.UserSearchPostExample;
import cn.edu.swjtu.demo.Pojo.UserViewPost;
import cn.edu.swjtu.demo.Service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	UserSearchPostMapper userSearchPostMapper;
	@Autowired
	UserViewPostMapper userViewPostMapper;
	@Autowired
	UserInquirePostMapper userInquirePostMapper;
	@Autowired
	CarInfoMapper carInfoMapper;
	@Autowired
	CarBrandMapper carBrandMapper;
	@Autowired
	CarSeriesMapper carSeriesMapper;
	@Autowired
	CarClassifyMapper carClassifyMapper;
	@Autowired
	CarPictureMapper carPictureMapper;

	@Override
	public boolean login(String username, String password) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
			if (userInfoMapper.selectByExample(example).size() == 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public UserInfo getUserInfo(String username) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.setDistinct(true);
			example.or().andUsernameEqualTo(username);
			List<UserInfo> result = userInfoMapper.selectByExample(example);
			if (result.size() != 0) {
				return result.get(0);
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public void viewLog(String cookieid, Long pid) {
		UserViewPost record = new UserViewPost();
		record.setCookieid(cookieid);
		record.setPid(pid);
		record.setTime(new Date());
		try {
			userViewPostMapper.insert(record);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public void inquireLog(String cookieid, Long pid) {
		UserInquirePost record = new UserInquirePost();
		record.setCookieid(cookieid);
		record.setPid(pid);
		record.setTime(new Date());
		try {
			userInquirePostMapper.insert(record);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public List<CarInfoWithBLOBs> showPosts() {
		try {
			CarInfoExample example = new CarInfoExample();
			example.createCriteria();
			List<CarInfoWithBLOBs> result = carInfoMapper.selectByExampleWithBLOBs(example);
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarBrand> getAllCarBrands() {
		try {
			CarBrandExample example = new CarBrandExample();
			example.createCriteria();
			List<CarBrand> result = carBrandMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarSeries> getAllCarSeries() {
		try {
			CarSeriesExample example = new CarSeriesExample();
			example.createCriteria();
			List<CarSeries> result = carSeriesMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarClassify> getAllCarClassifies() {
		try {
			CarClassifyExample example = new CarClassifyExample();
			example.createCriteria();
			List<CarClassify> result = carClassifyMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public void searchLog(String cookieid, Integer selectedBrand, Integer selectedSeries, Integer selectedClassify,
			String selectedPaifang, Integer selectedColor, Integer selectedLicheng) {
		try {
			UserSearchPost record = new UserSearchPost();
			record.setCookieid(cookieid);
			record.setPid(selectedBrand);
			record.setCxid(selectedSeries);
			record.setPaifang(selectedPaifang);
			record.setColorId(selectedColor);
			record.setLicheng(selectedLicheng);
			userSearchPostMapper.insert(record);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	@Override
	public List<CarInfoWithBLOBs> getPostByCondition(Integer selectedBrand, Integer selectedSeries,
			Integer selectedClassify, String selectedPaifang, Integer selectedColor, Integer selectedLicheng) {
		List<CarInfoWithBLOBs> result = carInfoMapper.searchByCondition(selectedBrand, selectedSeries, selectedClassify,
				selectedPaifang, selectedColor, selectedLicheng);
		try {
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarInfoWithBLOBs> getRecommend() {
		try {
			List<CarInfoWithBLOBs> result = carInfoMapper.selectRandom();
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarPicture> getCarPicture(Long pid) {
		try {
			CarPictureExample example = new CarPictureExample();
			example.or().andPidEqualTo(pid.intValue());
			List<CarPicture> result = carPictureMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

}
