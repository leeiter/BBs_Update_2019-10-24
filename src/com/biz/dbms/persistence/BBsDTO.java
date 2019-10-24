package com.biz.dbms.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BBsDTO {
	private long bs_idpk; 		//	number
	private String bs_date; 	//	varchar2(10 byte)
	private String bs_time; 	//	varchar2(10 byte)
	private String bs_writer; 	//	nvarchar2(20 char)
	private String bs_subject; 	//	nvarchar2(125 char)
	private String bs_text; 	//	nvarchar2(1000 char)
	private int bs_count; 		//	number
}