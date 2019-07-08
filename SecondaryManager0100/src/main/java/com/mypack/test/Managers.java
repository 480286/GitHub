package com.mypack.test;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.mypack.entity.CaiDan_Yi;
import com.mypack.entity.SecondaryMenu;
import com.mypack.service.CaiDan_YiIF;
import com.mypack.service.SecondaryServiceIF;

public class Managers {

	@Autowired
	CaiDan_YiIF caidan_yi;
	
	@Autowired
	SecondaryServiceIF secondaryService;
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		Managers m = new Managers();
		SecondaryMenu menu = new SecondaryMenu();
		CaiDan_Yi menus = new CaiDan_Yi();
		System.out.println("请输入0-6个数：0将会退出系统，1修改一级菜单，2删除一级菜单，3添加一级菜单，4，修改二级菜单，5删除二级菜单，6添加二级菜单");
		int i;
		
		o:while(true) {
			
			System.out.println("请输入数字0-6:");
			
			i=input.nextInt();
			
			//�޸�һ��
			if(i==1) {
				System.out.println("请输入想要修改的一级菜单的id值和四个字段");
				menus.setId(input.nextInt());
				menus.setValuename1(input.nextLine());
				menus.setValuename2(input.nextLine());
				menus.setValuename3(input.nextLine());
				menus.setValuename4(input.nextLine());
				
				m.updateCaiDan(menus);
			}
			
			//ɾ��һ��
			else if(i==2) {
				System.out.println("请输入想要删除的一级菜单id");
				m.deleteCaiDan(input.nextInt());
			}
				
			//���һ��
			else if(i==3) {
				System.out.println("请输入想要添加的一级菜单的四个字段");
				menus.setValuename1(input.nextLine());
				menus.setValuename2(input.nextLine());
				menus.setValuename3(input.nextLine());
				menus.setValuename4(input.nextLine());
				
				m.addCaiDan(menus);
			}
			
			//�޸Ķ���
			else if(i==4) {
				System.out.println("请输入想要修改的二级菜单id和八个字段");
				menu.setId(input.nextInt());
				menu.setValuename1(input.nextLine());
				menu.setValuename2(input.nextLine());
				menu.setValuename3(input.nextLine());
				menu.setValuename4(input.nextLine());
				menu.setValuename5(input.nextLine());
				menu.setValuename6(input.nextLine());
				menu.setValuename7(input.nextLine());
				menu.setValuename8(input.nextLine());
				menu.setA_id(input.nextInt());
				
				m.updateMenu(menu);
			}
			
			//ɾ������
			else if(i==5) {
				System.out.println("请输入想要删除的二级菜单id");
				m.deleteMenu(input.nextInt());
			}
						
			//��Ӷ���
			else if(i==6) {
				System.out.println("请输入想要添加的二级菜单八个字段和与一级菜单的链表id");
				menu.setValuename1(input.nextLine());
				menu.setValuename2(input.nextLine());
				menu.setValuename3(input.nextLine());
				menu.setValuename4(input.nextLine());
				menu.setValuename5(input.nextLine());
				menu.setValuename6(input.nextLine());
				menu.setValuename7(input.nextLine());
				menu.setValuename8(input.nextLine());
				menu.setA_id(input.nextInt());
				
				m.addMenu(menu);
			}
			
			else if(i==0) {
				break o;
			}
		}
		
		
		
	}

	//一级菜单查询单个
	public CaiDan_Yi queryOneCaiDan(int id) {
		return caidan_yi.queryOneCaiDan(id);
	}
	
	//一级菜单修改单个
	public boolean updateCaiDan(CaiDan_Yi menus) {
		return caidan_yi.updateCaiDan(menus);
	}
	
	//一级菜单添加单个
	public boolean addCaiDan(CaiDan_Yi menus) {
		return caidan_yi.addCaiDan(menus);
	}
	
	//一级菜单删除单个
	public boolean deleteCaiDan(int id) {
		return caidan_yi.deleteCaiDan(id);
	}
	
	//二级菜单查询单个
	public SecondaryMenu queryOneMenu(int id) {
		return secondaryService.queryOneMenuById(id);
	}
	
	//二级菜单修改单个
	public boolean updateMenu(SecondaryMenu menu) {
		
		return secondaryService.updateMenu(menu);
	}
	
	//二级菜单添加单个
	public boolean addMenu(SecondaryMenu menu) {
		return secondaryService.addMenu(menu);
	}
	
	//二级菜单删除单个
	public boolean deleteMenu(int id) {
		return secondaryService.deleteMenu(id);
	}

}
