package cn.edu.swjtu.demo.Service;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;

@Service
public interface PostService {

	// 帖子详情
	CarInfoWithBLOBs getPostDetails(Long pid);

	// 收藏情况帖子详情
	CarInfoWithBLOBs getPostDetails(String cookieid, Long pid);

	// 帖子卖家
	CarBusiness getSalerInfo(Long pid);

}
