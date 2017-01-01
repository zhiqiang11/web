package Mapper;

import Domain.BaseDomain;
import Domain.MemDetailDomain;
import Domain.MemoDomain;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */
@Mapper
public interface MemoTourMapper {
   /* @Mapper
    public interface StudentMapper {

        @Select("SELECT * FROM STUDENTS WHERE name = #{name}")
        List<Student> findAllByName(@Param("name") String name);

    }*/

    /**
     * 根据路书id获得路书基本信息
     * @param memid
     * @return
     */
   @Select("SELECT * FROM memo WHERE memid=#{memid} ")
    MemoDomain getMemoInfo(@Param("memid") String memid);

    /**
     * 根据路书id获取景点信息
     * @param memid
     * @return
     */
    @Select("SELECT * FROM section WHERE memid=#{memid} ")
    List<BaseDomain> getSectionInfo(@Param("memid") String memid);

    /**
     * 根据路书id获得酒店信息
     * @param memid
     * @return
     */
    @Select("SELECT * FROM hotel WHERE memid=#{memid} ")
    List<BaseDomain> getHotelInfo(@Param("memid") String memid);

    /**
     * 根据路书id获取饭店信息
     * @param memid
     * @return
     */
    @Select("SELECT * FROM restaurant WHERE memid=#{memid} ")
    List<BaseDomain> getRestaurantInfo(@Param("memid") String memid);

    /**
     * 根据城市名称获取相关路书id列表
     * @param cityname
     * @return
     */
    @Select("SELECT memid FROM memo WHERE cityname=#{cityname} ")
    List<String> getMemidlist(@Param("cityname") String cityname);

 /**
  * 插入路书基本信息
  * @param memoDomain
  */
 @Insert("INSERT INTO memo(memid,id,cityname,describtion) VALUS(#{memid},#{id},#{cityname},#{describtion})")
    void insertMemoInfo(@Param("memoDomain") MemoDomain memoDomain);

 /**
  * 插入景点信息
  * @param sectionDomain
  */
 @Insert("INSERT INTO section(id,name,lat,lon,memid) VALUS(#{id},#{name},#{lat},#{lon},#{memid})")
    void insertSectionInfo(@Param("sectionDomain") BaseDomain sectionDomain);

 /**
  * 插入饭店信息
  * @param restaurantDomain
  */
 @Insert("INSERT INTO restaurant(id,name,lat,lon,memid) VALUS(#{id},#{name},#{lat},#{lon},#{memid})")
    void insertRestaurantInfo(@Param("restaurantDomain") BaseDomain restaurantDomain);

 /**
  * 插入酒店信息
  * @param hotelDomain
  */
 @Insert("INSERT INTO hotel(id,name,lat,lon,memid) VALUS(#{id},#{name},#{lat},#{lon},#{memid})")
    void insertHotelInfo(@Param("hotelDomain") BaseDomain hotelDomain);

 /**
  * 根据路书id更新路书信息
  * @param
  */
 @Update("UPDATE memo SET describtion=#{describtion} WHERE memid=#{memid}")
     void updateMem(@Param("memid") String memid,@Param("describtion") String describtion);
}
