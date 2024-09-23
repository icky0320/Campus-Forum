package com.example.entity.vo.request;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: PrivacySaveVO
 * @Date: 2024/9/23  下午5:19
 */
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class PrivacySaveVO {
    @Pattern(regexp = "(phone|emial|qq|wx|gender)")
    String type;
    boolean status;
}
