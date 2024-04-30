package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * create table tbl_member_auth (
     userid varchar2(50) not null,
     auth varchar2(50) not null,
     constraint fk_member_auth foreign key(userid) references tbl_member(userid)
);
 */
@Data
@AllArgsConstructor
public class AuthVO {
	
	private String userid;
	private String auth;
	
}
