package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.StoreImage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: ImageStoreMapper
 * @Date: 2024/9/27  下午11:24
 */
@Mapper
public interface ImageStoreMapper extends BaseMapper<StoreImage> {
}
