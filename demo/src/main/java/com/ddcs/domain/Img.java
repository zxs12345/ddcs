package com.ddcs.domain;

public class Img {
    private Integer imgid;

    private String smallimg;

    private String midimg;

    private String bigimg;

    private Integer spid;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getSmallimg() {
        return smallimg;
    }

    public void setSmallimg(String smallimg) {
        this.smallimg = smallimg == null ? null : smallimg.trim();
    }

    public String getMidimg() {
        return midimg;
    }

    public void setMidimg(String midimg) {
        this.midimg = midimg == null ? null : midimg.trim();
    }

    public String getBigimg() {
        return bigimg;
    }

    public void setBigimg(String bigimg) {
        this.bigimg = bigimg == null ? null : bigimg.trim();
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

	@Override
	public String toString() {
		return "Img [imgid=" + imgid + ", smallimg=" + smallimg + ", midimg=" + midimg + ", bigimg=" + bigimg
				+ ", spid=" + spid + "]";
	}
    
}