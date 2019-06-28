package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	//∂©µ•id
	private String id;
	//”√ªß
	private User user;
	private List<Item> items;
	//3333333
}
