import com.yjx.springcloud.dao.DeptDao;
import com.yjx.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 21:34
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
public class tst {
    @Autowired
    DeptDao deptDao;
    public static void main(String[] args) {
        new tst().ddd();
    }
    void ddd(){
        Long a = Long.valueOf(1);
        Dept dept = deptDao.queryById(a);
        System.out.println(dept.toString());
    }
}
