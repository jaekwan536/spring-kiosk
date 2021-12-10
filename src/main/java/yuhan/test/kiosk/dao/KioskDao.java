package yuhan.test.kiosk.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import yuhan.test.kiosk.dto.BasketDto;
import yuhan.test.kiosk.dto.MemberDto;
import yuhan.test.kiosk.dto.MenuDto;
import yuhan.test.kiosk.dto.MenuImgDto;
import yuhan.test.kiosk.dto.OrderDto;
import yuhan.test.util.ConstantTemplate;

public class KioskDao {

	JdbcTemplate template;

	BasketDto basket;
	MemberDto member;
	MenuDto menu;
	MenuImgDto img;
	OrderDto order;

	public void BoardDao() {
		this.template = ConstantTemplate.template;
	}

	// Basket - Start
	public void insertBasket() {
		String sql = "INSERT INTO basket(seq, mem_no, menu_no, count) VALUES (?, ?, ?, ?)";
		template.update(sql, basket.getSeq(), basket.getMem_no(), basket.getMenu_no(), basket.getCount());
	}
	// Basket - END

	// Member - Start
	public void insertMember() {
		String sql = "INSERT INTO member(mem_no, id, pw, cash) VALUES (?, ?, ?, ?)";
		template.update(sql, member.getMem_no(), member.getId(), member.getPw(), member.getCash());
	}
	// Member - END

	// Menu - Start
	public void insertMenu() {
		String sql = "INSERT INTO menu(menu_no, menu_nm, menu_cat, price) VALUES (?, ?, ?, ?)";
		template.update(sql, menu.getMenu_no(), menu.getMenu_nm(), menu.getMenu_cat(), menu.getPrice());
	}
	// Menu - END

	// Menu_img - Start
	public void insertImg() {
		String sql = "INSERT INTO menu_img(seq, menu_no, img_url) VALUES (?, ?, ?)";
		template.update(sql, img.getSeq(), img.getMenu_no(), img.getImg_url());
	}
	// Menu_img - END
	
	// Order - Start
	public void insertOrder() {
		String sql = "INSERT INTO order(seq, mem_no, order_dt, finish_yn) VALUES (?, ?, ?, ?)";
		template.update(sql, order.getSeq(), order.getMem_no(), order.getOrder_dt(), order.getFinish_yn());
	}
	// Order - End
}
