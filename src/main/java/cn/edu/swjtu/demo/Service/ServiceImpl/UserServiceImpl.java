package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBrandMapper;
import cn.edu.swjtu.demo.Dao.CarBusinessMapper;
import cn.edu.swjtu.demo.Dao.CarClassifyMapper;
import cn.edu.swjtu.demo.Dao.CarColorMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.CarPictureMapper;
import cn.edu.swjtu.demo.Dao.CarSeriesMapper;
import cn.edu.swjtu.demo.Dao.RecommenderListMapper;
import cn.edu.swjtu.demo.Dao.TransactionRecordMapper;
import cn.edu.swjtu.demo.Dao.UserChatMapper;
import cn.edu.swjtu.demo.Dao.UserDriveMapper;
import cn.edu.swjtu.demo.Dao.UserFavoriteMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserInquirePostMapper;
import cn.edu.swjtu.demo.Dao.UserSearchPostMapper;
import cn.edu.swjtu.demo.Dao.UserViewPostMapper;
import cn.edu.swjtu.demo.Pojo.CarBrand;
import cn.edu.swjtu.demo.Pojo.CarBrandExample;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import cn.edu.swjtu.demo.Pojo.CarClassify;
import cn.edu.swjtu.demo.Pojo.CarClassifyExample;
import cn.edu.swjtu.demo.Pojo.CarColor;
import cn.edu.swjtu.demo.Pojo.CarColorExample;
import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.CarPicture;
import cn.edu.swjtu.demo.Pojo.CarPictureExample;
import cn.edu.swjtu.demo.Pojo.CarSeries;
import cn.edu.swjtu.demo.Pojo.CarSeriesExample;
import cn.edu.swjtu.demo.Pojo.RecommenderList;
import cn.edu.swjtu.demo.Pojo.RecommenderListExample;
import cn.edu.swjtu.demo.Pojo.TransactionRecord;
import cn.edu.swjtu.demo.Pojo.TransactionRecordExample;
import cn.edu.swjtu.demo.Pojo.UserChat;
import cn.edu.swjtu.demo.Pojo.UserDrive;
import cn.edu.swjtu.demo.Pojo.UserFavorite;
import cn.edu.swjtu.demo.Pojo.UserFavoriteExample;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserInquirePost;
import cn.edu.swjtu.demo.Pojo.UserSearchPost;
import cn.edu.swjtu.demo.Pojo.UserViewPost;
import cn.edu.swjtu.demo.Service.UserService;
import cn.edu.swjtu.demo.Utils.Utils;

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
	CarColorMapper carColorMapper;
	@Autowired
	CarPictureMapper carPictureMapper;
	@Autowired
	CarBusinessMapper carBusinessMapper;
	@Autowired
	UserFavoriteMapper userFavoriteMapper;
	@Autowired
	RecommenderListMapper recommenderListMapper;
	@Autowired
	UserDriveMapper userDriveMapper;
	@Autowired
	UserChatMapper userChatMapper;
	@Autowired
	TransactionRecordMapper transactionRecordMapper;

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
	public void viewLog(String cookieid, Long pid, Integer viewType) {
		UserViewPost record = new UserViewPost();
		record.setCookieid(cookieid);
		record.setPid(pid);
		record.setTime(new Date());
		record.setViewType(viewType);
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
	public int driveLog(String cookieid, Long pid) {
		try {
			UserDrive userDrive = new UserDrive();
			userDrive.setCookieid(cookieid);
			userDrive.setPid(pid);
			userDrive.setTime(new Date());
			userDriveMapper.insert(userDrive);
			return 1;
		} catch (Exception e) {
			System.err.println(e);
		}
		return 0;
	}

	@Override
	public int chatLog(String cookieid, Long pid) {
		try {
			UserChat userChat = new UserChat();
			userChat.setCookieid(cookieid);
			userChat.setPid(pid);
			userChat.setTime(new Date());
			userChatMapper.insert(userChat);
			return 1;
		} catch (Exception e) {
			System.err.println(e);
		}
		return 0;
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
	public List<CarColor> getAllCarColor() {
		try {
			CarColorExample example = new CarColorExample();
			example.createCriteria();
			List<CarColor> result = carColorMapper.selectByExample(example);
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
			String selectedPaifang, Integer selectedColor, Integer selectedLichengLeft, Integer selectedLichengRight,
			Integer selectedPriceLeft, Integer selectedPriceRight) {
		try {
			UserSearchPost record = new UserSearchPost();
			record.setCookieid(cookieid);
			if (selectedBrand != null) {
				record.setPid(selectedBrand);
			}
			if (selectedSeries != null) {
				record.setCxid(selectedSeries);
			}
			if (selectedPaifang != null) {
				record.setPaifang(selectedPaifang);
			}
			if (selectedColor != null) {
				record.setColorId(selectedColor);
			}
			if (selectedLichengLeft != null) {
				record.setLichengLeft(selectedLichengLeft);
			}
			if (selectedLichengRight != null) {
				record.setLichengRight(selectedLichengRight);
			}
			if (selectedPriceLeft != null) {
				record.setPriceLeft(selectedPriceLeft);
			}
			if (selectedPriceRight != null) {
				record.setPriceRight(selectedPriceRight);
			}
			record.setTime(new Date());
			userSearchPostMapper.insert(record);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	@Override
	public List<CarInfoWithBLOBs> getPostByCondition(Integer selectedBrand, Integer selectedSeries,
			Integer selectedClassify, String selectedPaifang, Integer selectedColor, Integer selectedLichengLeft,
			Integer selectedLichengRight, Integer selectedPriceLeft, Integer selectedPriceRight) {
		List<CarInfoWithBLOBs> result = carInfoMapper.searchByCondition(selectedBrand, selectedSeries, selectedClassify,
				selectedPaifang, selectedColor, selectedLichengLeft, selectedLichengRight, selectedPriceLeft,
				selectedPriceRight);
		try {
			if (result.size() != 0) {
				return result;
			}
			result = new ArrayList<CarInfoWithBLOBs>();
			CarInfoWithBLOBs item = new CarInfoWithBLOBs();
			item.setName("-1");
			result.add(item);
			return result;
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
			return new ArrayList<CarInfoWithBLOBs>();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarInfoWithBLOBs> getRecommend(String cookieid) {
		try {
			RecommenderListExample recommendExample = new RecommenderListExample();
			recommendExample.or().andCookieidEqualTo(cookieid);
			List<RecommenderList> pids = recommenderListMapper.selectByExampleWithBLOBs(recommendExample);
			if (pids.size() != 0) {
				List<String> pidList = Utils.splitJson(pids.get(0).getRecommenderPids());
				List<Integer> indexs = Utils.getIndex(pidList.size());
				List<CarInfoWithBLOBs> info = new ArrayList<CarInfoWithBLOBs>();
				for (int i = 0; i < indexs.size(); i++) {
					Long pid = Long.parseLong(pidList.get(indexs.get(i)));
					CarInfoExample carInfoExample = new CarInfoExample();
					carInfoExample.or().andPidEqualTo(pid);
					info.addAll(carInfoMapper.selectByExampleWithBLOBs(carInfoExample));
				}
				return info;
			} else {
				return new ArrayList<CarInfoWithBLOBs>();
			}
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

	@Override
	public String getBusinessTelFromPost(Long pid) {
		try {
			CarInfoExample carExample = new CarInfoExample();
			carExample.or().andPidEqualTo(pid);
			List<CarInfo> carInfo = carInfoMapper.selectByExample(carExample);
			if (carInfo.size() == 0) {
				return null;
			}
			Long l_sid = carInfo.get(0).getSid();
			CarBusinessExample businessExample = new CarBusinessExample();
			businessExample.or().andSidEqualTo((Integer) l_sid.intValue());
			List<CarBusiness> carBusinesses = carBusinessMapper.selectByExample(businessExample);
			if (carBusinesses.size() == 0) {
				return null;
			}
			return carBusinesses.get(0).getTel();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public int confirmFavorite(String cookieid, Long pid) {
		try {
			UserFavorite record = new UserFavorite();
			record.setCookieid(cookieid);
			record.setPid(pid);
			record.setFavoriteTime(new Date());
			userFavoriteMapper.insert(record);
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	@Override
	public int cancelFavorite(String cookieid, Long pid) {
		try {
			UserFavoriteExample example = new UserFavoriteExample();
			example.or().andCookieidEqualTo(cookieid).andPidEqualTo(pid);
			userFavoriteMapper.deleteByExample(example);
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	@Override
	public List<CarInfoWithBLOBs> getFavoriteList(String cookieid) {
		try {
			UserFavoriteExample userFavoriteExample = new UserFavoriteExample();
			userFavoriteExample.or().andCookieidEqualTo(cookieid);
			List<UserFavorite> userFavorites = userFavoriteMapper.selectByExample(userFavoriteExample);
			if (userFavorites.size() > 0) {
				List<CarInfoWithBLOBs> result = new ArrayList<CarInfoWithBLOBs>();
				for (UserFavorite userFavorite : userFavorites) {
					CarInfoExample carInfoExample = new CarInfoExample();
					carInfoExample.or().andPidEqualTo(userFavorite.getPid());
					result.addAll(carInfoMapper.selectByExampleWithBLOBs(carInfoExample));
				}
				return result;
			}
			return new ArrayList<CarInfoWithBLOBs>();
		} catch (Exception e) {
			System.err.println(e);
			return new ArrayList<CarInfoWithBLOBs>();
		}
	}

	@Override
	public HashMap<String, Object> getRecommendCarList(Long pid) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		List<BigDecimal> recordPrice = new ArrayList<BigDecimal>();
		List<Date> recordTime = new ArrayList<Date>();
		CarInfoExample carInfoExample = new CarInfoExample();
		carInfoExample.or().andPidEqualTo(pid);
		try {
			List<CarInfoWithBLOBs> carInfoWithBLOBs = carInfoMapper.selectByExampleWithBLOBs(carInfoExample);
			if (carInfoWithBLOBs.size() != 0) {
				CarInfo carInfo = carInfoWithBLOBs.get(0);
				carInfoExample.clear();
				carInfoExample.or().andSeriesIdEqualTo(carInfo.getSeriesId()).andBrandIdEqualTo(carInfo.getBrandId());
				List<CarInfoWithBLOBs> carInfos = carInfoMapper.selectByExampleWithBLOBs(carInfoExample);
				if (carInfos.size() != 0) {
					data.put("CarInfo", carInfos);
					// 历史成交价
					for (CarInfoWithBLOBs item : carInfos) {
						TransactionRecordExample transactionRecordExample = new TransactionRecordExample();
						transactionRecordExample.or().andPidEqualTo(item.getPid()).andTransactionStatusEqualTo(1);
						List<TransactionRecord> transactionRecords = transactionRecordMapper
								.selectByExample(transactionRecordExample);
						if (transactionRecords.size() != 0) {
							recordPrice.add(transactionRecords.get(0).getPrice());
							recordTime.add(transactionRecords.get(0).getRecordTime());
						}
					}
					// 历史成交记录排序
					for (int i = 0; i < recordTime.size() - 1; i++) {
						for (int j = i + 1; j < recordTime.size(); j++) {
							if (recordTime.get(i).after(recordTime.get(j))) {
								Date tempDate = recordTime.get(i);
								BigDecimal tempDecimal = recordPrice.get(i);
								recordTime.set(i, recordTime.get(j));
								recordPrice.set(i, recordPrice.get(j));
								recordTime.set(j, tempDate);
								recordPrice.set(j, tempDecimal);
							}
						}
					}
					data.put("RecordPrice", recordPrice);
					data.put("RecordTime", recordTime);
				}
			}
			return data;
		} catch (Exception e) {
			System.err.println(e);
			return data;
		}
	}

	@Override
	public int buyCar(Long pid, String cookieid, BigDecimal price, int buyType) {
		try {
			TransactionRecord record = new TransactionRecord();
			record.setCookieid(cookieid);
			record.setPid(pid);
			record.setPrice(price);
			record.setTransactionStatus(0);
			record.setTransactionType(buyType);
			record.setRecordTime(new Date());
			transactionRecordMapper.insert(record);
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

}
