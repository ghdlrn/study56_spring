package org.zerock.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

/*
 * create table tbl_member(
      userid varchar2(50) not null primary key,
      userpw varchar2(100) not null,
      username varchar2(100) not null,
      regdate date default sysdate, 
      updatedate date default sysdate,
      enabled char(1) default '1'
);
 */

@Data
public class MemberVO {
	private String userid, userpw, username;
	private boolean enabled;
	
	private Date regDate, updateDate;
	
	private List<AuthVO> authList;
}
