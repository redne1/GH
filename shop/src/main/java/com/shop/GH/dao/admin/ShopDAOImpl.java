package com.shop.GH.dao.admin;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.shop.GH.vo.admin.ShopVO;


@Repository
public class ShopDAOImpl implements ShopDAO{
	
	@Inject
	private SqlSessionTemplate sql;

	
	
	/**
	 * @상품목록
	 */
	@Override
	public List<ShopVO> listShop() {
		// TODO Auto-generated method stub
		return sql.selectList("shopAdmin.shopList");
	}

}
