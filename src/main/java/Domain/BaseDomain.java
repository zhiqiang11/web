package Domain;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */
public class BaseDomain {
    /**
     * id
     */
    private  String id;
    /**
     * 路书id
     */
    private String memid;
    /**
     * 名称
     */
    private String name;
    /**
     * 经度
     */
    private String lat;
    /**
     * 纬度
     */
    private String lon;
    /**
     * 获取id
     */
    public String getId(){
        return id;
    }
    /**
     * 设置id
     */
    public void setId(String id){
        this.id=id;
    }
    /**
     * 获取路书id
     */
    public String getMemid(){
        return memid;
    }
    /**
     * 设置路书id
     */
    public void setMemid(String memid){
        this.memid=memid;
    }
    /**
     * 获取名称
     */
    public String getName(){
        return name;
    }
    /**
     * 设置名称
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * 获取经度
     */
    public String getLat(){
        return lat;
    }
    /**
     * 设置经度
     */
    public void setLat(String lat){
        this.lat=lat;
    }
    /**
     * 获取纬度
     */
    public String getLon(){
        return lon;
    }
    /**
     * 设置纬度
     */
    public void setLon(String lon){
        this.lon=lon;
    }
}
