package service;

import dto.UserInfoDTO;

public interface IUserInfoService {

    // 아이디 중복체크
    UserInfoDTO getUserIdExists(UserInfoDTO pDTO) throws Exception;

    // 이메일 중복체크
    UserInfoDTO getUserEmailExists(UserInfoDTO pDTO) throws Exception;

    // 닉네임 중복체크
    UserInfoDTO getUserNickExists(UserInfoDTO pDTO) throws Exception;

    //회원가입
    int insertUserInfo(UserInfoDTO pDTO) throws Exception;
}
