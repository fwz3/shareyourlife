package com.zhelazhela.db.dao;

import com.zhelazhela.db.model.GoodsTrack;
import com.zhelazhela.db.model.GoodsTrackExample;
import com.zhelazhela.db.model.define.UserGoods;
import com.zhelazhela.db.model.define.UserTrack;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GoodsTrackDAOImpl extends SqlMapClientDaoSupport implements GoodsTrackDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public GoodsTrackDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int countByExample(GoodsTrackExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("goods_track.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int deleteByExample(GoodsTrackExample example) {
        int rows = getSqlMapClientTemplate().delete("goods_track.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int deleteByPrimaryKey(Long id) {
        GoodsTrack key = new GoodsTrack();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("goods_track.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public void insert(GoodsTrack record) {
        getSqlMapClientTemplate().insert("goods_track.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public void insertSelective(GoodsTrack record) {
        getSqlMapClientTemplate().insert("goods_track.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<GoodsTrack> selectByExample(GoodsTrackExample example) {
        List<GoodsTrack> list = getSqlMapClientTemplate().queryForList("goods_track.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public GoodsTrack selectByPrimaryKey(Long id) {
        GoodsTrack key = new GoodsTrack();
        key.setId(id);
        GoodsTrack record = (GoodsTrack) getSqlMapClientTemplate().queryForObject("goods_track.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int updateByExampleSelective(GoodsTrack record, GoodsTrackExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("goods_track.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int updateByExample(GoodsTrack record, GoodsTrackExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("goods_track.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int updateByPrimaryKeySelective(GoodsTrack record) {
        int rows = getSqlMapClientTemplate().update("goods_track.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    public int updateByPrimaryKey(GoodsTrack record) {
        int rows = getSqlMapClientTemplate().update("goods_track.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table goods_track
     *
     * @ibatorgenerated Fri Feb 12 23:38:37 CST 2010
     */
    private static class UpdateByExampleParms extends GoodsTrackExample {
        private Object record;

        public UpdateByExampleParms(Object record, GoodsTrackExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
    
    @SuppressWarnings("unchecked")
	@Override
	public List<UserTrack> loadUserTrack(long goodsId,Long userid, List<Long> beenblocked,int page,int pagesize) {
		// TODO Auto-generated method stub
		java.util.Map<String,Object> map = new java.util.HashMap<String,Object>();
		map.put("goodsId", goodsId);
		if(userid!=null&&userid>0){
			map.put("user_id", userid);
		}
		if(pagesize>0){
			map.put("limit", ""+(page-1)*pagesize+","+pagesize);
		}
		if(beenblocked!=null&&beenblocked.size()>0){
			map.put("been_blocked", beenblocked);
		}
		List<UserTrack> list = (List<UserTrack>)getSqlMapClientTemplate().queryForList("goods_track.selectUserTrackByGoods", map);
		return list;
	}
    
	@Override
	public int countUserTrack(long goodsId,Long userid, List<Long> beenblocked) {
		// TODO Auto-generated method stub
		java.util.Map<String,Object> map = new java.util.HashMap<String,Object>();
		map.put("goodsId", goodsId);
		if(userid!=null&&userid>0){
			map.put("user_id", userid);
		}
		if(beenblocked!=null&&beenblocked.size()>0){
			map.put("been_blocked", beenblocked);
		}
		Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("goods_track.countUserTrackByGoods", map);
		return count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserGoods> loadUserGoodsbyUser(long myid, long destuserId,
			int page, int pagesize) {
		java.util.Map<String,Object> map = new java.util.HashMap<String,Object>();
		map.put("user_id", destuserId);
		if(pagesize>0){
			map.put("limit", ""+(page-1)*pagesize+","+pagesize);
		}
		List<UserGoods> list = (List<UserGoods>)getSqlMapClientTemplate().queryForList("goods_track.selectUserGoodsByUser", map);
		if(myid>0){
			for(UserGoods ug:list){
				if(ug.getTrack_user_id().contains(myid)){
					ug.setIstrack(1);
				}
			}
		}
		return list;
	}

	@Override
	public int countUserGoodsbyUser(long destuserId) {
		java.util.Map<String,Object> map = new java.util.HashMap<String,Object>();
		map.put("user_id", destuserId);
		Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("goods_track.countUserGoodsByUser", map);
        return count;
	}
}