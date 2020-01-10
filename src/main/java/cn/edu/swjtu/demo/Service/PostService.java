package cn.edu.swjtu.demo.Service;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarInfo;

@Service
public interface PostService {

	CarInfo getPostDetails(Long pid);

}
