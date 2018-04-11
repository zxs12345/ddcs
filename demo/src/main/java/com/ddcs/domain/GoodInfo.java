package com.ddcs.domain;

import java.util.List;

public class GoodInfo {
    private Integer goodid;

    private String name;

    private String discount;

    private Float promotionpice;

    private Float originalprice;

    private Integer monthlysales;

    private Integer totalsales;

    private Integer totalevaluate;

    private String detailimg;

    private String flavor;

    private String packing;

    private String coupon;
    private int stock;
    
public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}

private List<Img> imgs;
    public List<Img> getImgs() {
	return imgs;
}



@Override
	public String toString() {
		return "GoodInfo [goodid=" + goodid + ", name=" + name + ", discount=" + discount + ", promotionpice="
				+ promotionpice + ", originalprice=" + originalprice + ", monthlysales=" + monthlysales
				+ ", totalsales=" + totalsales + ", totalevaluate=" + totalevaluate + ", detailimg=" + detailimg
				+ ", flavor=" + flavor + ", packing=" + packing + ", coupon=" + coupon + ", imgs=" + imgs + "]";
	}



public void setImgs(List<Img> imgs) {
	this.imgs = imgs;
}



	public Integer getGoodid() {
        return goodid;
    }

  

	public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public Float getPromotionpice() {
        return promotionpice;
    }

    public void setPromotionpice(Float promotionpice) {
        this.promotionpice = promotionpice;
    }

    public Float getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Float originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getMonthlysales() {
        return monthlysales;
    }

    public void setMonthlysales(Integer monthlysales) {
        this.monthlysales = monthlysales;
    }

    public Integer getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(Integer totalsales) {
        this.totalsales = totalsales;
    }

    public Integer getTotalevaluate() {
        return totalevaluate;
    }

    public void setTotalevaluate(Integer totalevaluate) {
        this.totalevaluate = totalevaluate;
    }

    public String getDetailimg() {
        return detailimg;
    }

    public void setDetailimg(String detailimg) {
        this.detailimg = detailimg == null ? null : detailimg.trim();
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor == null ? null : flavor.trim();
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing == null ? null : packing.trim();
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon == null ? null : coupon.trim();
    }
}