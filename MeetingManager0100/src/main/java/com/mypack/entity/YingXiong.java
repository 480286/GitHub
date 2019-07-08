package com.mypack.entity;

public class YingXiong {

	int id;
	String name;
	String xingbie;
	String tel;
	String gongsi;
	String bumen;
	String zhiwu;
	String shengri;
	String qq;
	String weixin;
	String youxiang;
	String weibo;
	public YingXiong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public YingXiong(String name, String xingbie, String tel, String gongsi,
			String bumen, String zhiwu, String shengri, String qq,
			String weixin, String youxiang, String weibo) {
		super();
		this.name = name;
		this.xingbie = xingbie;
		this.tel = tel;
		this.gongsi = gongsi;
		this.bumen = bumen;
		this.zhiwu = zhiwu;
		this.shengri = shengri;
		this.qq = qq;
		this.weixin = weixin;
		this.youxiang = youxiang;
		this.weibo = weibo;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getXingbie() {
		return xingbie;
	}
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGongsi() {
		return gongsi;
	}
	public void setGongsi(String gongsi) {
		this.gongsi = gongsi;
	}
	public String getBumen() {
		return bumen;
	}
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	public String getZhiwu() {
		return zhiwu;
	}
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	public String getShengri() {
		return shengri;
	}
	public void setShengri(String shengri) {
		this.shengri = shengri;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getYouxiang() {
		return youxiang;
	}
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	public String getWeibo() {
		return weibo;
	}
	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}
	@Override
	public String toString() {
		return "YingXiongDao [id=" + id + ", name=" + name + ", xingbie="
				+ xingbie + ", tel=" + tel + ", gongsi=" + gongsi + ", bumen="
				+ bumen + ", zhiwu=" + zhiwu + ", shengri=" + shengri + ", qq="
				+ qq + ", weixin=" + weixin + ", youxiang=" + youxiang
				+ ", weibo=" + weibo + "]";
	}
	
	
}
