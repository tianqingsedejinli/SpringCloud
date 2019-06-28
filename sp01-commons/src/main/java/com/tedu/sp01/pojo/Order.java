package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	//¶©µ¥id
	private String id;
	//ÓÃ»§
	private User user;
	private List<Item> items;
	//22222222
}
