package com.zhelazhela.services.impl;

import com.zhelazhela.db.dao.GoodsTrackDAO;
import com.zhelazhela.db.model.GoodsTrack;
import com.zhelazhela.services.GoodsRelationService;
import com.zhelazhela.services.GoodsTagService;

public class GoodsRelationServiceImpl implements GoodsRelationService {
	
	private GoodsTrackDAO goodsTrackDAO;
	
	private GoodsTagService goodsTagService;

	public void setGoodsTrackDAO(GoodsTrackDAO goodsTrackDAO) {
		this.goodsTrackDAO = goodsTrackDAO;
	}

	public void setGoodsTagService(GoodsTagService goodsTagService) {
		this.goodsTagService = goodsTagService;
	}

	@Override
	public GoodsTrack track(long goodsId, String sn, long userId, float rate,
			long tag, int visibility ,int track_price) throws Exception {
		long tagId = 0;
		if(goodsTagService.checkTag(tag, userId)){
			tagId = tag;
		}
		GoodsTrack gt = new GoodsTrack();
		gt.setGoodsId(goodsId);
		gt.setGoodsTagId(tagId);
		gt.setRatting(rate);
		gt.setSn(sn);
		if(track_price>0){
			gt.setTrackprice(true);
		}else{
			gt.setTrackprice(false);
		}
		gt.setUpdateTime(new java.util.Date());
		gt.setUserId(userId);
		gt.setVisibility(visibility);
		goodsTrackDAO.insertSelective(gt);
		return gt;
	}

	@Override
	public GoodsTrack track(long goodsId, String sn, long userId, float rate,
			String tag, int visibility ,int track_price) throws Exception {
		long tagId = 0;
		if(tag!=null&&tag.trim().length()>0){
			tagId = goodsTagService.addTag(tag, userId).getId();
		}
		GoodsTrack gt = new GoodsTrack();
		gt.setGoodsId(goodsId);
		gt.setGoodsTagId(tagId);
		gt.setRatting(rate);
		gt.setSn(sn);
		if(track_price>0){
			gt.setTrackprice(true);
		}else{
			gt.setTrackprice(false);
		}
		gt.setUpdateTime(new java.util.Date());
		gt.setUserId(userId);
		gt.setVisibility(visibility);
		goodsTrackDAO.insertSelective(gt);
		return gt;
	}


}
