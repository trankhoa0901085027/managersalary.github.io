package khoatd.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANG KHOA
 */
public class AccountUserDto {
  private  String username;
  private  String password;
   private String fullname;
   private String nickname;
   private Boolean isDelete;

    public AccountUserDto(String username, String password, String fullname, String nickname, Boolean isDelete) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.nickname = nickname;
        this.isDelete = isDelete;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
   
   
}
