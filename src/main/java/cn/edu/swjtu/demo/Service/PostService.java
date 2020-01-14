package cn.edu.swjtu.demo.Service;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;

@Service
public interface PostService {

	CarInfoWithBLOBs getPostDetails(Long pid);

}
